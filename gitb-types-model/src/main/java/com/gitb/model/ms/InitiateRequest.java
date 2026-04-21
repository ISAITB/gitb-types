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
 * Request used to initialise a messaging session for the configured actors.
 */
public class InitiateRequest {

    protected List<ActorConfiguration> actorConfiguration;

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
     * Creates a new {@link Builder} to construct an {@link InitiateRequest} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link InitiateRequest} instances using a fluent API.
     */
    public static class Builder {

        private final InitiateRequest wrapped;

        private Builder() {
            this.wrapped = new InitiateRequest();
        }

        /**
         * Adds one or more actor configuration entries to the request.
         *
         * @param configs The actor configurations to add.
         * @return This builder.
         */
        public Builder withActorConfiguration(ActorConfiguration... configs) {
            if (configs != null) {
                for (ActorConfiguration config : configs) {
                    wrapped.getActorConfiguration().add(config);
                }
            }
            return this;
        }

        /**
         * Builds and returns the configured {@link InitiateRequest} instance.
         *
         * @return The configured instance.
         */
        public InitiateRequest build() {
            return wrapped;
        }

    }

}
