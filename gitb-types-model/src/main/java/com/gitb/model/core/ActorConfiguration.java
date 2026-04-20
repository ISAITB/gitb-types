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

import java.util.ArrayList;
import java.util.List;

/**
 * Configuration values for a specific actor and, optionally, one of its endpoints.
 */
public class ActorConfiguration {

    protected List<Configuration> config;
    protected String actor;
    protected String endpoint;

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
     * Returns the value of {@code actor}.
     *
     * @return The value of {@code actor}.
     */
    public String getActor() {
        return actor;
    }

    /**
     * Sets the value of {@code actor}.
     *
     * @param value The value to set.
     */
    public void setActor(String value) {
        this.actor = value;
    }

    /**
     * Returns the value of {@code endpoint}.
     *
     * @return The value of {@code endpoint}.
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of {@code endpoint}.
     *
     * @param value The value to set.
     */
    public void setEndpoint(String value) {
        this.endpoint = value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final ActorConfiguration wrapped;

        private Builder() {
            this.wrapped = new ActorConfiguration();
        }

        public Builder withActor(String actor) {
            wrapped.setActor(actor);
            return this;
        }

        public Builder withEndpoint(String endpoint) {
            wrapped.setActor(endpoint);
            return this;
        }

        public Builder withConfig(Configuration... configs) {
            for (Configuration config : configs) {
                wrapped.getConfig().add(config);
            }
            return this;
        }

        public ActorConfiguration build() {
            return wrapped;
        }

    }

}
