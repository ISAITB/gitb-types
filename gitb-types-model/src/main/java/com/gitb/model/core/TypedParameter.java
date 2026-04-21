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
 * Parameter definition enriched with a value type and optional encoding.
 */
public class TypedParameter extends Parameter {

    protected String type;
    protected String encoding;

    /**
     * Returns the value of {@code type}.
     *
     * @return The value of {@code type}.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of {@code type}.
     *
     * @param value The value to set.
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Returns the value of {@code encoding}.
     *
     * @return The value of {@code encoding}.
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of {@code encoding}.
     *
     * @param value The value to set.
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link TypedParameter} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link TypedParameter} instances using a fluent API.
     */
    public static class Builder extends Parameter.Builder<TypedParameter, Builder> {

        private Builder() {
            super(new TypedParameter());
        }

        /**
         * Sets the value type of the parameter.
         *
         * @param type The type to set.
         * @return This builder.
         */
        public Builder withType(String type) {
            wrapped.setType(type);
            return this;
        }

        /**
         * Sets the character encoding for the parameter value.
         *
         * @param encoding The encoding to set.
         * @return This builder.
         */
        public Builder withEncoding(String encoding) {
            wrapped.setEncoding(encoding);
            return this;
        }

    }
}
