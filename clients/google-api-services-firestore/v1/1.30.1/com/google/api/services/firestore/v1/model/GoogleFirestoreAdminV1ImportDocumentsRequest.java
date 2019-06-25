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

package com.google.api.services.firestore.v1.model;

/**
 * The request for FirestoreAdmin.ImportDocuments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1ImportDocumentsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Which collection ids to import. Unspecified means all collections included in the import.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> collectionIds;

  /**
   * Location of the exported files. This must match the output_uri_prefix of an
   * ExportDocumentsResponse from an export that has completed successfully. See:
   * google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inputUriPrefix;

  /**
   * Which collection ids to import. Unspecified means all collections included in the import.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCollectionIds() {
    return collectionIds;
  }

  /**
   * Which collection ids to import. Unspecified means all collections included in the import.
   * @param collectionIds collectionIds or {@code null} for none
   */
  public GoogleFirestoreAdminV1ImportDocumentsRequest setCollectionIds(java.util.List<java.lang.String> collectionIds) {
    this.collectionIds = collectionIds;
    return this;
  }

  /**
   * Location of the exported files. This must match the output_uri_prefix of an
   * ExportDocumentsResponse from an export that has completed successfully. See:
   * google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix.
   * @return value or {@code null} for none
   */
  public java.lang.String getInputUriPrefix() {
    return inputUriPrefix;
  }

  /**
   * Location of the exported files. This must match the output_uri_prefix of an
   * ExportDocumentsResponse from an export that has completed successfully. See:
   * google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix.
   * @param inputUriPrefix inputUriPrefix or {@code null} for none
   */
  public GoogleFirestoreAdminV1ImportDocumentsRequest setInputUriPrefix(java.lang.String inputUriPrefix) {
    this.inputUriPrefix = inputUriPrefix;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1ImportDocumentsRequest set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1ImportDocumentsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1ImportDocumentsRequest clone() {
    return (GoogleFirestoreAdminV1ImportDocumentsRequest) super.clone();
  }

}
