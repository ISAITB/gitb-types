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

/**
 * Response containing the advertised processing module definition.
 */
public class GetModuleDefinitionResponse {

    protected ProcessingModule module;

    /**
     * Returns the value of {@code module}.
     *
     * @return The value of {@code module}.
     */
    public ProcessingModule getModule() {
        return module;
    }

    /**
     * Sets the value of {@code module}.
     *
     * @param value The value to set.
     */
    public void setModule(ProcessingModule value) {
        this.module = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link GetModuleDefinitionResponse} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link GetModuleDefinitionResponse} instances using a fluent API.
     */
    public static class Builder {

        private final GetModuleDefinitionResponse wrapped;

        private Builder() {
            this.wrapped = new GetModuleDefinitionResponse();
        }

        /**
         * Sets the processing module definition to include in the response.
         *
         * @param value The module definition to set.
         * @return This builder.
         */
        public Builder withModule(ProcessingModule value) {
            wrapped.setModule(value);
            return this;
        }

        /**
         * Builds and returns the configured {@link GetModuleDefinitionResponse} instance.
         *
         * @return The configured instance.
         */
        public GetModuleDefinitionResponse build() {
            return wrapped;
        }

    }

}
