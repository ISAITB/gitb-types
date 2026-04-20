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

import com.gitb.model.core.AnyContent;
import com.gitb.model.core.Configuration;

import java.util.ArrayList;
import java.util.List;


/**
 * Request used to validate one or more input contents.
 */
public class ValidateRequest {

    protected String sessionId;
    protected List<Configuration> config;
    protected List<AnyContent> input;

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

    public static class Builder {

        private final ValidateRequest wrapped;

        private Builder() {
            this.wrapped = new ValidateRequest();
        }

        public Builder withInput(AnyContent... inputs) {
            for (AnyContent input : inputs) {
                wrapped.getInput().add(input);
            }
            return this;
        }

        public Builder withConfig(Configuration... configs) {
            for (Configuration config : configs) {
                wrapped.getConfig().add(config);
            }
            return this;
        }

        public Builder withSessionId(String sessionId) {
            wrapped.setSessionId(sessionId);
            return this;
        }

        public ValidateRequest build() {
            return wrapped;
        }

    }

}
