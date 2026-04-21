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

import com.gitb.model.core.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Request used to begin a transaction together with its configuration values.
 */
public class BeginTransactionRequest {

    protected List<Configuration> config;

    /**
     * Returns the live list backing {@code config}.
     *
     * @return The live list for {@code config}.
     */
    public List<Configuration> getConfig() {
        if (config == null) {
            config = new ArrayList<>();
        }
        return this.config;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link BeginTransactionRequest} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link BeginTransactionRequest} instances using a fluent API.
     */
    public static class Builder {

        private final BeginTransactionRequest wrapped;

        private Builder() {
            this.wrapped = new BeginTransactionRequest();
        }

        /**
         * Adds one or more configuration entries to the transaction request.
         *
         * @param configs The configuration entries to add.
         * @return This builder.
         */
        public Builder withConfig(Configuration... configs) {
            if (configs != null) {
                for (Configuration config : configs) {
                    wrapped.getConfig().add(config);
                }
            }
            return this;
        }

        /**
         * Builds and returns the configured {@link BeginTransactionRequest} instance.
         *
         * @return The configured instance.
         */
        public BeginTransactionRequest build() {
            return wrapped;
        }

    }

}
