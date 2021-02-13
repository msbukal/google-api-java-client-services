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

package com.google.api.services.managedidentities.v1alpha1.model;

/**
 * SloExclusion represents an exclusion in SLI calculation applies to all SLOs.
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
public final class GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion extends com.google.api.client.json.GenericJson {

  /**
   * Exclusion duration. No restrictions on the possible values. When an ongoing operation is taking
   * longer than initially expected, an existing entry in the exclusion list can be updated by
   * extending the duration. This is supported by the subsystem exporting eligibility data as long
   * as such extension is committed at least 10 minutes before the original exclusion expiration -
   * otherwise it is possible that there will be "gaps" in the exclusion application in the exported
   * timeseries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * Human-readable reason for the exclusion. This should be a static string (e.g. "Disruptive
   * update in progress") and should not contain dynamically generated data (e.g. instance name).
   * Can be left empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Name of an SLI that this exclusion applies to. Can be left empty, signaling that the instance
   * should be excluded from all SLIs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sliName;

  /**
   * Start time of the exclusion. No alignment (e.g. to a full minute) needed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Exclusion duration. No restrictions on the possible values. When an ongoing operation is taking
   * longer than initially expected, an existing entry in the exclusion list can be updated by
   * extending the duration. This is supported by the subsystem exporting eligibility data as long
   * as such extension is committed at least 10 minutes before the original exclusion expiration -
   * otherwise it is possible that there will be "gaps" in the exclusion application in the exported
   * timeseries.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Exclusion duration. No restrictions on the possible values. When an ongoing operation is taking
   * longer than initially expected, an existing entry in the exclusion list can be updated by
   * extending the duration. This is supported by the subsystem exporting eligibility data as long
   * as such extension is committed at least 10 minutes before the original exclusion expiration -
   * otherwise it is possible that there will be "gaps" in the exclusion application in the exported
   * timeseries.
   * @param duration duration or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Human-readable reason for the exclusion. This should be a static string (e.g. "Disruptive
   * update in progress") and should not contain dynamically generated data (e.g. instance name).
   * Can be left empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * Human-readable reason for the exclusion. This should be a static string (e.g. "Disruptive
   * update in progress") and should not contain dynamically generated data (e.g. instance name).
   * Can be left empty.
   * @param reason reason or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Name of an SLI that this exclusion applies to. Can be left empty, signaling that the instance
   * should be excluded from all SLIs.
   * @return value or {@code null} for none
   */
  public java.lang.String getSliName() {
    return sliName;
  }

  /**
   * Name of an SLI that this exclusion applies to. Can be left empty, signaling that the instance
   * should be excluded from all SLIs.
   * @param sliName sliName or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion setSliName(java.lang.String sliName) {
    this.sliName = sliName;
    return this;
  }

  /**
   * Start time of the exclusion. No alignment (e.g. to a full minute) needed.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Start time of the exclusion. No alignment (e.g. to a full minute) needed.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1SloExclusion) super.clone();
  }

}
