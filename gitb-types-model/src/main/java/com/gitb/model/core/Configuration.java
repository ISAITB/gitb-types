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
 * Named configuration value.
 */
public class Configuration {

    protected String value;
    protected String name;

    /**
     * Returns the value of {@code value}.
     *
     * @return The value of {@code value}.
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of {@code value}.
     *
     * @param value The value to set.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns the value of {@code name}.
     *
     * @return The value of {@code name}.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of {@code name}.
     *
     * @param value The value to set.
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link Configuration} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link Configuration} instances using a fluent API.
     */
    public static class Builder {

        private final Configuration wrapped;

        private Builder() {
            this.wrapped = new Configuration();
        }

        /**
         * Sets the configuration parameter name.
         *
         * @param name The name to set.
         * @return This builder.
         */
        public Builder withName(String name) {
            wrapped.setName(name);
            return this;
        }

        /**
         * Sets the configuration parameter value.
         *
         * @param value The value to set.
         * @return This builder.
         */
        public Builder withValue(String value) {
            wrapped.setValue(value);
            return this;
        }

        /**
         * Builds and returns the configured {@link Configuration} instance.
         *
         * @return The configured instance.
         */
        public Configuration build() {
            return wrapped;
        }

    }

}
