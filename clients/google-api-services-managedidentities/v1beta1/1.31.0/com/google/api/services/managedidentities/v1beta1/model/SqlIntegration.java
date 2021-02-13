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

package com.google.api.services.managedidentities.v1beta1.model;

/**
 * Represents the Sql instance integrated with AD.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SqlIntegration extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time sql integration was created. Synthetic field is populated automatically
   * by CCFE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The unique name of the sql integration in the form of `projects/{project_id}/locations/global/d
   * omains/{domain_name}/sqlIntegrations/{sql_integration}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The full resource name of an integrated sql instance Reference to:
   * http://google3/google/cloud/sql/v1/cloud_sql_resources.proto?l=351=354416019
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sqlInstance;

  /**
   * Output only. The current state of the sql integration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time sql integration was updated. Synthetic field is populated automatically
   * by CCFE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time sql integration was created. Synthetic field is populated automatically
   * by CCFE.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time sql integration was created. Synthetic field is populated automatically
   * by CCFE.
   * @param createTime createTime or {@code null} for none
   */
  public SqlIntegration setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The unique name of the sql integration in the form of `projects/{project_id}/locations/global/d
   * omains/{domain_name}/sqlIntegrations/{sql_integration}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique name of the sql integration in the form of `projects/{project_id}/locations/global/d
   * omains/{domain_name}/sqlIntegrations/{sql_integration}`
   * @param name name or {@code null} for none
   */
  public SqlIntegration setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The full resource name of an integrated sql instance Reference to:
   * http://google3/google/cloud/sql/v1/cloud_sql_resources.proto?l=351=354416019
   * @return value or {@code null} for none
   */
  public java.lang.String getSqlInstance() {
    return sqlInstance;
  }

  /**
   * The full resource name of an integrated sql instance Reference to:
   * http://google3/google/cloud/sql/v1/cloud_sql_resources.proto?l=351=354416019
   * @param sqlInstance sqlInstance or {@code null} for none
   */
  public SqlIntegration setSqlInstance(java.lang.String sqlInstance) {
    this.sqlInstance = sqlInstance;
    return this;
  }

  /**
   * Output only. The current state of the sql integration.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the sql integration.
   * @param state state or {@code null} for none
   */
  public SqlIntegration setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time sql integration was updated. Synthetic field is populated automatically
   * by CCFE.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time sql integration was updated. Synthetic field is populated automatically
   * by CCFE.
   * @param updateTime updateTime or {@code null} for none
   */
  public SqlIntegration setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public SqlIntegration set(String fieldName, Object value) {
    return (SqlIntegration) super.set(fieldName, value);
  }

  @Override
  public SqlIntegration clone() {
    return (SqlIntegration) super.clone();
  }

}
