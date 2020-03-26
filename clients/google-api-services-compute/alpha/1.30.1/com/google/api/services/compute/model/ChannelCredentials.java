/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * [Deprecated] gRPC channel credentials to access the SDS server. gRPC channel credentials to
 * access the SDS server.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelCredentials extends com.google.api.client.json.GenericJson {

  /**
   * The call credentials to access the SDS server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TlsCertificatePaths certificates;

  /**
   * The channel credentials to access the SDS server. This field can be set to one of the
   * following: CERTIFICATES: Use TLS certificates to access the SDS server. GCE_VM: Use local GCE
   * VM credentials to access the SDS server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelCredentialType;

  /**
   * The call credentials to access the SDS server.
   * @return value or {@code null} for none
   */
  public TlsCertificatePaths getCertificates() {
    return certificates;
  }

  /**
   * The call credentials to access the SDS server.
   * @param certificates certificates or {@code null} for none
   */
  public ChannelCredentials setCertificates(TlsCertificatePaths certificates) {
    this.certificates = certificates;
    return this;
  }

  /**
   * The channel credentials to access the SDS server. This field can be set to one of the
   * following: CERTIFICATES: Use TLS certificates to access the SDS server. GCE_VM: Use local GCE
   * VM credentials to access the SDS server.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelCredentialType() {
    return channelCredentialType;
  }

  /**
   * The channel credentials to access the SDS server. This field can be set to one of the
   * following: CERTIFICATES: Use TLS certificates to access the SDS server. GCE_VM: Use local GCE
   * VM credentials to access the SDS server.
   * @param channelCredentialType channelCredentialType or {@code null} for none
   */
  public ChannelCredentials setChannelCredentialType(java.lang.String channelCredentialType) {
    this.channelCredentialType = channelCredentialType;
    return this;
  }

  @Override
  public ChannelCredentials set(String fieldName, Object value) {
    return (ChannelCredentials) super.set(fieldName, value);
  }

  @Override
  public ChannelCredentials clone() {
    return (ChannelCredentials) super.clone();
  }

}
