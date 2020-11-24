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

package com.google.api.services.gameservices.v1.model;

/**
 * Model definition for OperationStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationStatus extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Whether the operation is done or still in progress.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean done;

  /**
   * The error code in case of failures.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorCode;

  /**
   * The human-readable error message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * Output only. Whether the operation is done or still in progress.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDone() {
    return done;
  }

  /**
   * Output only. Whether the operation is done or still in progress.
   * @param done done or {@code null} for none
   */
  public OperationStatus setDone(java.lang.Boolean done) {
    this.done = done;
    return this;
  }

  /**
   * The error code in case of failures.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }

  /**
   * The error code in case of failures.
   * @param errorCode errorCode or {@code null} for none
   */
  public OperationStatus setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * The human-readable error message.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * The human-readable error message.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public OperationStatus setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  @Override
  public OperationStatus set(String fieldName, Object value) {
    return (OperationStatus) super.set(fieldName, value);
  }

  @Override
  public OperationStatus clone() {
    return (OperationStatus) super.clone();
  }

}
