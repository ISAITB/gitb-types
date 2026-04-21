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
 * Request, response, module and operation types for the GITB processing service (PS) API.
 *
 * <p>This package provides the model classes that represent the messages exchanged with a
 * processing service implementation, including:
 * <ul>
 *   <li>Operation invocation: {@link com.gitb.model.ps.ProcessRequest},
 *       {@link com.gitb.model.ps.ProcessResponse}.</li>
 *   <li>Transaction lifecycle: driven via
 *       {@link com.gitb.model.ps.BeginTransactionRequest}, {@link com.gitb.model.ps.BeginTransactionResponse} and
 *       {@link com.gitb.model.core.BasicRequest}.</li>
 *   <li>Module definition: {@link com.gitb.model.ps.ProcessingModule},
 *       {@link com.gitb.model.ps.ProcessingOperation},
 *       {@link com.gitb.model.ps.GetModuleDefinitionResponse}.</li>
 *   <li>Service interface: {@link com.gitb.model.ps.ProcessingService}.</li>
 * </ul>
 */
package com.gitb.model.ps;

