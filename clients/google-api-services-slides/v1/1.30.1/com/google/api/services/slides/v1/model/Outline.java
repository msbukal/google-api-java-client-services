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

package com.google.api.services.slides.v1.model;

/**
 * The outline of a PageElement. If these fields are unset, they may be inherited from a parent
 * placeholder if it exists. If there is no parent, the fields will default to the value used for
 * new page elements created in the Slides editor, which may depend on the page element kind.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Outline extends com.google.api.client.json.GenericJson {

  /**
   * The dash style of the outline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dashStyle;

  /**
   * The fill of the outline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OutlineFill outlineFill;

  /**
   * The outline property state. Updating the outline on a page element will implicitly update this
   * field to `RENDERED`, unless another value is specified in the same request. To have no outline
   * on a page element, set this field to `NOT_RENDERED`. In this case, any other outline fields set
   * in the same request will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String propertyState;

  /**
   * The thickness of the outline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension weight;

  /**
   * The dash style of the outline.
   * @return value or {@code null} for none
   */
  public java.lang.String getDashStyle() {
    return dashStyle;
  }

  /**
   * The dash style of the outline.
   * @param dashStyle dashStyle or {@code null} for none
   */
  public Outline setDashStyle(java.lang.String dashStyle) {
    this.dashStyle = dashStyle;
    return this;
  }

  /**
   * The fill of the outline.
   * @return value or {@code null} for none
   */
  public OutlineFill getOutlineFill() {
    return outlineFill;
  }

  /**
   * The fill of the outline.
   * @param outlineFill outlineFill or {@code null} for none
   */
  public Outline setOutlineFill(OutlineFill outlineFill) {
    this.outlineFill = outlineFill;
    return this;
  }

  /**
   * The outline property state. Updating the outline on a page element will implicitly update this
   * field to `RENDERED`, unless another value is specified in the same request. To have no outline
   * on a page element, set this field to `NOT_RENDERED`. In this case, any other outline fields set
   * in the same request will be ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getPropertyState() {
    return propertyState;
  }

  /**
   * The outline property state. Updating the outline on a page element will implicitly update this
   * field to `RENDERED`, unless another value is specified in the same request. To have no outline
   * on a page element, set this field to `NOT_RENDERED`. In this case, any other outline fields set
   * in the same request will be ignored.
   * @param propertyState propertyState or {@code null} for none
   */
  public Outline setPropertyState(java.lang.String propertyState) {
    this.propertyState = propertyState;
    return this;
  }

  /**
   * The thickness of the outline.
   * @return value or {@code null} for none
   */
  public Dimension getWeight() {
    return weight;
  }

  /**
   * The thickness of the outline.
   * @param weight weight or {@code null} for none
   */
  public Outline setWeight(Dimension weight) {
    this.weight = weight;
    return this;
  }

  @Override
  public Outline set(String fieldName, Object value) {
    return (Outline) super.set(fieldName, value);
  }

  @Override
  public Outline clone() {
    return (Outline) super.clone();
  }

}
