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

package com.google.api.services.manufacturers.v1.model;

/**
 * Attributes of the product. For more information, see
 * https://support.google.com/manufacturers/answer/6124116.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Manufacturer Center API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Attributes extends com.google.api.client.json.GenericJson {

  /**
   * The additional images of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#addlimage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Image> additionalImageLink;

  /**
   * The target age group of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#agegroup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ageGroup;

  /**
   * The brand name of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#brand.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brand;

  /**
   * The capacity of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#capacity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Capacity capacity;

  /**
   * The color of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String color;

  /**
   * The count of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Count count;

  /**
   * The description of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The disclosure date of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#disclosure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disclosureDate;

  /**
   * A list of excluded destinations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludedDestination;

  /**
   * The rich format description of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#featuredesc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FeatureDescription> featureDescription;

  /**
   * The flavor of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#flavor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String flavor;

  /**
   * The format of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * The target gender of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#gender.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gender;

  /**
   * The Global Trade Item Number (GTIN) of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#gtin.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> gtin;

  /**
   * The image of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image imageLink;

  /**
   * A list of included destinations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includedDestination;

  /**
   * The item group id of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#itemgroupid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemGroupId;

  /**
   * The material of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#material.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String material;

  /**
   * The Manufacturer Part Number (MPN) of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#mpn.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mpn;

  /**
   * The pattern of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#pattern.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pattern;

  /**
   * The details of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productdetail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ProductDetail> productDetail;

  /**
   * The name of the group of products related to the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productLine;

  /**
   * The canonical name of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productname.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productName;

  /**
   * The URL of the detail page of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productpage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productPageUrl;

  /**
   * The type or category of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#producttype.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> productType;

  /**
   * The release date of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String releaseDate;

  /**
   * Rich product content. For more information, see
   * https://support.google.com/manufacturers/answer/9389865
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> richProductContent;

  /**
   * The scent of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#scent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scent;

  /**
   * The size of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String size;

  /**
   * The size system of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#sizesystem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sizeSystem;

  /**
   * The size type of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#sizetype.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sizeType;

  /**
   * The suggested retail price (MSRP) of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#price.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price suggestedRetailPrice;

  /**
   * The target client id. Should only be used in the accounts of the data partners.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetClientId;

  /**
   * The theme of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#theme.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String theme;

  /**
   * The title of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The videos of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> videoLink;

  /**
   * The additional images of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#addlimage.
   * @return value or {@code null} for none
   */
  public java.util.List<Image> getAdditionalImageLink() {
    return additionalImageLink;
  }

  /**
   * The additional images of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#addlimage.
   * @param additionalImageLink additionalImageLink or {@code null} for none
   */
  public Attributes setAdditionalImageLink(java.util.List<Image> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
    return this;
  }

  /**
   * The target age group of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#agegroup.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgeGroup() {
    return ageGroup;
  }

  /**
   * The target age group of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#agegroup.
   * @param ageGroup ageGroup or {@code null} for none
   */
  public Attributes setAgeGroup(java.lang.String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

  /**
   * The brand name of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#brand.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrand() {
    return brand;
  }

  /**
   * The brand name of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#brand.
   * @param brand brand or {@code null} for none
   */
  public Attributes setBrand(java.lang.String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * The capacity of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#capacity.
   * @return value or {@code null} for none
   */
  public Capacity getCapacity() {
    return capacity;
  }

  /**
   * The capacity of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#capacity.
   * @param capacity capacity or {@code null} for none
   */
  public Attributes setCapacity(Capacity capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * The color of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#color.
   * @return value or {@code null} for none
   */
  public java.lang.String getColor() {
    return color;
  }

  /**
   * The color of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#color.
   * @param color color or {@code null} for none
   */
  public Attributes setColor(java.lang.String color) {
    this.color = color;
    return this;
  }

  /**
   * The count of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#count.
   * @return value or {@code null} for none
   */
  public Count getCount() {
    return count;
  }

  /**
   * The count of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#count.
   * @param count count or {@code null} for none
   */
  public Attributes setCount(Count count) {
    this.count = count;
    return this;
  }

  /**
   * The description of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#description.
   * @param description description or {@code null} for none
   */
  public Attributes setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The disclosure date of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#disclosure.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisclosureDate() {
    return disclosureDate;
  }

  /**
   * The disclosure date of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#disclosure.
   * @param disclosureDate disclosureDate or {@code null} for none
   */
  public Attributes setDisclosureDate(java.lang.String disclosureDate) {
    this.disclosureDate = disclosureDate;
    return this;
  }

  /**
   * A list of excluded destinations.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludedDestination() {
    return excludedDestination;
  }

  /**
   * A list of excluded destinations.
   * @param excludedDestination excludedDestination or {@code null} for none
   */
  public Attributes setExcludedDestination(java.util.List<java.lang.String> excludedDestination) {
    this.excludedDestination = excludedDestination;
    return this;
  }

  /**
   * The rich format description of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#featuredesc.
   * @return value or {@code null} for none
   */
  public java.util.List<FeatureDescription> getFeatureDescription() {
    return featureDescription;
  }

  /**
   * The rich format description of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#featuredesc.
   * @param featureDescription featureDescription or {@code null} for none
   */
  public Attributes setFeatureDescription(java.util.List<FeatureDescription> featureDescription) {
    this.featureDescription = featureDescription;
    return this;
  }

  /**
   * The flavor of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#flavor.
   * @return value or {@code null} for none
   */
  public java.lang.String getFlavor() {
    return flavor;
  }

  /**
   * The flavor of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#flavor.
   * @param flavor flavor or {@code null} for none
   */
  public Attributes setFlavor(java.lang.String flavor) {
    this.flavor = flavor;
    return this;
  }

  /**
   * The format of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#format.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * The format of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#format.
   * @param format format or {@code null} for none
   */
  public Attributes setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * The target gender of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#gender.
   * @return value or {@code null} for none
   */
  public java.lang.String getGender() {
    return gender;
  }

  /**
   * The target gender of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#gender.
   * @param gender gender or {@code null} for none
   */
  public Attributes setGender(java.lang.String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * The Global Trade Item Number (GTIN) of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#gtin.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGtin() {
    return gtin;
  }

  /**
   * The Global Trade Item Number (GTIN) of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#gtin.
   * @param gtin gtin or {@code null} for none
   */
  public Attributes setGtin(java.util.List<java.lang.String> gtin) {
    this.gtin = gtin;
    return this;
  }

  /**
   * The image of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#image.
   * @return value or {@code null} for none
   */
  public Image getImageLink() {
    return imageLink;
  }

  /**
   * The image of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#image.
   * @param imageLink imageLink or {@code null} for none
   */
  public Attributes setImageLink(Image imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  /**
   * A list of included destinations.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludedDestination() {
    return includedDestination;
  }

  /**
   * A list of included destinations.
   * @param includedDestination includedDestination or {@code null} for none
   */
  public Attributes setIncludedDestination(java.util.List<java.lang.String> includedDestination) {
    this.includedDestination = includedDestination;
    return this;
  }

  /**
   * The item group id of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#itemgroupid.
   * @return value or {@code null} for none
   */
  public java.lang.String getItemGroupId() {
    return itemGroupId;
  }

  /**
   * The item group id of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#itemgroupid.
   * @param itemGroupId itemGroupId or {@code null} for none
   */
  public Attributes setItemGroupId(java.lang.String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

  /**
   * The material of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#material.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaterial() {
    return material;
  }

  /**
   * The material of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#material.
   * @param material material or {@code null} for none
   */
  public Attributes setMaterial(java.lang.String material) {
    this.material = material;
    return this;
  }

  /**
   * The Manufacturer Part Number (MPN) of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#mpn.
   * @return value or {@code null} for none
   */
  public java.lang.String getMpn() {
    return mpn;
  }

  /**
   * The Manufacturer Part Number (MPN) of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#mpn.
   * @param mpn mpn or {@code null} for none
   */
  public Attributes setMpn(java.lang.String mpn) {
    this.mpn = mpn;
    return this;
  }

  /**
   * The pattern of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#pattern.
   * @return value or {@code null} for none
   */
  public java.lang.String getPattern() {
    return pattern;
  }

  /**
   * The pattern of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#pattern.
   * @param pattern pattern or {@code null} for none
   */
  public Attributes setPattern(java.lang.String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * The details of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productdetail.
   * @return value or {@code null} for none
   */
  public java.util.List<ProductDetail> getProductDetail() {
    return productDetail;
  }

  /**
   * The details of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productdetail.
   * @param productDetail productDetail or {@code null} for none
   */
  public Attributes setProductDetail(java.util.List<ProductDetail> productDetail) {
    this.productDetail = productDetail;
    return this;
  }

  /**
   * The name of the group of products related to the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productline.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductLine() {
    return productLine;
  }

  /**
   * The name of the group of products related to the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productline.
   * @param productLine productLine or {@code null} for none
   */
  public Attributes setProductLine(java.lang.String productLine) {
    this.productLine = productLine;
    return this;
  }

  /**
   * The canonical name of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productname.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductName() {
    return productName;
  }

  /**
   * The canonical name of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productname.
   * @param productName productName or {@code null} for none
   */
  public Attributes setProductName(java.lang.String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The URL of the detail page of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productpage.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductPageUrl() {
    return productPageUrl;
  }

  /**
   * The URL of the detail page of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#productpage.
   * @param productPageUrl productPageUrl or {@code null} for none
   */
  public Attributes setProductPageUrl(java.lang.String productPageUrl) {
    this.productPageUrl = productPageUrl;
    return this;
  }

  /**
   * The type or category of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#producttype.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProductType() {
    return productType;
  }

  /**
   * The type or category of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#producttype.
   * @param productType productType or {@code null} for none
   */
  public Attributes setProductType(java.util.List<java.lang.String> productType) {
    this.productType = productType;
    return this;
  }

  /**
   * The release date of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#release.
   * @return value or {@code null} for none
   */
  public java.lang.String getReleaseDate() {
    return releaseDate;
  }

  /**
   * The release date of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#release.
   * @param releaseDate releaseDate or {@code null} for none
   */
  public Attributes setReleaseDate(java.lang.String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Rich product content. For more information, see
   * https://support.google.com/manufacturers/answer/9389865
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRichProductContent() {
    return richProductContent;
  }

  /**
   * Rich product content. For more information, see
   * https://support.google.com/manufacturers/answer/9389865
   * @param richProductContent richProductContent or {@code null} for none
   */
  public Attributes setRichProductContent(java.util.List<java.lang.String> richProductContent) {
    this.richProductContent = richProductContent;
    return this;
  }

  /**
   * The scent of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#scent.
   * @return value or {@code null} for none
   */
  public java.lang.String getScent() {
    return scent;
  }

  /**
   * The scent of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#scent.
   * @param scent scent or {@code null} for none
   */
  public Attributes setScent(java.lang.String scent) {
    this.scent = scent;
    return this;
  }

  /**
   * The size of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#size.
   * @return value or {@code null} for none
   */
  public java.lang.String getSize() {
    return size;
  }

  /**
   * The size of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#size.
   * @param size size or {@code null} for none
   */
  public Attributes setSize(java.lang.String size) {
    this.size = size;
    return this;
  }

  /**
   * The size system of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#sizesystem.
   * @return value or {@code null} for none
   */
  public java.lang.String getSizeSystem() {
    return sizeSystem;
  }

  /**
   * The size system of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#sizesystem.
   * @param sizeSystem sizeSystem or {@code null} for none
   */
  public Attributes setSizeSystem(java.lang.String sizeSystem) {
    this.sizeSystem = sizeSystem;
    return this;
  }

  /**
   * The size type of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#sizetype.
   * @return value or {@code null} for none
   */
  public java.lang.String getSizeType() {
    return sizeType;
  }

  /**
   * The size type of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#sizetype.
   * @param sizeType sizeType or {@code null} for none
   */
  public Attributes setSizeType(java.lang.String sizeType) {
    this.sizeType = sizeType;
    return this;
  }

  /**
   * The suggested retail price (MSRP) of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#price.
   * @return value or {@code null} for none
   */
  public Price getSuggestedRetailPrice() {
    return suggestedRetailPrice;
  }

  /**
   * The suggested retail price (MSRP) of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#price.
   * @param suggestedRetailPrice suggestedRetailPrice or {@code null} for none
   */
  public Attributes setSuggestedRetailPrice(Price suggestedRetailPrice) {
    this.suggestedRetailPrice = suggestedRetailPrice;
    return this;
  }

  /**
   * The target client id. Should only be used in the accounts of the data partners.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetClientId() {
    return targetClientId;
  }

  /**
   * The target client id. Should only be used in the accounts of the data partners.
   * @param targetClientId targetClientId or {@code null} for none
   */
  public Attributes setTargetClientId(java.lang.String targetClientId) {
    this.targetClientId = targetClientId;
    return this;
  }

  /**
   * The theme of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#theme.
   * @return value or {@code null} for none
   */
  public java.lang.String getTheme() {
    return theme;
  }

  /**
   * The theme of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#theme.
   * @param theme theme or {@code null} for none
   */
  public Attributes setTheme(java.lang.String theme) {
    this.theme = theme;
    return this;
  }

  /**
   * The title of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#title.
   * @param title title or {@code null} for none
   */
  public Attributes setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The videos of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#video.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVideoLink() {
    return videoLink;
  }

  /**
   * The videos of the product. For more information, see
   * https://support.google.com/manufacturers/answer/6124116#video.
   * @param videoLink videoLink or {@code null} for none
   */
  public Attributes setVideoLink(java.util.List<java.lang.String> videoLink) {
    this.videoLink = videoLink;
    return this;
  }

  @Override
  public Attributes set(String fieldName, Object value) {
    return (Attributes) super.set(fieldName, value);
  }

  @Override
  public Attributes clone() {
    return (Attributes) super.clone();
  }

}
