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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final Metadata wrapped;

        private Builder() {
            this.wrapped = new Metadata();
        }

        public Builder withName(String name) {
            wrapped.setName(name);
            return this;
        }

        public Builder withVersion(String version) {
            wrapped.setVersion(version);
            return this;
        }

        public Builder withAuthors(String authors) {
            wrapped.setAuthors(authors);
            return this;
        }

        public Builder withDescription(String description) {
            wrapped.setDescription(description);
            return this;
        }

        public Builder withPublished(String published) {
            wrapped.setPublished(published);
            return this;
        }

        public Builder withLastModified(String lastModified) {
            wrapped.setLastModified(lastModified);
            return this;
        }

        public Metadata build() {
            return wrapped;
        }

    }

}
