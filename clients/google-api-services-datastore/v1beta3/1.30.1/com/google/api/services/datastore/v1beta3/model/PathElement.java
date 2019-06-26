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

package com.google.api.services.datastore.v1beta3.model;

/**
 * A (kind, ID/name) pair used to construct a key path.
 *
 * If either name or ID is set, the element is complete. If neither is set, the element is
 * incomplete.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PathElement extends com.google.api.client.json.GenericJson {

  /**
   * The auto-allocated ID of the entity. Never equal to zero. Values less than zero are discouraged
   * and may not be supported in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The kind of the entity. A kind matching regex `__.*__` is reserved/read-only. A kind must not
   * contain more than 1500 bytes when UTF-8 encoded. Cannot be `""`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the entity. A name matching regex `__.*__` is reserved/read-only. A name must not
   * be more than 1500 bytes when UTF-8 encoded. Cannot be `""`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The auto-allocated ID of the entity. Never equal to zero. Values less than zero are discouraged
   * and may not be supported in the future.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * The auto-allocated ID of the entity. Never equal to zero. Values less than zero are discouraged
   * and may not be supported in the future.
   * @param id id or {@code null} for none
   */
  public PathElement setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * The kind of the entity. A kind matching regex `__.*__` is reserved/read-only. A kind must not
   * contain more than 1500 bytes when UTF-8 encoded. Cannot be `""`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of the entity. A kind matching regex `__.*__` is reserved/read-only. A kind must not
   * contain more than 1500 bytes when UTF-8 encoded. Cannot be `""`.
   * @param kind kind or {@code null} for none
   */
  public PathElement setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the entity. A name matching regex `__.*__` is reserved/read-only. A name must not
   * be more than 1500 bytes when UTF-8 encoded. Cannot be `""`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the entity. A name matching regex `__.*__` is reserved/read-only. A name must not
   * be more than 1500 bytes when UTF-8 encoded. Cannot be `""`.
   * @param name name or {@code null} for none
   */
  public PathElement setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public PathElement set(String fieldName, Object value) {
    return (PathElement) super.set(fieldName, value);
  }

  @Override
  public PathElement clone() {
    return (PathElement) super.clone();
  }

}
