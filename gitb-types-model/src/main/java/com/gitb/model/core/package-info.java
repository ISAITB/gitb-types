/*
 * Copyright (C) 2026 European Union
 *
 * Licensed under the EUPL, Version 1.2 or - as soon they will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence"); You may not use this work except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 *
 * https://interoperable-europe.ec.europa.eu/collection/eupl/eupl-text-eupl-12
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an
 * "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the Licence for
 * the specific language governing permissions and limitations under the Licence.
 */

/**
 * Core data types, enumerations, and request/response classes shared across all GITB service types.
 *
 * <p>This package contains the foundational model elements of the GITB type system, including:
 * <ul>
 *   <li>Generic content wrappers ({@link com.gitb.model.core.AnyContent}).</li>
 *   <li>Configuration and parameter definitions ({@link com.gitb.model.core.Configuration},
 *       {@link com.gitb.model.core.Parameter}, {@link com.gitb.model.core.TypedParameter}).</li>
 *   <li>Common request/response base types ({@link com.gitb.model.core.BasicRequest}.</li>
 *   <li>Module metadata ({@link com.gitb.model.core.Metadata},
 *       {@link com.gitb.model.core.TestModule}).</li>
 *   <li>Supporting enumerations ({@link com.gitb.model.core.ConfigurationType},
 *       {@link com.gitb.model.core.LogLevel}, {@link com.gitb.model.core.UsageEnumeration},
 *       {@link com.gitb.model.core.ValueEmbeddingEnumeration}).</li>
 * </ul>
 */
package com.gitb.model.core;

