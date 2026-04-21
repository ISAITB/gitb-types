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

package com.gitb.model.core;

/**
 * Response returned when a transaction is opened and a session identifier is assigned.
 */
public class BeginTransactionResponse {

    protected String sessionId;

    /**
     * Returns the value of {@code sessionId}.
     *
     * @return The value of {@code sessionId}.
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of {@code sessionId}.
     *
     * @param value The value to set.
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link BeginTransactionResponse} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link BeginTransactionResponse} instances using a fluent API.
     */
    public static class Builder {

        private final BeginTransactionResponse wrapped;

        private Builder() {
            this.wrapped = new BeginTransactionResponse();
        }

        /**
         * Sets the session identifier assigned to the new transaction.
         *
         * @param sessionId The session identifier to set.
         * @return This builder.
         */
        public Builder withSessionId(String sessionId) {
            wrapped.setSessionId(sessionId);
            return this;
        }

        /**
         * Builds and returns the configured {@link BeginTransactionResponse} instance.
         *
         * @return The configured instance.
         */
        public BeginTransactionResponse build() {
            return wrapped;
        }

    }

}
