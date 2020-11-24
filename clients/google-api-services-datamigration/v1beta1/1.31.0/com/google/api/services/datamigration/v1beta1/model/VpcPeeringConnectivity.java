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

package com.google.api.services.datamigration.v1beta1.model;

/**
 * The details of the VPC where the source database is located in Google Cloud. We will use this
 * information to set up the VPC peering connection between Cloud SQL and this VPC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Database Migration API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VpcPeeringConnectivity extends com.google.api.client.json.GenericJson {

  /**
   * The name of the VPC network to peer with the Cloud SQL private network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vpc;

  /**
   * The name of the VPC network to peer with the Cloud SQL private network.
   * @return value or {@code null} for none
   */
  public java.lang.String getVpc() {
    return vpc;
  }

  /**
   * The name of the VPC network to peer with the Cloud SQL private network.
   * @param vpc vpc or {@code null} for none
   */
  public VpcPeeringConnectivity setVpc(java.lang.String vpc) {
    this.vpc = vpc;
    return this;
  }

  @Override
  public VpcPeeringConnectivity set(String fieldName, Object value) {
    return (VpcPeeringConnectivity) super.set(fieldName, value);
  }

  @Override
  public VpcPeeringConnectivity clone() {
    return (VpcPeeringConnectivity) super.clone();
  }

}
