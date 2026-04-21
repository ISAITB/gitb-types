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
 * Request, response, module and callback types for the GITB messaging service (MS) API.
 *
 * <p>This package provides the model classes that represent the messages exchanged with a
 * messaging service implementation, including:
 * <ul>
 *   <li>Session lifecycle: {@link com.gitb.model.ms.InitiateRequest},
 *       {@link com.gitb.model.ms.InitiateResponse}, {@link com.gitb.model.ms.FinalizeRequest}.</li>
 *   <li>Message exchange: {@link com.gitb.model.ms.SendRequest},
 *       {@link com.gitb.model.ms.SendResponse}, {@link com.gitb.model.ms.ReceiveRequest}, {@link com.gitb.model.ms.BeginTransactionRequest}.</li>
 *   <li>Module definition: {@link com.gitb.model.ms.MessagingModule},
 *       {@link com.gitb.model.ms.GetModuleDefinitionResponse}.</li>
 *   <li>Client callbacks: {@link com.gitb.model.ms.MessagingClient},
 *       {@link com.gitb.model.ms.NotifyForMessageRequest}.</li>
 *   <li>Service interface: {@link com.gitb.model.ms.MessagingService}.</li>
 * </ul>
 */
package com.gitb.model.ms;

