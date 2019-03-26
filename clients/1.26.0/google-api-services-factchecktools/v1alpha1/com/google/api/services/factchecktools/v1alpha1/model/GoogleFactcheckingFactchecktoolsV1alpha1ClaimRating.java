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

package com.google.api.services.factchecktools.v1alpha1.model;

/**
 * Information about the claim rating.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fact Check Tools API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating extends com.google.api.client.json.GenericJson {

  /**
   * For numeric ratings, the best value possible in the scale from worst to best. Corresponds to
   * `ClaimReview.reviewRating.bestRating`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer bestRating;

  /**
   * Corresponds to `ClaimReview.reviewRating.image`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * A numeric rating of this claim, in the range worstRating — bestRating inclusive. Corresponds to
   * `ClaimReview.reviewRating.ratingValue`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ratingValue;

  /**
   * The truthfulness rating as a human-readible short word or phrase. Corresponds to
   * `ClaimReview.reviewRating.alternateName`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textualRating;

  /**
   * For numeric ratings, the worst value possible in the scale from worst to best. Corresponds to
   * `ClaimReview.reviewRating.worstRating`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer worstRating;

  /**
   * For numeric ratings, the best value possible in the scale from worst to best. Corresponds to
   * `ClaimReview.reviewRating.bestRating`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBestRating() {
    return bestRating;
  }

  /**
   * For numeric ratings, the best value possible in the scale from worst to best. Corresponds to
   * `ClaimReview.reviewRating.bestRating`.
   * @param bestRating bestRating or {@code null} for none
   */
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating setBestRating(java.lang.Integer bestRating) {
    this.bestRating = bestRating;
    return this;
  }

  /**
   * Corresponds to `ClaimReview.reviewRating.image`.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * Corresponds to `ClaimReview.reviewRating.image`.
   * @param imageUrl imageUrl or {@code null} for none
   */
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * A numeric rating of this claim, in the range worstRating — bestRating inclusive. Corresponds to
   * `ClaimReview.reviewRating.ratingValue`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRatingValue() {
    return ratingValue;
  }

  /**
   * A numeric rating of this claim, in the range worstRating — bestRating inclusive. Corresponds to
   * `ClaimReview.reviewRating.ratingValue`.
   * @param ratingValue ratingValue or {@code null} for none
   */
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating setRatingValue(java.lang.Integer ratingValue) {
    this.ratingValue = ratingValue;
    return this;
  }

  /**
   * The truthfulness rating as a human-readible short word or phrase. Corresponds to
   * `ClaimReview.reviewRating.alternateName`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTextualRating() {
    return textualRating;
  }

  /**
   * The truthfulness rating as a human-readible short word or phrase. Corresponds to
   * `ClaimReview.reviewRating.alternateName`.
   * @param textualRating textualRating or {@code null} for none
   */
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating setTextualRating(java.lang.String textualRating) {
    this.textualRating = textualRating;
    return this;
  }

  /**
   * For numeric ratings, the worst value possible in the scale from worst to best. Corresponds to
   * `ClaimReview.reviewRating.worstRating`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWorstRating() {
    return worstRating;
  }

  /**
   * For numeric ratings, the worst value possible in the scale from worst to best. Corresponds to
   * `ClaimReview.reviewRating.worstRating`.
   * @param worstRating worstRating or {@code null} for none
   */
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating setWorstRating(java.lang.Integer worstRating) {
    this.worstRating = worstRating;
    return this;
  }

  @Override
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating set(String fieldName, Object value) {
    return (GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating) super.set(fieldName, value);
  }

  @Override
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating clone() {
    return (GoogleFactcheckingFactchecktoolsV1alpha1ClaimRating) super.clone();
  }

}