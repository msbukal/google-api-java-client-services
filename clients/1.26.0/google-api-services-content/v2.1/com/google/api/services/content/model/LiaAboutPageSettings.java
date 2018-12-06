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

package com.google.api.services.content.model;

/**
 * Model definition for LiaAboutPageSettings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiaAboutPageSettings extends com.google.api.client.json.GenericJson {

  /**
   * The status of the verification process for the About page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The URL for the About page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The status of the verification process for the About page.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the verification process for the About page.
   * @param status status or {@code null} for none
   */
  public LiaAboutPageSettings setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The URL for the About page.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL for the About page.
   * @param url url or {@code null} for none
   */
  public LiaAboutPageSettings setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public LiaAboutPageSettings set(String fieldName, Object value) {
    return (LiaAboutPageSettings) super.set(fieldName, value);
  }

  @Override
  public LiaAboutPageSettings clone() {
    return (LiaAboutPageSettings) super.clone();
  }

}
