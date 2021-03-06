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

package com.google.api.services.run.v1beta1.model;

/**
 * CustomResourceDefinitionSpec describes how a user wants their resource to appear
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomResourceDefinitionSpec extends com.google.api.client.json.GenericJson {

  /**
   * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name.
   * Defaults to a created-at column. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomResourceColumnDefinition> additionalPrinterColumns;

  static {
    // hack to force ProGuard to consider CustomResourceColumnDefinition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomResourceColumnDefinition.class);
  }

  /**
   * Group is the group this resource belongs in
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String group;

  /**
   * Names are the names used to describe this custom resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomResourceDefinitionNames names;

  /**
   * Scope indicates whether this resource is cluster or namespace scoped. Default is namespaced
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scope;

  /**
   * Subresources describes the subresources for CustomResources +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomResourceSubresources subresources;

  /**
   * Validation describes the validation methods for CustomResources +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomResourceValidation validation;

  /**
   * Version is the version this resource belongs in Should be always first item in Versions field
   * if provided. Optional, but at least one of Version or Versions must be set. Deprecated: Please
   * use `Versions`. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Versions is the list of all supported versions for this resource. If Version field is provided,
   * this field is optional. Validation: All versions must use the same validation schema for now.
   * i.e., top level Validation field is applied to all of these versions. Order: The version name
   * will be used to compute the order. If the version string is "kube-like", it will sort above non
   * "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start
   * with a "v", then are followed by a number (the major version), then optionally the string
   * "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta >
   * alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major
   * version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2,
   * v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomResourceDefinitionVersion> versions;

  /**
   * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name.
   * Defaults to a created-at column. +optional
   * @return value or {@code null} for none
   */
  public java.util.List<CustomResourceColumnDefinition> getAdditionalPrinterColumns() {
    return additionalPrinterColumns;
  }

  /**
   * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name.
   * Defaults to a created-at column. +optional
   * @param additionalPrinterColumns additionalPrinterColumns or {@code null} for none
   */
  public CustomResourceDefinitionSpec setAdditionalPrinterColumns(java.util.List<CustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
    return this;
  }

  /**
   * Group is the group this resource belongs in
   * @return value or {@code null} for none
   */
  public java.lang.String getGroup() {
    return group;
  }

  /**
   * Group is the group this resource belongs in
   * @param group group or {@code null} for none
   */
  public CustomResourceDefinitionSpec setGroup(java.lang.String group) {
    this.group = group;
    return this;
  }

  /**
   * Names are the names used to describe this custom resource
   * @return value or {@code null} for none
   */
  public CustomResourceDefinitionNames getNames() {
    return names;
  }

  /**
   * Names are the names used to describe this custom resource
   * @param names names or {@code null} for none
   */
  public CustomResourceDefinitionSpec setNames(CustomResourceDefinitionNames names) {
    this.names = names;
    return this;
  }

  /**
   * Scope indicates whether this resource is cluster or namespace scoped. Default is namespaced
   * @return value or {@code null} for none
   */
  public java.lang.String getScope() {
    return scope;
  }

  /**
   * Scope indicates whether this resource is cluster or namespace scoped. Default is namespaced
   * @param scope scope or {@code null} for none
   */
  public CustomResourceDefinitionSpec setScope(java.lang.String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Subresources describes the subresources for CustomResources +optional
   * @return value or {@code null} for none
   */
  public CustomResourceSubresources getSubresources() {
    return subresources;
  }

  /**
   * Subresources describes the subresources for CustomResources +optional
   * @param subresources subresources or {@code null} for none
   */
  public CustomResourceDefinitionSpec setSubresources(CustomResourceSubresources subresources) {
    this.subresources = subresources;
    return this;
  }

  /**
   * Validation describes the validation methods for CustomResources +optional
   * @return value or {@code null} for none
   */
  public CustomResourceValidation getValidation() {
    return validation;
  }

  /**
   * Validation describes the validation methods for CustomResources +optional
   * @param validation validation or {@code null} for none
   */
  public CustomResourceDefinitionSpec setValidation(CustomResourceValidation validation) {
    this.validation = validation;
    return this;
  }

  /**
   * Version is the version this resource belongs in Should be always first item in Versions field
   * if provided. Optional, but at least one of Version or Versions must be set. Deprecated: Please
   * use `Versions`. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Version is the version this resource belongs in Should be always first item in Versions field
   * if provided. Optional, but at least one of Version or Versions must be set. Deprecated: Please
   * use `Versions`. +optional
   * @param version version or {@code null} for none
   */
  public CustomResourceDefinitionSpec setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  /**
   * Versions is the list of all supported versions for this resource. If Version field is provided,
   * this field is optional. Validation: All versions must use the same validation schema for now.
   * i.e., top level Validation field is applied to all of these versions. Order: The version name
   * will be used to compute the order. If the version string is "kube-like", it will sort above non
   * "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start
   * with a "v", then are followed by a number (the major version), then optionally the string
   * "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta >
   * alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major
   * version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2,
   * v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10. +optional
   * @return value or {@code null} for none
   */
  public java.util.List<CustomResourceDefinitionVersion> getVersions() {
    return versions;
  }

  /**
   * Versions is the list of all supported versions for this resource. If Version field is provided,
   * this field is optional. Validation: All versions must use the same validation schema for now.
   * i.e., top level Validation field is applied to all of these versions. Order: The version name
   * will be used to compute the order. If the version string is "kube-like", it will sort above non
   * "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start
   * with a "v", then are followed by a number (the major version), then optionally the string
   * "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta >
   * alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major
   * version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2,
   * v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10. +optional
   * @param versions versions or {@code null} for none
   */
  public CustomResourceDefinitionSpec setVersions(java.util.List<CustomResourceDefinitionVersion> versions) {
    this.versions = versions;
    return this;
  }

  @Override
  public CustomResourceDefinitionSpec set(String fieldName, Object value) {
    return (CustomResourceDefinitionSpec) super.set(fieldName, value);
  }

  @Override
  public CustomResourceDefinitionSpec clone() {
    return (CustomResourceDefinitionSpec) super.clone();
  }

}
