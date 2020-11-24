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

package com.google.api.services.gameservices.v1beta.model;

/**
 * Response message for PreviewGameServerDeploymentRollout. This has details about the Agones fleet
 * and autoscaler to be actuated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PreviewGameServerDeploymentRolloutResponse extends com.google.api.client.json.GenericJson {

  /**
   * ETag of the game server deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The target state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetState targetState;

  /**
   * Locations that could not be reached on this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unavailable;

  /**
   * ETag of the game server deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the game server deployment.
   * @param etag etag or {@code null} for none
   */
  public PreviewGameServerDeploymentRolloutResponse setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The target state.
   * @return value or {@code null} for none
   */
  public TargetState getTargetState() {
    return targetState;
  }

  /**
   * The target state.
   * @param targetState targetState or {@code null} for none
   */
  public PreviewGameServerDeploymentRolloutResponse setTargetState(TargetState targetState) {
    this.targetState = targetState;
    return this;
  }

  /**
   * Locations that could not be reached on this request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnavailable() {
    return unavailable;
  }

  /**
   * Locations that could not be reached on this request.
   * @param unavailable unavailable or {@code null} for none
   */
  public PreviewGameServerDeploymentRolloutResponse setUnavailable(java.util.List<java.lang.String> unavailable) {
    this.unavailable = unavailable;
    return this;
  }

  @Override
  public PreviewGameServerDeploymentRolloutResponse set(String fieldName, Object value) {
    return (PreviewGameServerDeploymentRolloutResponse) super.set(fieldName, value);
  }

  @Override
  public PreviewGameServerDeploymentRolloutResponse clone() {
    return (PreviewGameServerDeploymentRolloutResponse) super.clone();
  }

}
