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

package com.google.api.services.cloudsearch.v1.model;

/**
 * A reference to a top-level property within the object that should be displayed in search results.
 * The values of the chosen properties is displayed in the search results along with the display
 * label for that property if one is specified. If a display label is not specified, only the values
 * is shown.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DisplayedProperty extends com.google.api.client.json.GenericJson {

  /**
   * The name of the top-level property as defined in a property definition for the object. If the
   * name is not a defined property in the schema, an error is given when attempting to update the
   * schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String propertyName;

  /**
   * The name of the top-level property as defined in a property definition for the object. If the
   * name is not a defined property in the schema, an error is given when attempting to update the
   * schema.
   * @return value or {@code null} for none
   */
  public java.lang.String getPropertyName() {
    return propertyName;
  }

  /**
   * The name of the top-level property as defined in a property definition for the object. If the
   * name is not a defined property in the schema, an error is given when attempting to update the
   * schema.
   * @param propertyName propertyName or {@code null} for none
   */
  public DisplayedProperty setPropertyName(java.lang.String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  @Override
  public DisplayedProperty set(String fieldName, Object value) {
    return (DisplayedProperty) super.set(fieldName, value);
  }

  @Override
  public DisplayedProperty clone() {
    return (DisplayedProperty) super.clone();
  }

}
