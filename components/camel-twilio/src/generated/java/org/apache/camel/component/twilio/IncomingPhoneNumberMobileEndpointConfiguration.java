
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.incomingphonenumber.Mobile
 */
@ApiParams(apiName = "incoming-phone-number-mobile", apiMethods = "create,read")
@UriParams
@Configurer
public final class IncomingPhoneNumberMobileEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "The SID of the Account that will create the resource")
    private String pathAccountSid;
    @UriParam(description = "The phone number to purchase in E.164 format")
    private com.twilio.type.PhoneNumber phoneNumber;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public com.twilio.type.PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(com.twilio.type.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
