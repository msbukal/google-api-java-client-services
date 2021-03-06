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

package com.google.api.services.gameservices.v1beta.model;

/**
 * Custom fields. These can be used to create a counter with arbitrary field/value pairs. See: go
 * /rpcsp-custom-fields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomField extends com.google.api.client.json.GenericJson {

  /**
   * Name is the field name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Value is the field value. It is important that in contrast to the CounterOptions.field, the
   * value here is a constant that is not derived from the IAMContext.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Name is the field name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name is the field name.
   * @param name name or {@code null} for none
   */
  public CustomField setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Value is the field value. It is important that in contrast to the CounterOptions.field, the
   * value here is a constant that is not derived from the IAMContext.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Value is the field value. It is important that in contrast to the CounterOptions.field, the
   * value here is a constant that is not derived from the IAMContext.
   * @param value value or {@code null} for none
   */
  public CustomField setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public CustomField set(String fieldName, Object value) {
    return (CustomField) super.set(fieldName, value);
  }

  @Override
  public CustomField clone() {
    return (CustomField) super.clone();
  }

}
