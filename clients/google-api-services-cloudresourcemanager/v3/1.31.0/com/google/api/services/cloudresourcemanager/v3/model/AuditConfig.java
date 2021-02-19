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
 * Specifies the audit configuration for a service. The configuration determines which permission
 * types are logged, and what identities, if any, are exempted from logging. An AuditConfig must
 * have one or more AuditLogConfigs. If there are AuditConfigs for both `allServices` and a specific
 * service, the union of the two AuditConfigs is used for that service: the log_types specified in
 * each AuditConfig are enabled, and the exempted_members in each AuditLogConfig are exempted.
 * Example Policy with multiple AuditConfigs: { "audit_configs": [ { "service": "allServices",
 * "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose@example.com" ]
 * }, { "log_type": "DATA_WRITE" }, { "log_type": "ADMIN_READ" } ] }, { "service":
 * "sampleservice.googleapis.com", "audit_log_configs": [ { "log_type": "DATA_READ" }, { "log_type":
 * "DATA_WRITE", "exempted_members": [ "user:aliya@example.com" ] } ] } ] } For sampleservice, this
 * policy enables DATA_READ, DATA_WRITE and ADMIN_READ logging. It also exempts jose@example.com
 * from DATA_READ logging, and aliya@example.com from DATA_WRITE logging.
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
public final class AuditConfig extends com.google.api.client.json.GenericJson {

  /**
   * The configuration for logging of each type of permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AuditLogConfig> auditLogConfigs;

  /**
   * Specifies a service that will be enabled for audit logging. For example,
   * `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that
   * covers all services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * The configuration for logging of each type of permission.
   * @return value or {@code null} for none
   */
  public java.util.List<AuditLogConfig> getAuditLogConfigs() {
    return auditLogConfigs;
  }

  /**
   * The configuration for logging of each type of permission.
   * @param auditLogConfigs auditLogConfigs or {@code null} for none
   */
  public AuditConfig setAuditLogConfigs(java.util.List<AuditLogConfig> auditLogConfigs) {
    this.auditLogConfigs = auditLogConfigs;
    return this;
  }

  /**
   * Specifies a service that will be enabled for audit logging. For example,
   * `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that
   * covers all services.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Specifies a service that will be enabled for audit logging. For example,
   * `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that
   * covers all services.
   * @param service service or {@code null} for none
   */
  public AuditConfig setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  @Override
  public AuditConfig set(String fieldName, Object value) {
    return (AuditConfig) super.set(fieldName, value);
  }

  @Override
  public AuditConfig clone() {
    return (AuditConfig) super.clone();
  }

}
