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

package com.google.api.services.cloudresourcemanager.v3.model;

/**
 * A TagBinding represents a connection between a TagValue and a cloud resource (currently project,
 * folder, or organization). Once a TagBinding is created, the TagValue is applied to all the
 * descendants of the cloud resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TagBinding extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The name of the TagBinding. This is a String of the form: `tagBindings/{full-
   * resource-name}/{tag-value-name}` (e.g.
   * `tagBindings/%2F%2Fcloudresourcemanager.googleapis.com%2Fprojects%2F123/tagValues/456`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The full resource name of the resource the TagValue is bound to. E.g.
   * `//cloudresourcemanager.googleapis.com/projects/123`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * The TagValue of the TagBinding. Must be of the form `tagValues/456`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagValue;

  /**
   * Output only. The name of the TagBinding. This is a String of the form: `tagBindings/{full-
   * resource-name}/{tag-value-name}` (e.g.
   * `tagBindings/%2F%2Fcloudresourcemanager.googleapis.com%2Fprojects%2F123/tagValues/456`).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the TagBinding. This is a String of the form: `tagBindings/{full-
   * resource-name}/{tag-value-name}` (e.g.
   * `tagBindings/%2F%2Fcloudresourcemanager.googleapis.com%2Fprojects%2F123/tagValues/456`).
   * @param name name or {@code null} for none
   */
  public TagBinding setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The full resource name of the resource the TagValue is bound to. E.g.
   * `//cloudresourcemanager.googleapis.com/projects/123`
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The full resource name of the resource the TagValue is bound to. E.g.
   * `//cloudresourcemanager.googleapis.com/projects/123`
   * @param parent parent or {@code null} for none
   */
  public TagBinding setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The TagValue of the TagBinding. Must be of the form `tagValues/456`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTagValue() {
    return tagValue;
  }

  /**
   * The TagValue of the TagBinding. Must be of the form `tagValues/456`.
   * @param tagValue tagValue or {@code null} for none
   */
  public TagBinding setTagValue(java.lang.String tagValue) {
    this.tagValue = tagValue;
    return this;
  }

  @Override
  public TagBinding set(String fieldName, Object value) {
    return (TagBinding) super.set(fieldName, value);
  }

  @Override
  public TagBinding clone() {
    return (TagBinding) super.clone();
  }

}
