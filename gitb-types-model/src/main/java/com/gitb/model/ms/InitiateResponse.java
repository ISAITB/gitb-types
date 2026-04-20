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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final InitiateResponse wrapped;

        private Builder() {
            this.wrapped = new InitiateResponse();
        }

        public Builder withActorConfiguration(ActorConfiguration... configs) {
            for (ActorConfiguration config : configs) {
                wrapped.getActorConfiguration().add(config);
            }
            return this;
        }

        public Builder withSessionId(String sessionId) {
            wrapped.setSessionId(sessionId);
            return this;
        }

        public InitiateResponse build() {
            return wrapped;
        }

    }

}
