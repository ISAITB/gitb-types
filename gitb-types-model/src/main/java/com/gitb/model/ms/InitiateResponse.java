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

import com.gitb.model.core.ActorConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * Response returned after a messaging session has been initialised.
 */
public class InitiateResponse {

    protected String sessionId;
    protected List<ActorConfiguration> actorConfiguration;

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
     * Returns the live list backing {@code actorConfiguration}.
     *
     * @return The live list for {@code actorConfiguration}.
     */
    public List<ActorConfiguration> getActorConfiguration() {
        if (actorConfiguration == null) {
            actorConfiguration = new ArrayList<>();
        }
        return this.actorConfiguration;
    }

    /**
     * Creates a new {@link Builder} to construct an {@link InitiateResponse} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link InitiateResponse} instances using a fluent API.
     */
    public static class Builder {

        private final InitiateResponse wrapped;

        private Builder() {
            this.wrapped = new InitiateResponse();
        }

        /**
         * Adds one or more actor configuration entries to the response.
         *
         * @param configs The actor configurations to add.
         * @return This builder.
         */
        public Builder withActorConfiguration(ActorConfiguration... configs) {
            for (ActorConfiguration config : configs) {
                wrapped.getActorConfiguration().add(config);
            }
            return this;
        }

        /**
         * Sets the session identifier for the newly initiated messaging session.
         *
         * @param sessionId The session identifier to set.
         * @return This builder.
         */
        public Builder withSessionId(String sessionId) {
            wrapped.setSessionId(sessionId);
            return this;
        }

        /**
         * Builds and returns the configured {@link InitiateResponse} instance.
         *
         * @return The configured instance.
         */
        public InitiateResponse build() {
            return wrapped;
        }

    }

}
