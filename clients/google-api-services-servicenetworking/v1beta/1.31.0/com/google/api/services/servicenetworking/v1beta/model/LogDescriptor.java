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

package com.google.api.services.servicenetworking.v1beta.model;

/**
 * A description of a log type. Example in YAML format: - name:
 * library.googleapis.com/activity_history description: The history of borrowing and returning
 * library items. display_name: Activity labels: - key: /customer_id description: Identifier of a
 * library customer
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogDescriptor extends com.google.api.client.json.GenericJson {

  /**
   * A human-readable description of this log. This information appears in the documentation and can
   * contain details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The human-readable name for this log. This information appears on the user interface and should
   * be concise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The set of labels that are available to describe a specific log entry. Runtime requests that
   * contain labels not specified here are considered invalid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LabelDescriptor> labels;

  static {
    // hack to force ProGuard to consider LabelDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LabelDescriptor.class);
  }

  /**
   * The name of the log. It must be less than 512 characters long and can include the following
   * characters: upper- and lower-case alphanumeric characters [A-Za-z0-9], and punctuation
   * characters including slash, underscore, hyphen, period [/_-.].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A human-readable description of this log. This information appears in the documentation and can
   * contain details.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A human-readable description of this log. This information appears in the documentation and can
   * contain details.
   * @param description description or {@code null} for none
   */
  public LogDescriptor setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The human-readable name for this log. This information appears on the user interface and should
   * be concise.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The human-readable name for this log. This information appears on the user interface and should
   * be concise.
   * @param displayName displayName or {@code null} for none
   */
  public LogDescriptor setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The set of labels that are available to describe a specific log entry. Runtime requests that
   * contain labels not specified here are considered invalid.
   * @return value or {@code null} for none
   */
  public java.util.List<LabelDescriptor> getLabels() {
    return labels;
  }

  /**
   * The set of labels that are available to describe a specific log entry. Runtime requests that
   * contain labels not specified here are considered invalid.
   * @param labels labels or {@code null} for none
   */
  public LogDescriptor setLabels(java.util.List<LabelDescriptor> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The name of the log. It must be less than 512 characters long and can include the following
   * characters: upper- and lower-case alphanumeric characters [A-Za-z0-9], and punctuation
   * characters including slash, underscore, hyphen, period [/_-.].
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the log. It must be less than 512 characters long and can include the following
   * characters: upper- and lower-case alphanumeric characters [A-Za-z0-9], and punctuation
   * characters including slash, underscore, hyphen, period [/_-.].
   * @param name name or {@code null} for none
   */
  public LogDescriptor setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public LogDescriptor set(String fieldName, Object value) {
    return (LogDescriptor) super.set(fieldName, value);
  }

  @Override
  public LogDescriptor clone() {
    return (LogDescriptor) super.clone();
  }

}
