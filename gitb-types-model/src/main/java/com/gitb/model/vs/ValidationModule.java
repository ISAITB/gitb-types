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

package com.gitb.model.vs;

import com.gitb.model.core.Parameter;
import com.gitb.model.core.TestModule;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition of a validation service module.
 */
public class ValidationModule extends TestModule {

    protected List<Parameter> configs;
    protected String operation;

    /**
     * Returns the live list backing {@code configs}.
     *
     * @return The live list for {@code configs}.
     */
    public List<Parameter> getConfigs() {
        if (configs == null) {
            configs = new ArrayList<>();
        }
        return this.configs;
    }

    /**
     * Sets the value of {@code configs}.
     *
     * @param value The value to set.
     */
    public void setConfigs(List<Parameter> value) {
        this.configs = value;
    }

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends TestModule.Builder<ValidationModule, Builder> {

        private Builder() {
            super(new ValidationModule());
        }

        public Builder withConfig(Parameter... configs) {
            for (Parameter config : configs) {
                wrapped.getConfigs().add(config);
            }
            return this;
        }

        public Builder withOperation(String operation) {
            wrapped.setOperation(operation);
            return this;
        }

    }

}
