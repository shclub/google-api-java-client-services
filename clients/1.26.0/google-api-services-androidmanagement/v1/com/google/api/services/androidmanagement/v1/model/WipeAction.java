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

package com.google.api.services.androidmanagement.v1.model;

/**
 * An action to reset a fully managed device or delete a work profile. Note: blockAction must also
 * be specified.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WipeAction extends com.google.api.client.json.GenericJson {

  /**
   * Whether the factory-reset protection data is preserved on the device. This setting doesn’t
   * apply to work profiles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preserveFrp;

  /**
   * Number of days the policy is non-compliant before the device or work profile is wiped.
   * wipeAfterDays must be greater than blockAfterDays.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer wipeAfterDays;

  /**
   * Whether the factory-reset protection data is preserved on the device. This setting doesn’t
   * apply to work profiles.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreserveFrp() {
    return preserveFrp;
  }

  /**
   * Whether the factory-reset protection data is preserved on the device. This setting doesn’t
   * apply to work profiles.
   * @param preserveFrp preserveFrp or {@code null} for none
   */
  public WipeAction setPreserveFrp(java.lang.Boolean preserveFrp) {
    this.preserveFrp = preserveFrp;
    return this;
  }

  /**
   * Number of days the policy is non-compliant before the device or work profile is wiped.
   * wipeAfterDays must be greater than blockAfterDays.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWipeAfterDays() {
    return wipeAfterDays;
  }

  /**
   * Number of days the policy is non-compliant before the device or work profile is wiped.
   * wipeAfterDays must be greater than blockAfterDays.
   * @param wipeAfterDays wipeAfterDays or {@code null} for none
   */
  public WipeAction setWipeAfterDays(java.lang.Integer wipeAfterDays) {
    this.wipeAfterDays = wipeAfterDays;
    return this;
  }

  @Override
  public WipeAction set(String fieldName, Object value) {
    return (WipeAction) super.set(fieldName, value);
  }

  @Override
  public WipeAction clone() {
    return (WipeAction) super.clone();
  }

}
