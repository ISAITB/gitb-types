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

import com.gitb.model.core.AnyContent;
import com.gitb.model.core.BasicRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Request used to invoke a processing operation.
 */
public class ProcessRequest extends BasicRequest {

    protected String operation;
    protected List<AnyContent> input;

    /**
     * Returns the value of {@code operation}.
     *
     * @return The value of {@code operation}.
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of {@code operation}.
     *
     * @param value The value to set.
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Returns the live list backing {@code input}.
     *
     * @return The live list for {@code input}.
     */
    public List<AnyContent> getInput() {
        if (input == null) {
            input = new ArrayList<>();
        }
        return this.input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends BasicRequest.Builder<ProcessRequest, Builder> {

        private Builder() {
            super(new ProcessRequest());
        }

        public Builder withInput(AnyContent... inputs) {
            for (AnyContent input : inputs) {
                wrapped.getInput().add(input);
            }
            return this;
        }

        public Builder withOperation(String operation) {
            wrapped.setOperation(operation);
            return this;
        }

    }

}
