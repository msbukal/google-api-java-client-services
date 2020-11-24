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

package com.google.api.services.games.model;

/**
 * Metadata about a snapshot revision. Snapshot metadata is immutable - a metadata change
 * corresponds to a new snapshot revision.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SnapshotMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The description of this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The device that created the current revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceName;

  /**
   * The duration associated with this snapshot. Values with sub-millisecond precision can be
   * rounded or trimmed to the closest millisecond.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * The timestamp of the last modification to this snapshot. Values with sub-millisecond precision
   * can be rounded or trimmed to the closest millisecond.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastModifyTime;

  /**
   * The progress value (64-bit integer set by developer) associated with this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long progressValue;

  /**
   * The title of this snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The description of this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of this snapshot.
   * @param description description or {@code null} for none
   */
  public SnapshotMetadata setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The device that created the current revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceName() {
    return deviceName;
  }

  /**
   * The device that created the current revision.
   * @param deviceName deviceName or {@code null} for none
   */
  public SnapshotMetadata setDeviceName(java.lang.String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * The duration associated with this snapshot. Values with sub-millisecond precision can be
   * rounded or trimmed to the closest millisecond.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * The duration associated with this snapshot. Values with sub-millisecond precision can be
   * rounded or trimmed to the closest millisecond.
   * @param duration duration or {@code null} for none
   */
  public SnapshotMetadata setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The timestamp of the last modification to this snapshot. Values with sub-millisecond precision
   * can be rounded or trimmed to the closest millisecond.
   * @return value or {@code null} for none
   */
  public String getLastModifyTime() {
    return lastModifyTime;
  }

  /**
   * The timestamp of the last modification to this snapshot. Values with sub-millisecond precision
   * can be rounded or trimmed to the closest millisecond.
   * @param lastModifyTime lastModifyTime or {@code null} for none
   */
  public SnapshotMetadata setLastModifyTime(String lastModifyTime) {
    this.lastModifyTime = lastModifyTime;
    return this;
  }

  /**
   * The progress value (64-bit integer set by developer) associated with this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProgressValue() {
    return progressValue;
  }

  /**
   * The progress value (64-bit integer set by developer) associated with this snapshot.
   * @param progressValue progressValue or {@code null} for none
   */
  public SnapshotMetadata setProgressValue(java.lang.Long progressValue) {
    this.progressValue = progressValue;
    return this;
  }

  /**
   * The title of this snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of this snapshot.
   * @param title title or {@code null} for none
   */
  public SnapshotMetadata setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public SnapshotMetadata set(String fieldName, Object value) {
    return (SnapshotMetadata) super.set(fieldName, value);
  }

  @Override
  public SnapshotMetadata clone() {
    return (SnapshotMetadata) super.clone();
  }

}
