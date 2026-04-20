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

package com.gitb.model.ps;

import com.gitb.model.core.BasicRequest;
import com.gitb.model.core.BeginTransactionRequest;
import com.gitb.model.core.BeginTransactionResponse;

/**
 * Operations exposed by a processing service.
 */
public interface ProcessingService {

    /**
     * Retrieves the definition of the processing module and its available operations.
     *
     * @return The processing module definition.
     */
    GetModuleDefinitionResponse getModuleDefinition();

    /**
     * Executes a named processing operation using the provided inputs.
     *
     * @param parameters The operation name, session and input values.
     * @return The produced report and any output values.
     */
    ProcessResponse process(ProcessRequest parameters);

    /**
     * Opens a processing transaction and returns its assigned session identifier.
     *
     * @param parameters The configuration to apply to the new transaction.
     * @return The created transaction information.
     */
    BeginTransactionResponse beginTransaction(BeginTransactionRequest parameters);

    /**
     * Closes an existing processing transaction.
     *
     * @param parameters The session identifying the transaction to close.
     */
    void endTransaction(BasicRequest parameters);

}
