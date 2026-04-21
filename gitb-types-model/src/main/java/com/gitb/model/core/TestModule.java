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
 * Base definition shared by test service modules.
 */
public class TestModule {

    protected Metadata metadata;
    protected List<TypedParameter> inputs;
    protected List<TypedParameter> outputs;
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
     * Returns the live list backing {@code inputs}.
     *
     * @return The live list for {@code inputs}.
     */
    public List<TypedParameter> getInputs() {
        if (inputs == null) {
            inputs = new ArrayList<>();
        }
        return inputs;
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
        return outputs;
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
     * Creates a new {@link BuilderForTestModule} to construct a {@link TestModule} instance.
     *
     * @return A new builder instance.
     */
    public static BuilderForTestModule builderForTestModule() {
        return new BuilderForTestModule();
    }

    /**
     * Concrete builder for {@link TestModule} instances.
     */
    public static class BuilderForTestModule extends Builder<TestModule, BuilderForTestModule> {

        private BuilderForTestModule() {
            super(new TestModule());
        }

    }

    /**
     * Generic builder base providing fluent setter methods for {@link TestModule} and its sub-types.
     *
     * @param <T> The concrete type being built.
     * @param <B> The concrete builder type (for method chaining).
     */
    public static class Builder<T extends TestModule, B extends Builder<T, B>> {

        protected final T wrapped;

        protected Builder(T wrapped) {
            this.wrapped = wrapped;
        }

        /**
         * Adds one or more typed input parameter definitions.
         *
         * @param inputs The input parameters to add.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B withInput(TypedParameter... inputs) {
            for (TypedParameter input : inputs) {
                wrapped.getInputs().add(input);
            }
            return (B) this;
        }

        /**
         * Adds one or more typed output parameter definitions.
         *
         * @param outputs The output parameters to add.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B withOutput(TypedParameter... outputs) {
            for (TypedParameter output : outputs) {
                wrapped.getOutputs().add(output);
            }
            return (B) this;
        }

        /**
         * Sets the module metadata.
         *
         * @param metadata The metadata to set.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B withMetadata(Metadata metadata) {
            wrapped.setMetadata(metadata);
            return (B) this;
        }

        /**
         * Sets the module identifier.
         *
         * @param id The identifier to set.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B withId(String id) {
            wrapped.setId(id);
            return (B) this;
        }

        /**
         * Sets the URI that identifies the module.
         *
         * @param uri The URI to set.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B withUri(String uri) {
            wrapped.setUri(uri);
            return (B) this;
        }

        /**
         * Sets the endpoint location of the service implementation.
         *
         * @param serviceLocation The service location to set.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B withServiceLocation(String serviceLocation) {
            wrapped.setServiceLocation(serviceLocation);
            return (B) this;
        }

        /**
         * Builds and returns the configured instance.
         *
         * @return The configured instance.
         */
        public T build() {
            return wrapped;
        }

    }

}
