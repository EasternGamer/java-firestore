/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/bundle/bundle.proto

// Protobuf Java Version: 3.25.2
package com.google.firestore.bundle;

public interface BundledQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.bundle.BundledQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent resource name.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent resource name.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * A structured query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery structured_query = 2;</code>
   *
   * @return Whether the structuredQuery field is set.
   */
  boolean hasStructuredQuery();
  /**
   *
   *
   * <pre>
   * A structured query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery structured_query = 2;</code>
   *
   * @return The structuredQuery.
   */
  com.google.firestore.v1.StructuredQuery getStructuredQuery();
  /**
   *
   *
   * <pre>
   * A structured query.
   * </pre>
   *
   * <code>.google.firestore.v1.StructuredQuery structured_query = 2;</code>
   */
  com.google.firestore.v1.StructuredQueryOrBuilder getStructuredQueryOrBuilder();

  /**
   * <code>.google.firestore.bundle.BundledQuery.LimitType limit_type = 3;</code>
   *
   * @return The enum numeric value on the wire for limitType.
   */
  int getLimitTypeValue();
  /**
   * <code>.google.firestore.bundle.BundledQuery.LimitType limit_type = 3;</code>
   *
   * @return The limitType.
   */
  com.google.firestore.bundle.BundledQuery.LimitType getLimitType();

  com.google.firestore.bundle.BundledQuery.QueryTypeCase getQueryTypeCase();
}
