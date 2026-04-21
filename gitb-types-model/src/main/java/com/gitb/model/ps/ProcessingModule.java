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

import com.gitb.model.core.Metadata;
import com.gitb.model.core.Parameter;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition of a processing service module and the operations it exposes.
 */
public class ProcessingModule {

    protected Metadata metadata;
    protected List<Parameter> configs;
    protected List<ProcessingOperation> operation;
    protected String id;
    protected String uri;
    protected String serviceLocation;

    /**
     * Returns the value of {@code metadata}.
     *
     * @return The value of {@code metadata}.
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of {@code metadata}.
     *
     * @param value The value to set.
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

    /**
     * Returns the live list backing {@code configs}.
     *
     * @return The live list for {@code configs}.
     */
    public List<Parameter> getConfigs() {
        if (configs == null) {
            configs = new ArrayList<>();
        }
        return configs;
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
     * Returns the live list backing {@code operation}.
     *
     * @return The live list for {@code operation}.
     */
    public List<ProcessingOperation> getOperation() {
        if (operation == null) {
            operation = new ArrayList<>();
        }
        return this.operation;
    }

    /**
     * Returns the value of {@code id}.
     *
     * @return The value of {@code id}.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of {@code id}.
     *
     * @param value The value to set.
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Returns the value of {@code uri}.
     *
     * @return The value of {@code uri}.
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of {@code uri}.
     *
     * @param value The value to set.
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Returns the value of {@code serviceLocation}.
     *
     * @return The value of {@code serviceLocation}.
     */
    public String getServiceLocation() {
        return serviceLocation;
    }

    /**
     * Sets the value of {@code serviceLocation}.
     *
     * @param value The value to set.
     */
    public void setServiceLocation(String value) {
        this.serviceLocation = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link ProcessingModule} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link ProcessingModule} instances using a fluent API.
     */
    public static class Builder {

        private final ProcessingModule wrapped;

        private Builder() {
            this.wrapped = new ProcessingModule();
        }

        /**
         * Sets the module metadata.
         *
         * @param metadata The metadata to set.
         * @return This builder.
         */
        public Builder withMetadata(Metadata metadata) {
            wrapped.setMetadata(metadata);
            return this;
        }

        /**
         * Adds one or more module-level configuration parameter definitions.
         *
         * @param configs The configuration parameters to add.
         * @return This builder.
         */
        public Builder withConfig(Parameter... configs) {
            if (configs != null) {
                for (Parameter config : configs) {
                    wrapped.getConfigs().add(config);
                }
            }
            return this;
        }

        /**
         * Adds one or more processing operation definitions to the module.
         *
         * @param operations The operations to add.
         * @return This builder.
         */
        public Builder withOperation(ProcessingOperation... operations) {
            if (operations != null) {
                for (ProcessingOperation operation : operations) {
                    wrapped.getOperation().add(operation);
                }
            }
            return this;
        }

        /**
         * Sets the module identifier.
         *
         * @param id The identifier to set.
         * @return This builder.
         */
        public Builder withId(String id) {
            wrapped.setId(id);
            return this;
        }

        /**
         * Sets the URI that identifies the module.
         *
         * @param uri The URI to set.
         * @return This builder.
         */
        public Builder withUri(String uri) {
            wrapped.setUri(uri);
            return this;
        }

        /**
         * Sets the endpoint location of the service implementation.
         *
         * @param serviceLocation The service location to set.
         * @return This builder.
         */
        public Builder withServiceLocation(String serviceLocation) {
            wrapped.setServiceLocation(serviceLocation);
            return this;
        }

        /**
         * Builds and returns the configured {@link ProcessingModule} instance.
         *
         * @return The configured instance.
         */
        public ProcessingModule build() {
            return wrapped;
        }

    }

}
