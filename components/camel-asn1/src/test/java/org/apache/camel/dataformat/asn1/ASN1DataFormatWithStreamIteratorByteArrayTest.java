/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dataformat.asn1;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.ASN1Primitive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ASN1DataFormatWithStreamIteratorByteArrayTest extends CamelTestSupport {

    private ASN1DataFormat asn1;
    private String fileName = "src/test/resources/asn1_data/SMS_SINGLE.tt";

    private void baseASN1DataFormatWithStreamIteratorByteArrayTest(String mockEnpointName, String directEndpointName)
            throws Exception {
        getMockEndpoint(mockEnpointName).expectedMessageCount(1);

        File testFile = new File(fileName);
        ByteArrayInputStream bais = ASN1DataFormatTestHelper.reteriveByteArrayInputStream(testFile);

        template.sendBody(directEndpointName, bais);

        List<Exchange> exchanges = getMockEndpoint(mockEnpointName).getExchanges();

        assertEquals(1, exchanges.size());
        for (Exchange exchange : exchanges) {
            byte[] arr = exchange.getIn().getBody(byte[].class);
            assertTrue(Arrays.equals(FileUtils.readFileToByteArray(testFile), arr));
            assertTrue(ASN1Primitive.fromByteArray(arr) instanceof ASN1Primitive);
        }

        assertMockEndpointsSatisfied();
    }

    @Test
    void testUnmarshalReturnByteArray() throws Exception {
        baseASN1DataFormatWithStreamIteratorByteArrayTest("mock:unmarshal", "direct:unmarshal");
    }

    @Test
    void testUnmarshalReturnByteArrayDsl() throws Exception {
        baseASN1DataFormatWithStreamIteratorByteArrayTest("mock:unmarshaldsl", "direct:unmarshaldsl");
    }

    @Test
    void testUnmarshalMarshalReturnOutputStream() throws Exception {
        baseASN1DataFormatWithStreamIteratorByteArrayTest("mock:marshal", "direct:unmarshalthenmarshal");
    }

    @Test
    void testUnmarshalMarshalReturnOutputStreamDsl() throws Exception {
        baseASN1DataFormatWithStreamIteratorByteArrayTest("mock:marshaldsl", "direct:unmarshalthenmarshaldsl");
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {

                asn1 = new ASN1DataFormat();
                asn1.setUsingIterator(true);

                from("direct:unmarshal").unmarshal(asn1).split(bodyAs(Iterator.class)).streaming().to("mock:unmarshal");
                from("direct:unmarshalthenmarshal").unmarshal(asn1).split(bodyAs(Iterator.class)).streaming().marshal(asn1)
                        .to("mock:marshal");

                from("direct:unmarshaldsl").unmarshal().asn1(true).split(bodyAs(Iterator.class)).streaming()
                        .to("mock:unmarshaldsl");
                from("direct:unmarshalthenmarshaldsl").unmarshal().asn1(true).split(bodyAs(Iterator.class)).streaming()
                        .marshal().asn1(true).to("mock:marshaldsl");
            }
        };
    }

}
