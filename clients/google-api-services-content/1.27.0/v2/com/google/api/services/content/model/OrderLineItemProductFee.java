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

package com.google.api.services.content.model;

/**
 * Model definition for OrderLineItemProductFee.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderLineItemProductFee extends com.google.api.client.json.GenericJson {

  /**
   * Amount of the fee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price amount;

  /**
   * Name of the fee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Amount of the fee.
   * @return value or {@code null} for none
   */
  public Price getAmount() {
    return amount;
  }

  /**
   * Amount of the fee.
   * @param amount amount or {@code null} for none
   */
  public OrderLineItemProductFee setAmount(Price amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Name of the fee.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the fee.
   * @param name name or {@code null} for none
   */
  public OrderLineItemProductFee setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public OrderLineItemProductFee set(String fieldName, Object value) {
    return (OrderLineItemProductFee) super.set(fieldName, value);
  }

  @Override
  public OrderLineItemProductFee clone() {
    return (OrderLineItemProductFee) super.clone();
  }

}