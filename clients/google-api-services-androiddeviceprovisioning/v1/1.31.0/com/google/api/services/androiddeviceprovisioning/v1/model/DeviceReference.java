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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * A `DeviceReference` is an API abstraction that lets you supply a _device_ argument to a method
 * using one of the following identifier types: * A numeric API resource ID. * Real-world hardware
 * IDs, such as IMEI number, belonging to the manufactured device. Methods that operate on devices
 * take a `DeviceReference` as a parameter type because it's more flexible for the caller. To learn
 * more about device identifiers, read [Identifiers](https://developers.google.com/zero-
 * touch/guides/identifiers).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeviceReference extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long deviceId;

  /**
   * The hardware IDs of the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceIdentifier deviceIdentifier;

  /**
   * The ID of the device.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDeviceId() {
    return deviceId;
  }

  /**
   * The ID of the device.
   * @param deviceId deviceId or {@code null} for none
   */
  public DeviceReference setDeviceId(java.lang.Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * The hardware IDs of the device.
   * @return value or {@code null} for none
   */
  public DeviceIdentifier getDeviceIdentifier() {
    return deviceIdentifier;
  }

  /**
   * The hardware IDs of the device.
   * @param deviceIdentifier deviceIdentifier or {@code null} for none
   */
  public DeviceReference setDeviceIdentifier(DeviceIdentifier deviceIdentifier) {
    this.deviceIdentifier = deviceIdentifier;
    return this;
  }

  @Override
  public DeviceReference set(String fieldName, Object value) {
    return (DeviceReference) super.set(fieldName, value);
  }

  @Override
  public DeviceReference clone() {
    return (DeviceReference) super.clone();
  }

}
