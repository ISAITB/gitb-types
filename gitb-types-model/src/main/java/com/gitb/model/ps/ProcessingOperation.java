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

import com.gitb.model.core.TypedParameter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description of a single processing operation.
 */
public class ProcessingOperation {

    protected List<TypedParameter> inputs;
    protected List<TypedParameter> outputs;
    protected String name;

    /**
     * Returns the live list backing {@code inputs}.
     *
     * @return The live list for {@code inputs}.
     */
    public List<TypedParameter> getInputs() {
        if (inputs == null) {
            inputs = new ArrayList<>();
        }
        return this.inputs;
    }

    /**
     * Sets the value of {@code inputs}.
     *
     * @param value The value to set.
     */
    public void setInputs(List<TypedParameter> value) {
        this.inputs = value;
    }

    /**
     * Returns the live list backing {@code outputs}.
     *
     * @return The live list for {@code outputs}.
     */
    public List<TypedParameter> getOutputs() {
        if (outputs == null) {
            outputs = new ArrayList<>();
        }
        return this.outputs;
    }
    /**
     * Sets the value of {@code outputs}.
     *
     * @param value The value to set.
     */
    public void setOutputs(List<TypedParameter> value) {
        this.outputs = value;
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
     * Creates a new {@link Builder} to construct a {@link ProcessingOperation} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link ProcessingOperation} instances using a fluent API.
     */
    public static class Builder {

        private final ProcessingOperation wrapped;

        private Builder() {
            this.wrapped = new ProcessingOperation();
        }

        /**
         * Adds one or more typed input parameter definitions to the operation.
         *
         * @param inputs The input parameters to add.
         * @return This builder.
         */
        public Builder withInput(TypedParameter... inputs) {
            if (inputs != null) {
                for (TypedParameter input : inputs) {
                    wrapped.getInputs().add(input);
                }
            }
            return this;
        }

        /**
         * Adds one or more typed output parameter definitions to the operation.
         *
         * @param outputs The output parameters to add.
         * @return This builder.
         */
        public Builder withOutput(TypedParameter... outputs) {
            if (outputs != null) {
                for (TypedParameter output : outputs) {
                    wrapped.getOutputs().add(output);
                }
            }
            return this;
        }

        /**
         * Sets the name of the processing operation.
         *
         * @param name The name to set.
         * @return This builder.
         */
        public Builder withName(String name) {
            wrapped.setName(name);
            return this;
        }

        /**
         * Builds and returns the configured {@link ProcessingOperation} instance.
         *
         * @return The configured instance.
         */
        public ProcessingOperation build() {
            return wrapped;
        }

    }

}
