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

package com.google.api.services.gamesConfiguration.model;

/**
 * An achievement configuration detail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services Publishing API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AchievementConfigurationDetail extends com.google.api.client.json.GenericJson {

  /**
   * Localized strings for the achievement description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalizedStringBundle description;

  /**
   * The icon url of this achievement. Writes to this field are ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconUrl;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `gamesConfiguration#achievementConfigurationDetail`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Localized strings for the achievement name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalizedStringBundle name;

  /**
   * Point value for the achievement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pointValue;

  /**
   * The sort rank of this achievement. Writes to this field are ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sortRank;

  /**
   * Localized strings for the achievement description.
   * @return value or {@code null} for none
   */
  public LocalizedStringBundle getDescription() {
    return description;
  }

  /**
   * Localized strings for the achievement description.
   * @param description description or {@code null} for none
   */
  public AchievementConfigurationDetail setDescription(LocalizedStringBundle description) {
    this.description = description;
    return this;
  }

  /**
   * The icon url of this achievement. Writes to this field are ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  /**
   * The icon url of this achievement. Writes to this field are ignored.
   * @param iconUrl iconUrl or {@code null} for none
   */
  public AchievementConfigurationDetail setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `gamesConfiguration#achievementConfigurationDetail`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * `gamesConfiguration#achievementConfigurationDetail`.
   * @param kind kind or {@code null} for none
   */
  public AchievementConfigurationDetail setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Localized strings for the achievement name.
   * @return value or {@code null} for none
   */
  public LocalizedStringBundle getName() {
    return name;
  }

  /**
   * Localized strings for the achievement name.
   * @param name name or {@code null} for none
   */
  public AchievementConfigurationDetail setName(LocalizedStringBundle name) {
    this.name = name;
    return this;
  }

  /**
   * Point value for the achievement.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPointValue() {
    return pointValue;
  }

  /**
   * Point value for the achievement.
   * @param pointValue pointValue or {@code null} for none
   */
  public AchievementConfigurationDetail setPointValue(java.lang.Integer pointValue) {
    this.pointValue = pointValue;
    return this;
  }

  /**
   * The sort rank of this achievement. Writes to this field are ignored.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSortRank() {
    return sortRank;
  }

  /**
   * The sort rank of this achievement. Writes to this field are ignored.
   * @param sortRank sortRank or {@code null} for none
   */
  public AchievementConfigurationDetail setSortRank(java.lang.Integer sortRank) {
    this.sortRank = sortRank;
    return this;
  }

  @Override
  public AchievementConfigurationDetail set(String fieldName, Object value) {
    return (AchievementConfigurationDetail) super.set(fieldName, value);
  }

  @Override
  public AchievementConfigurationDetail clone() {
    return (AchievementConfigurationDetail) super.clone();
  }

}
