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

package com.google.api.services.adexchangebuyer.model;

/**
 * A creative and its classification data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Creative extends com.google.api.client.json.GenericJson {

  /**
   * The HTML snippet that displays the ad when inserted in the web page. If set, videoURL should
   * not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("HTMLSnippet")
  private java.lang.String hTMLSnippet;

  /**
   * Account id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer accountId;

  /**
   * Detected advertiser id, if any. Read-only. This field should not be set in requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> advertiserId;

  /**
   * The name of the company being advertised in the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String advertiserName;

  /**
   * The agency id for this creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long agencyId;

  /**
   * The last upload timestamp of this creative if it was uploaded via API. Read-only. The value of
   * this field is generated, and will be ignored for uploads. (formatted RFC 3339 timestamp).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime apiUploadTimestamp;

  /**
   * All attributes for the ads that may be shown from this snippet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> attribute;

  /**
   * A buyer-specific id identifying the creative in this ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buyerCreativeId;

  /**
   * The set of destination urls for the snippet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> clickThroughUrl;

  /**
   * Shows any corrections that were applied to this creative. Read-only. This field should not be
   * set in requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Corrections> corrections;

  static {
    // hack to force ProGuard to consider Corrections used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Corrections.class);
  }

  /**
   * The reasons for disapproval, if any. Note that not all disapproval reasons may be categorized,
   * so it is possible for the creative to have a status of DISAPPROVED with an empty list for
   * disapproval_reasons. In this case, please reach out to your TAM to help debug the issue. Read-
   * only. This field should not be set in requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DisapprovalReasons> disapprovalReasons;

  static {
    // hack to force ProGuard to consider DisapprovalReasons used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DisapprovalReasons.class);
  }

  /**
   * The filtering reasons for the creative. Read-only. This field should not be set in requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilteringReasons filteringReasons;

  /**
   * Ad height.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * The set of urls to be called to record an impression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> impressionTrackingUrl;

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Detected product categories, if any. Read-only. This field should not be set in requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> productCategories;

  /**
   * All restricted categories for the ads that may be shown from this snippet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> restrictedCategories;

  /**
   * Detected sensitive categories, if any. Read-only. This field should not be set in requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> sensitiveCategories;

  /**
   * Creative serving status. Read-only. This field should not be set in requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * All vendor types for the ads that may be shown from this snippet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> vendorType;

  /**
   * The version for this creative. Read-only. This field should not be set in requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * The url to fetch a video ad. If set, HTMLSnippet should not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoURL;

  /**
   * Ad width.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * The HTML snippet that displays the ad when inserted in the web page. If set, videoURL should
   * not be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getHTMLSnippet() {
    return hTMLSnippet;
  }

  /**
   * The HTML snippet that displays the ad when inserted in the web page. If set, videoURL should
   * not be set.
   * @param hTMLSnippet hTMLSnippet or {@code null} for none
   */
  public Creative setHTMLSnippet(java.lang.String hTMLSnippet) {
    this.hTMLSnippet = hTMLSnippet;
    return this;
  }

  /**
   * Account id.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAccountId() {
    return accountId;
  }

  /**
   * Account id.
   * @param accountId accountId or {@code null} for none
   */
  public Creative setAccountId(java.lang.Integer accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Detected advertiser id, if any. Read-only. This field should not be set in requests.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Detected advertiser id, if any. Read-only. This field should not be set in requests.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public Creative setAdvertiserId(java.util.List<java.lang.Long> advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * The name of the company being advertised in the creative.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdvertiserName() {
    return advertiserName;
  }

  /**
   * The name of the company being advertised in the creative.
   * @param advertiserName advertiserName or {@code null} for none
   */
  public Creative setAdvertiserName(java.lang.String advertiserName) {
    this.advertiserName = advertiserName;
    return this;
  }

  /**
   * The agency id for this creative.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAgencyId() {
    return agencyId;
  }

  /**
   * The agency id for this creative.
   * @param agencyId agencyId or {@code null} for none
   */
  public Creative setAgencyId(java.lang.Long agencyId) {
    this.agencyId = agencyId;
    return this;
  }

  /**
   * The last upload timestamp of this creative if it was uploaded via API. Read-only. The value of
   * this field is generated, and will be ignored for uploads. (formatted RFC 3339 timestamp).
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getApiUploadTimestamp() {
    return apiUploadTimestamp;
  }

  /**
   * The last upload timestamp of this creative if it was uploaded via API. Read-only. The value of
   * this field is generated, and will be ignored for uploads. (formatted RFC 3339 timestamp).
   * @param apiUploadTimestamp apiUploadTimestamp or {@code null} for none
   */
  public Creative setApiUploadTimestamp(com.google.api.client.util.DateTime apiUploadTimestamp) {
    this.apiUploadTimestamp = apiUploadTimestamp;
    return this;
  }

  /**
   * All attributes for the ads that may be shown from this snippet.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getAttribute() {
    return attribute;
  }

  /**
   * All attributes for the ads that may be shown from this snippet.
   * @param attribute attribute or {@code null} for none
   */
  public Creative setAttribute(java.util.List<java.lang.Integer> attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * A buyer-specific id identifying the creative in this ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuyerCreativeId() {
    return buyerCreativeId;
  }

  /**
   * A buyer-specific id identifying the creative in this ad.
   * @param buyerCreativeId buyerCreativeId or {@code null} for none
   */
  public Creative setBuyerCreativeId(java.lang.String buyerCreativeId) {
    this.buyerCreativeId = buyerCreativeId;
    return this;
  }

  /**
   * The set of destination urls for the snippet.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getClickThroughUrl() {
    return clickThroughUrl;
  }

  /**
   * The set of destination urls for the snippet.
   * @param clickThroughUrl clickThroughUrl or {@code null} for none
   */
  public Creative setClickThroughUrl(java.util.List<java.lang.String> clickThroughUrl) {
    this.clickThroughUrl = clickThroughUrl;
    return this;
  }

  /**
   * Shows any corrections that were applied to this creative. Read-only. This field should not be
   * set in requests.
   * @return value or {@code null} for none
   */
  public java.util.List<Corrections> getCorrections() {
    return corrections;
  }

  /**
   * Shows any corrections that were applied to this creative. Read-only. This field should not be
   * set in requests.
   * @param corrections corrections or {@code null} for none
   */
  public Creative setCorrections(java.util.List<Corrections> corrections) {
    this.corrections = corrections;
    return this;
  }

  /**
   * The reasons for disapproval, if any. Note that not all disapproval reasons may be categorized,
   * so it is possible for the creative to have a status of DISAPPROVED with an empty list for
   * disapproval_reasons. In this case, please reach out to your TAM to help debug the issue. Read-
   * only. This field should not be set in requests.
   * @return value or {@code null} for none
   */
  public java.util.List<DisapprovalReasons> getDisapprovalReasons() {
    return disapprovalReasons;
  }

  /**
   * The reasons for disapproval, if any. Note that not all disapproval reasons may be categorized,
   * so it is possible for the creative to have a status of DISAPPROVED with an empty list for
   * disapproval_reasons. In this case, please reach out to your TAM to help debug the issue. Read-
   * only. This field should not be set in requests.
   * @param disapprovalReasons disapprovalReasons or {@code null} for none
   */
  public Creative setDisapprovalReasons(java.util.List<DisapprovalReasons> disapprovalReasons) {
    this.disapprovalReasons = disapprovalReasons;
    return this;
  }

  /**
   * The filtering reasons for the creative. Read-only. This field should not be set in requests.
   * @return value or {@code null} for none
   */
  public FilteringReasons getFilteringReasons() {
    return filteringReasons;
  }

  /**
   * The filtering reasons for the creative. Read-only. This field should not be set in requests.
   * @param filteringReasons filteringReasons or {@code null} for none
   */
  public Creative setFilteringReasons(FilteringReasons filteringReasons) {
    this.filteringReasons = filteringReasons;
    return this;
  }

  /**
   * Ad height.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Ad height.
   * @param height height or {@code null} for none
   */
  public Creative setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * The set of urls to be called to record an impression.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getImpressionTrackingUrl() {
    return impressionTrackingUrl;
  }

  /**
   * The set of urls to be called to record an impression.
   * @param impressionTrackingUrl impressionTrackingUrl or {@code null} for none
   */
  public Creative setImpressionTrackingUrl(java.util.List<java.lang.String> impressionTrackingUrl) {
    this.impressionTrackingUrl = impressionTrackingUrl;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public Creative setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Detected product categories, if any. Read-only. This field should not be set in requests.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getProductCategories() {
    return productCategories;
  }

  /**
   * Detected product categories, if any. Read-only. This field should not be set in requests.
   * @param productCategories productCategories or {@code null} for none
   */
  public Creative setProductCategories(java.util.List<java.lang.Integer> productCategories) {
    this.productCategories = productCategories;
    return this;
  }

  /**
   * All restricted categories for the ads that may be shown from this snippet.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getRestrictedCategories() {
    return restrictedCategories;
  }

  /**
   * All restricted categories for the ads that may be shown from this snippet.
   * @param restrictedCategories restrictedCategories or {@code null} for none
   */
  public Creative setRestrictedCategories(java.util.List<java.lang.Integer> restrictedCategories) {
    this.restrictedCategories = restrictedCategories;
    return this;
  }

  /**
   * Detected sensitive categories, if any. Read-only. This field should not be set in requests.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getSensitiveCategories() {
    return sensitiveCategories;
  }

  /**
   * Detected sensitive categories, if any. Read-only. This field should not be set in requests.
   * @param sensitiveCategories sensitiveCategories or {@code null} for none
   */
  public Creative setSensitiveCategories(java.util.List<java.lang.Integer> sensitiveCategories) {
    this.sensitiveCategories = sensitiveCategories;
    return this;
  }

  /**
   * Creative serving status. Read-only. This field should not be set in requests.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Creative serving status. Read-only. This field should not be set in requests.
   * @param status status or {@code null} for none
   */
  public Creative setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * All vendor types for the ads that may be shown from this snippet.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getVendorType() {
    return vendorType;
  }

  /**
   * All vendor types for the ads that may be shown from this snippet.
   * @param vendorType vendorType or {@code null} for none
   */
  public Creative setVendorType(java.util.List<java.lang.Integer> vendorType) {
    this.vendorType = vendorType;
    return this;
  }

  /**
   * The version for this creative. Read-only. This field should not be set in requests.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * The version for this creative. Read-only. This field should not be set in requests.
   * @param version version or {@code null} for none
   */
  public Creative setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The url to fetch a video ad. If set, HTMLSnippet should not be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoURL() {
    return videoURL;
  }

  /**
   * The url to fetch a video ad. If set, HTMLSnippet should not be set.
   * @param videoURL videoURL or {@code null} for none
   */
  public Creative setVideoURL(java.lang.String videoURL) {
    this.videoURL = videoURL;
    return this;
  }

  /**
   * Ad width.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Ad width.
   * @param width width or {@code null} for none
   */
  public Creative setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public Creative set(String fieldName, Object value) {
    return (Creative) super.set(fieldName, value);
  }

  @Override
  public Creative clone() {
    return (Creative) super.clone();
  }

  /**
   * Model definition for CreativeCorrections.
   */
  public static final class Corrections extends com.google.api.client.json.GenericJson {

    /**
     * Additional details about the correction.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> details;

    /**
     * The type of correction that was applied to the creative.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String reason;

    /**
     * Additional details about the correction.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getDetails() {
      return details;
    }

    /**
     * Additional details about the correction.
     * @param details details or {@code null} for none
     */
    public Corrections setDetails(java.util.List<java.lang.String> details) {
      this.details = details;
      return this;
    }

    /**
     * The type of correction that was applied to the creative.
     * @return value or {@code null} for none
     */
    public java.lang.String getReason() {
      return reason;
    }

    /**
     * The type of correction that was applied to the creative.
     * @param reason reason or {@code null} for none
     */
    public Corrections setReason(java.lang.String reason) {
      this.reason = reason;
      return this;
    }

    @Override
    public Corrections set(String fieldName, Object value) {
      return (Corrections) super.set(fieldName, value);
    }

    @Override
    public Corrections clone() {
      return (Corrections) super.clone();
    }

  }

  /**
   * Model definition for CreativeDisapprovalReasons.
   */
  public static final class DisapprovalReasons extends com.google.api.client.json.GenericJson {

    /**
     * Additional details about the reason for disapproval.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> details;

    /**
     * The categorized reason for disapproval.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String reason;

    /**
     * Additional details about the reason for disapproval.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getDetails() {
      return details;
    }

    /**
     * Additional details about the reason for disapproval.
     * @param details details or {@code null} for none
     */
    public DisapprovalReasons setDetails(java.util.List<java.lang.String> details) {
      this.details = details;
      return this;
    }

    /**
     * The categorized reason for disapproval.
     * @return value or {@code null} for none
     */
    public java.lang.String getReason() {
      return reason;
    }

    /**
     * The categorized reason for disapproval.
     * @param reason reason or {@code null} for none
     */
    public DisapprovalReasons setReason(java.lang.String reason) {
      this.reason = reason;
      return this;
    }

    @Override
    public DisapprovalReasons set(String fieldName, Object value) {
      return (DisapprovalReasons) super.set(fieldName, value);
    }

    @Override
    public DisapprovalReasons clone() {
      return (DisapprovalReasons) super.clone();
    }

  }

  /**
   * The filtering reasons for the creative. Read-only. This field should not be set in requests.
   */
  public static final class FilteringReasons extends com.google.api.client.json.GenericJson {

    /**
     * The date in ISO 8601 format for the data. The data is collected from 00:00:00 to 23:59:59 in
     * PST.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String date;

    /**
     * The filtering reasons.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Reasons> reasons;

    static {
      // hack to force ProGuard to consider Reasons used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Reasons.class);
    }

    /**
     * The date in ISO 8601 format for the data. The data is collected from 00:00:00 to 23:59:59 in
     * PST.
     * @return value or {@code null} for none
     */
    public java.lang.String getDate() {
      return date;
    }

    /**
     * The date in ISO 8601 format for the data. The data is collected from 00:00:00 to 23:59:59 in
     * PST.
     * @param date date or {@code null} for none
     */
    public FilteringReasons setDate(java.lang.String date) {
      this.date = date;
      return this;
    }

    /**
     * The filtering reasons.
     * @return value or {@code null} for none
     */
    public java.util.List<Reasons> getReasons() {
      return reasons;
    }

    /**
     * The filtering reasons.
     * @param reasons reasons or {@code null} for none
     */
    public FilteringReasons setReasons(java.util.List<Reasons> reasons) {
      this.reasons = reasons;
      return this;
    }

    @Override
    public FilteringReasons set(String fieldName, Object value) {
      return (FilteringReasons) super.set(fieldName, value);
    }

    @Override
    public FilteringReasons clone() {
      return (FilteringReasons) super.clone();
    }

    /**
     * Model definition for CreativeFilteringReasonsReasons.
     */
    public static final class Reasons extends com.google.api.client.json.GenericJson {

      /**
       * The number of times the creative was filtered for the status. The count is aggregated across
       * all publishers on the exchange.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key @com.google.api.client.json.JsonString
      private java.lang.Long filteringCount;

      /**
       * The filtering status code. Please refer to the creative-status-codes.txt file for different
       * statuses.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.Integer filteringStatus;

      /**
       * The number of times the creative was filtered for the status. The count is aggregated across
       * all publishers on the exchange.
       * @return value or {@code null} for none
       */
      public java.lang.Long getFilteringCount() {
        return filteringCount;
      }

      /**
       * The number of times the creative was filtered for the status. The count is aggregated across
       * all publishers on the exchange.
       * @param filteringCount filteringCount or {@code null} for none
       */
      public Reasons setFilteringCount(java.lang.Long filteringCount) {
        this.filteringCount = filteringCount;
        return this;
      }

      /**
       * The filtering status code. Please refer to the creative-status-codes.txt file for different
       * statuses.
       * @return value or {@code null} for none
       */
      public java.lang.Integer getFilteringStatus() {
        return filteringStatus;
      }

      /**
       * The filtering status code. Please refer to the creative-status-codes.txt file for different
       * statuses.
       * @param filteringStatus filteringStatus or {@code null} for none
       */
      public Reasons setFilteringStatus(java.lang.Integer filteringStatus) {
        this.filteringStatus = filteringStatus;
        return this;
      }

      @Override
      public Reasons set(String fieldName, Object value) {
        return (Reasons) super.set(fieldName, value);
      }

      @Override
      public Reasons clone() {
        return (Reasons) super.clone();
      }

    }
  }

}
