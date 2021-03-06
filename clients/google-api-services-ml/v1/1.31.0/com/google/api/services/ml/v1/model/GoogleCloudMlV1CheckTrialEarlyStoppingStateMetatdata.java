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

package com.google.api.services.ml.v1.model;

/**
 * This message will be placed in the metadata field of a google.longrunning.Operation associated
 * with a CheckTrialEarlyStoppingState request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata extends com.google.api.client.json.GenericJson {

  /**
   * The time at which the operation was submitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The name of the study that the trial belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String study;

  /**
   * The trial name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trial;

  /**
   * The time at which the operation was submitted.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time at which the operation was submitted.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The name of the study that the trial belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getStudy() {
    return study;
  }

  /**
   * The name of the study that the trial belongs to.
   * @param study study or {@code null} for none
   */
  public GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata setStudy(java.lang.String study) {
    this.study = study;
    return this;
  }

  /**
   * The trial name.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrial() {
    return trial;
  }

  /**
   * The trial name.
   * @param trial trial or {@code null} for none
   */
  public GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata setTrial(java.lang.String trial) {
    this.trial = trial;
    return this;
  }

  @Override
  public GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata set(String fieldName, Object value) {
    return (GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata clone() {
    return (GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata) super.clone();
  }

}
