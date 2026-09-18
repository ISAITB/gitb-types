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

package com.gitb.model.ms;

import com.gitb.model.core.BasicRequest;

/**
 * Operations exposed by a messaging service.
 */
public interface MessagingService {

    /**
     * Retrieves the definition of the messaging module and its supported configuration points.
     *
     * @return The messaging module definition.
     */
    GetModuleDefinitionResponse getModuleDefinition();

    /**
     * Initialises a new messaging session for the provided actor configuration.
     *
     * @param parameters The actor configuration for the new session.
     * @return The created session details and any updated actor configuration.
     */
    InitiateResponse initiate(InitiateRequest parameters);

    /**
     * Delivers a received message to the messaging service for processing.
     *
     * @param parameters The received message details.
     */
    void receive(ReceiveRequest parameters);

    /**
     * Requests that the messaging service send content to a target actor or endpoint.
     *
     * @param parameters The content to send and the target to send it to.
     * @return The report produced for the send operation.
     */
    SendResponse send(SendRequest parameters);

    /**
     * Opens a messaging transaction for the current interaction.
     *
     * @param parameters The transaction configuration.
     */
    void beginTransaction(BeginTransactionRequest parameters);

    /**
     * Closes an existing messaging transaction.
     *
     * @param parameters The session identifying the transaction to close.
     */
    void endTransaction(BasicRequest parameters);

    /**
     * Finalises a messaging session and releases its resources.
     *
     * @param parameters The session to finalise.
     */
    void finalize(FinalizeRequest parameters);

}
