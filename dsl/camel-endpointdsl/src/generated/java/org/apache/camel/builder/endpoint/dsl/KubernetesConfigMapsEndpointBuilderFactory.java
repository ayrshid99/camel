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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations on Kubernetes ConfigMaps and get notified on ConfigMaps
 * changes.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KubernetesConfigMapsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Kubernetes ConfigMap component.
     */
    public interface KubernetesConfigMapsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKubernetesConfigMapsEndpointBuilder advanced() {
            return (AdvancedKubernetesConfigMapsEndpointBuilder) this;
        }
        /**
         * The Kubernetes API Version to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The dns domain, used for ServiceCall EIP.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param dnsDomain the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder dnsDomain(String dnsDomain) {
            doSetProperty("dnsDomain", dnsDomain);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option is a:
         * &lt;code&gt;io.fabric8.kubernetes.client.KubernetesClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param kubernetesClient the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder kubernetesClient(
                io.fabric8.kubernetes.client.KubernetesClient kubernetesClient) {
            doSetProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;io.fabric8.kubernetes.client.KubernetesClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param kubernetesClient the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder kubernetesClient(
                String kubernetesClient) {
            doSetProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * Producer operation to do on Kubernetes.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The port name, used for ServiceCall EIP.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param portName the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder portName(String portName) {
            doSetProperty("portName", portName);
            return this;
        }
        /**
         * The port protocol, used for ServiceCall EIP.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: tcp
         * Group: producer
         * 
         * @param portProtocol the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder portProtocol(
                String portProtocol) {
            doSetProperty("portProtocol", portProtocol);
            return this;
        }
        /**
         * The CA Cert Data.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param caCertData the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder caCertData(String caCertData) {
            doSetProperty("caCertData", caCertData);
            return this;
        }
        /**
         * The CA Cert File.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param caCertFile the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder caCertFile(String caCertFile) {
            doSetProperty("caCertFile", caCertFile);
            return this;
        }
        /**
         * The Client Cert Data.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientCertData the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder clientCertData(
                String clientCertData) {
            doSetProperty("clientCertData", clientCertData);
            return this;
        }
        /**
         * The Client Cert File.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientCertFile the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder clientCertFile(
                String clientCertFile) {
            doSetProperty("clientCertFile", clientCertFile);
            return this;
        }
        /**
         * The Key Algorithm used by the client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientKeyAlgo the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder clientKeyAlgo(
                String clientKeyAlgo) {
            doSetProperty("clientKeyAlgo", clientKeyAlgo);
            return this;
        }
        /**
         * The Client Key data.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientKeyData the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder clientKeyData(
                String clientKeyData) {
            doSetProperty("clientKeyData", clientKeyData);
            return this;
        }
        /**
         * The Client Key file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientKeyFile the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder clientKeyFile(
                String clientKeyFile) {
            doSetProperty("clientKeyFile", clientKeyFile);
            return this;
        }
        /**
         * The Client Key Passphrase.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientKeyPassphrase the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder clientKeyPassphrase(
                String clientKeyPassphrase) {
            doSetProperty("clientKeyPassphrase", clientKeyPassphrase);
            return this;
        }
        /**
         * The Auth Token.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param oauthToken the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder oauthToken(String oauthToken) {
            doSetProperty("oauthToken", oauthToken);
            return this;
        }
        /**
         * Password to connect to Kubernetes.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param trustCerts the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder trustCerts(
                Boolean trustCerts) {
            doSetProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param trustCerts the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder trustCerts(String trustCerts) {
            doSetProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Username to connect to Kubernetes.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Kubernetes ConfigMap component.
     */
    public interface AdvancedKubernetesConfigMapsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default KubernetesConfigMapsEndpointBuilder basic() {
            return (KubernetesConfigMapsEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedKubernetesConfigMapsEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedKubernetesConfigMapsEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default AdvancedKubernetesConfigMapsEndpointBuilder connectionTimeout(
                Integer connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default AdvancedKubernetesConfigMapsEndpointBuilder connectionTimeout(
                String connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
    }

    public interface KubernetesConfigMapsBuilders {
        /**
         * Kubernetes ConfigMap (camel-kubernetes)
         * Perform operations on Kubernetes ConfigMaps and get notified on
         * ConfigMaps changes.
         * 
         * Category: container,cloud,paas
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-kubernetes
         * 
         * @return the dsl builder for the headers' name.
         */
        default KubernetesConfigMapsHeaderNameBuilder kubernetesConfigMaps() {
            return KubernetesConfigMapsHeaderNameBuilder.INSTANCE;
        }
        /**
         * Kubernetes ConfigMap (camel-kubernetes)
         * Perform operations on Kubernetes ConfigMaps and get notified on
         * ConfigMaps changes.
         * 
         * Category: container,cloud,paas
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-kubernetes
         * 
         * Syntax: <code>kubernetes-config-maps:masterUrl</code>
         * 
         * Path parameter: masterUrl (required)
         * Kubernetes Master url
         * 
         * @param path masterUrl
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder kubernetesConfigMaps(
                String path) {
            return KubernetesConfigMapsEndpointBuilderFactory.endpointBuilder("kubernetes-config-maps", path);
        }
        /**
         * Kubernetes ConfigMap (camel-kubernetes)
         * Perform operations on Kubernetes ConfigMaps and get notified on
         * ConfigMaps changes.
         * 
         * Category: container,cloud,paas
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-kubernetes
         * 
         * Syntax: <code>kubernetes-config-maps:masterUrl</code>
         * 
         * Path parameter: masterUrl (required)
         * Kubernetes Master url
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path masterUrl
         * @return the dsl builder
         */
        default KubernetesConfigMapsEndpointBuilder kubernetesConfigMaps(
                String componentName,
                String path) {
            return KubernetesConfigMapsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Kubernetes ConfigMap component.
     */
    public static class KubernetesConfigMapsHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final KubernetesConfigMapsHeaderNameBuilder INSTANCE = new KubernetesConfigMapsHeaderNameBuilder();

        /**
         * The Producer operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code KubernetesOperation}.
         */
        public String kubernetesOperation() {
            return "KubernetesOperation";
        }

        /**
         * The namespace name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code KubernetesNamespaceName}.
         */
        public String kubernetesNamespaceName() {
            return "KubernetesNamespaceName";
        }

        /**
         * The ConfigMap labels.
         * 
         * The option is a: {@code Map<String, String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code KubernetesConfigMapsLabels}.
         */
        public String kubernetesConfigMapsLabels() {
            return "KubernetesConfigMapsLabels";
        }

        /**
         * The ConfigMap name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code KubernetesConfigMapName}.
         */
        public String kubernetesConfigMapName() {
            return "KubernetesConfigMapName";
        }

        /**
         * The ConfigMap Data.
         * 
         * The option is a: {@code Map<String, String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code KubernetesConfigData}.
         */
        public String kubernetesConfigData() {
            return "KubernetesConfigData";
        }

        /**
         * Action watched by the consumer.
         * 
         * The option is a: {@code io.fabric8.kubernetes.client.Watcher.Action}
         * type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code KubernetesEventAction}.
         */
        public String kubernetesEventAction() {
            return "KubernetesEventAction";
        }

        /**
         * Timestamp of the action watched by the consumer.
         * 
         * The option is a: {@code long} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code KubernetesEventTimestamp}.
         */
        public String kubernetesEventTimestamp() {
            return "KubernetesEventTimestamp";
        }
    }
    static KubernetesConfigMapsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class KubernetesConfigMapsEndpointBuilderImpl extends AbstractEndpointBuilder implements KubernetesConfigMapsEndpointBuilder, AdvancedKubernetesConfigMapsEndpointBuilder {
            public KubernetesConfigMapsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new KubernetesConfigMapsEndpointBuilderImpl(path);
    }
}