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

package com.google.api.services.androidpublisher.model;

/**
 * Model definition for TrackReleasePinPinTargeting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrackReleasePinPinTargeting extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> countryCodes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TrackReleasePinPinTargetingDevicePin> devices;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> phoneskyVersions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> sdkVersions;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCountryCodes() {
    return countryCodes;
  }

  /**
   * @param countryCodes countryCodes or {@code null} for none
   */
  public TrackReleasePinPinTargeting setCountryCodes(java.util.List<java.lang.String> countryCodes) {
    this.countryCodes = countryCodes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<TrackReleasePinPinTargetingDevicePin> getDevices() {
    return devices;
  }

  /**
   * @param devices devices or {@code null} for none
   */
  public TrackReleasePinPinTargeting setDevices(java.util.List<TrackReleasePinPinTargetingDevicePin> devices) {
    this.devices = devices;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getPhoneskyVersions() {
    return phoneskyVersions;
  }

  /**
   * @param phoneskyVersions phoneskyVersions or {@code null} for none
   */
  public TrackReleasePinPinTargeting setPhoneskyVersions(java.util.List<java.lang.Long> phoneskyVersions) {
    this.phoneskyVersions = phoneskyVersions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getSdkVersions() {
    return sdkVersions;
  }

  /**
   * @param sdkVersions sdkVersions or {@code null} for none
   */
  public TrackReleasePinPinTargeting setSdkVersions(java.util.List<java.lang.Integer> sdkVersions) {
    this.sdkVersions = sdkVersions;
    return this;
  }

  @Override
  public TrackReleasePinPinTargeting set(String fieldName, Object value) {
    return (TrackReleasePinPinTargeting) super.set(fieldName, value);
  }

  @Override
  public TrackReleasePinPinTargeting clone() {
    return (TrackReleasePinPinTargeting) super.clone();
  }

}