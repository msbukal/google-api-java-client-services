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
 * An event period update resource.
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
public final class EventUpdateResponse extends com.google.api.client.json.GenericJson {

  /**
   * Any batch-wide failures which occurred applying updates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EventBatchRecordFailure> batchFailures;

  static {
    // hack to force ProGuard to consider EventBatchRecordFailure used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EventBatchRecordFailure.class);
  }

  /**
   * Any failures updating a particular event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EventRecordFailure> eventFailures;

  static {
    // hack to force ProGuard to consider EventRecordFailure used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EventRecordFailure.class);
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#eventUpdateResponse`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The current status of any updated events
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PlayerEvent> playerEvents;

  /**
   * Any batch-wide failures which occurred applying updates.
   * @return value or {@code null} for none
   */
  public java.util.List<EventBatchRecordFailure> getBatchFailures() {
    return batchFailures;
  }

  /**
   * Any batch-wide failures which occurred applying updates.
   * @param batchFailures batchFailures or {@code null} for none
   */
  public EventUpdateResponse setBatchFailures(java.util.List<EventBatchRecordFailure> batchFailures) {
    this.batchFailures = batchFailures;
    return this;
  }

  /**
   * Any failures updating a particular event.
   * @return value or {@code null} for none
   */
  public java.util.List<EventRecordFailure> getEventFailures() {
    return eventFailures;
  }

  /**
   * Any failures updating a particular event.
   * @param eventFailures eventFailures or {@code null} for none
   */
  public EventUpdateResponse setEventFailures(java.util.List<EventRecordFailure> eventFailures) {
    this.eventFailures = eventFailures;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#eventUpdateResponse`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `games#eventUpdateResponse`.
   * @param kind kind or {@code null} for none
   */
  public EventUpdateResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The current status of any updated events
   * @return value or {@code null} for none
   */
  public java.util.List<PlayerEvent> getPlayerEvents() {
    return playerEvents;
  }

  /**
   * The current status of any updated events
   * @param playerEvents playerEvents or {@code null} for none
   */
  public EventUpdateResponse setPlayerEvents(java.util.List<PlayerEvent> playerEvents) {
    this.playerEvents = playerEvents;
    return this;
  }

  @Override
  public EventUpdateResponse set(String fieldName, Object value) {
    return (EventUpdateResponse) super.set(fieldName, value);
  }

  @Override
  public EventUpdateResponse clone() {
    return (EventUpdateResponse) super.clone();
  }

}
