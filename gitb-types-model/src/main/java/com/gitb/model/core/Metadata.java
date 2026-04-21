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
 * Descriptive metadata for a module definition.
 */
public class Metadata {

    protected String name;
    protected String version;
    protected String authors;
    protected String description;
    protected String published;
    protected String lastModified;

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
     * Returns the value of {@code version}.
     *
     * @return The value of {@code version}.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of {@code version}.
     *
     * @param value The value to set.
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Returns the value of {@code authors}.
     *
     * @return The value of {@code authors}.
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * Sets the value of {@code authors}.
     *
     * @param value The value to set.
     */
    public void setAuthors(String value) {
        this.authors = value;
    }

    /**
     * Returns the value of {@code description}.
     *
     * @return The value of {@code description}.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of {@code description}.
     *
     * @param value The value to set.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Returns the value of {@code published}.
     *
     * @return The value of {@code published}.
     */
    public String getPublished() {
        return published;
    }

    /**
     * Sets the value of {@code published}.
     *
     * @param value The value to set.
     */
    public void setPublished(String value) {
        this.published = value;
    }

    /**
     * Returns the value of {@code lastModified}.
     *
     * @return The value of {@code lastModified}.
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of {@code lastModified}.
     *
     * @param value The value to set.
     */
    public void setLastModified(String value) {
        this.lastModified = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link Metadata} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link Metadata} instances using a fluent API.
     */
    public static class Builder {

        private final Metadata wrapped;

        private Builder() {
            this.wrapped = new Metadata();
        }

        /**
         * Sets the module name.
         *
         * @param name The name to set.
         * @return This builder.
         */
        public Builder withName(String name) {
            wrapped.setName(name);
            return this;
        }

        /**
         * Sets the module version.
         *
         * @param version The version to set.
         * @return This builder.
         */
        public Builder withVersion(String version) {
            wrapped.setVersion(version);
            return this;
        }

        /**
         * Sets the author(s) of the module.
         *
         * @param authors The authors to set.
         * @return This builder.
         */
        public Builder withAuthors(String authors) {
            wrapped.setAuthors(authors);
            return this;
        }

        /**
         * Sets the module description.
         *
         * @param description The description to set.
         * @return This builder.
         */
        public Builder withDescription(String description) {
            wrapped.setDescription(description);
            return this;
        }

        /**
         * Sets the publication date of the module.
         *
         * @param published The publication date to set.
         * @return This builder.
         */
        public Builder withPublished(String published) {
            wrapped.setPublished(published);
            return this;
        }

        /**
         * Sets the last modification date of the module.
         *
         * @param lastModified The last modification date to set.
         * @return This builder.
         */
        public Builder withLastModified(String lastModified) {
            wrapped.setLastModified(lastModified);
            return this;
        }

        /**
         * Builds and returns the configured {@link Metadata} instance.
         *
         * @return The configured instance.
         */
        public Metadata build() {
            return wrapped;
        }

    }

}
