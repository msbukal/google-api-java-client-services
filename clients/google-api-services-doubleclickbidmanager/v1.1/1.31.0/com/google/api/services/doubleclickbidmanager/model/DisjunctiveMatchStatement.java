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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * DisjunctiveMatchStatement that OR's all contained filters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DisjunctiveMatchStatement extends com.google.api.client.json.GenericJson {

  /**
   * Filters. There is a limit of 100 filters that can be set per disjunctive match statement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EventFilter> eventFilters;

  /**
   * Filters. There is a limit of 100 filters that can be set per disjunctive match statement.
   * @return value or {@code null} for none
   */
  public java.util.List<EventFilter> getEventFilters() {
    return eventFilters;
  }

  /**
   * Filters. There is a limit of 100 filters that can be set per disjunctive match statement.
   * @param eventFilters eventFilters or {@code null} for none
   */
  public DisjunctiveMatchStatement setEventFilters(java.util.List<EventFilter> eventFilters) {
    this.eventFilters = eventFilters;
    return this;
  }

  @Override
  public DisjunctiveMatchStatement set(String fieldName, Object value) {
    return (DisjunctiveMatchStatement) super.set(fieldName, value);
  }

  @Override
  public DisjunctiveMatchStatement clone() {
    return (DisjunctiveMatchStatement) super.clone();
  }

}
