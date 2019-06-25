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

package com.google.api.services.firestore.v1beta1.model;

/**
 * Measures the progress of a particular metric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1beta1Progress extends com.google.api.client.json.GenericJson {

  /**
   * An estimate of how much work has been completed. Note that this may be greater than
   * `work_estimated`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long workCompleted;

  /**
   * An estimate of how much work needs to be performed. Zero if the work estimate is unavailable.
   * May change as work progresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long workEstimated;

  /**
   * An estimate of how much work has been completed. Note that this may be greater than
   * `work_estimated`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWorkCompleted() {
    return workCompleted;
  }

  /**
   * An estimate of how much work has been completed. Note that this may be greater than
   * `work_estimated`.
   * @param workCompleted workCompleted or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta1Progress setWorkCompleted(java.lang.Long workCompleted) {
    this.workCompleted = workCompleted;
    return this;
  }

  /**
   * An estimate of how much work needs to be performed. Zero if the work estimate is unavailable.
   * May change as work progresses.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWorkEstimated() {
    return workEstimated;
  }

  /**
   * An estimate of how much work needs to be performed. Zero if the work estimate is unavailable.
   * May change as work progresses.
   * @param workEstimated workEstimated or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta1Progress setWorkEstimated(java.lang.Long workEstimated) {
    this.workEstimated = workEstimated;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1beta1Progress set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1beta1Progress) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1beta1Progress clone() {
    return (GoogleFirestoreAdminV1beta1Progress) super.clone();
  }

}
