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

package com.google.api.services.vault.v1.model;

/**
 * A organizational unit being held in a particular hold. This structure is immutable.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HeldOrgUnit extends com.google.api.client.json.GenericJson {

  /**
   * When the org unit was put on hold. This property is immutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String holdTime;

  /**
   * The org unit's immutable ID as provided by the Admin SDK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orgUnitId;

  /**
   * When the org unit was put on hold. This property is immutable.
   * @return value or {@code null} for none
   */
  public String getHoldTime() {
    return holdTime;
  }

  /**
   * When the org unit was put on hold. This property is immutable.
   * @param holdTime holdTime or {@code null} for none
   */
  public HeldOrgUnit setHoldTime(String holdTime) {
    this.holdTime = holdTime;
    return this;
  }

  /**
   * The org unit's immutable ID as provided by the Admin SDK.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrgUnitId() {
    return orgUnitId;
  }

  /**
   * The org unit's immutable ID as provided by the Admin SDK.
   * @param orgUnitId orgUnitId or {@code null} for none
   */
  public HeldOrgUnit setOrgUnitId(java.lang.String orgUnitId) {
    this.orgUnitId = orgUnitId;
    return this;
  }

  @Override
  public HeldOrgUnit set(String fieldName, Object value) {
    return (HeldOrgUnit) super.set(fieldName, value);
  }

  @Override
  public HeldOrgUnit clone() {
    return (HeldOrgUnit) super.clone();
  }

}