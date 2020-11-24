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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Set the scoring configuration. This allows modifying the ranking of results for a source.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceScoringConfig extends com.google.api.client.json.GenericJson {

  /**
   * Importance of the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceImportance;

  /**
   * Importance of the source.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceImportance() {
    return sourceImportance;
  }

  /**
   * Importance of the source.
   * @param sourceImportance sourceImportance or {@code null} for none
   */
  public SourceScoringConfig setSourceImportance(java.lang.String sourceImportance) {
    this.sourceImportance = sourceImportance;
    return this;
  }

  @Override
  public SourceScoringConfig set(String fieldName, Object value) {
    return (SourceScoringConfig) super.set(fieldName, value);
  }

  @Override
  public SourceScoringConfig clone() {
    return (SourceScoringConfig) super.clone();
  }

}
