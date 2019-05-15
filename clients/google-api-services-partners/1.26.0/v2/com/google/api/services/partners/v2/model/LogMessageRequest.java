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

package com.google.api.services.partners.v2.model;

/**
 * Request message for LogClientMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogMessageRequest extends com.google.api.client.json.GenericJson {

  /**
   * Map of client info, such as URL, browser navigator, browser platform, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> clientInfo;

  /**
   * Details about the client message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String details;

  /**
   * Message level of client message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String level;

  /**
   * Current request metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestMetadata requestMetadata;

  /**
   * Map of client info, such as URL, browser navigator, browser platform, etc.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getClientInfo() {
    return clientInfo;
  }

  /**
   * Map of client info, such as URL, browser navigator, browser platform, etc.
   * @param clientInfo clientInfo or {@code null} for none
   */
  public LogMessageRequest setClientInfo(java.util.Map<String, java.lang.String> clientInfo) {
    this.clientInfo = clientInfo;
    return this;
  }

  /**
   * Details about the client message.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetails() {
    return details;
  }

  /**
   * Details about the client message.
   * @param details details or {@code null} for none
   */
  public LogMessageRequest setDetails(java.lang.String details) {
    this.details = details;
    return this;
  }

  /**
   * Message level of client message.
   * @return value or {@code null} for none
   */
  public java.lang.String getLevel() {
    return level;
  }

  /**
   * Message level of client message.
   * @param level level or {@code null} for none
   */
  public LogMessageRequest setLevel(java.lang.String level) {
    this.level = level;
    return this;
  }

  /**
   * Current request metadata.
   * @return value or {@code null} for none
   */
  public RequestMetadata getRequestMetadata() {
    return requestMetadata;
  }

  /**
   * Current request metadata.
   * @param requestMetadata requestMetadata or {@code null} for none
   */
  public LogMessageRequest setRequestMetadata(RequestMetadata requestMetadata) {
    this.requestMetadata = requestMetadata;
    return this;
  }

  @Override
  public LogMessageRequest set(String fieldName, Object value) {
    return (LogMessageRequest) super.set(fieldName, value);
  }

  @Override
  public LogMessageRequest clone() {
    return (LogMessageRequest) super.clone();
  }

}