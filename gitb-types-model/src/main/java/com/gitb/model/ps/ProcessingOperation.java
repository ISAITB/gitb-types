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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final ProcessingOperation wrapped;

        private Builder() {
            this.wrapped = new ProcessingOperation();
        }

        public Builder withInput(TypedParameter... inputs) {
            for (TypedParameter input : inputs) {
                wrapped.getInputs().add(input);
            }
            return this;
        }

        public Builder withOutput(TypedParameter... outputs) {
            for (TypedParameter output : outputs) {
                wrapped.getOutputs().add(output);
            }
            return this;
        }

        public Builder withName(String name) {
            wrapped.setName(name);
            return this;
        }

        public ProcessingOperation build() {
            return wrapped;
        }

    }

}
