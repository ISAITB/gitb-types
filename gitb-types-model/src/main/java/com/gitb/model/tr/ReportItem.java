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

package com.gitb.model.tr;

/**
 * Assertion-level entry included in a validation or messaging report.
 */
public class ReportItem {

    protected String assertionID;
    protected String description;
    protected String location;
    protected String test;
    protected String type;
    protected String value;
    protected SeverityLevel level;

    /**
     * Returns the value of {@code assertionID}.
     *
     * @return The value of {@code assertionID}.
     */
    public String getAssertionID() {
        return assertionID;
    }

    /**
     * Sets the value of {@code assertionID}.
     *
     * @param value The value to set.
     */
    public void setAssertionID(String value) {
        this.assertionID = value;
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
     * Returns the value of {@code location}.
     *
     * @return The value of {@code location}.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of {@code location}.
     *
     * @param value The value to set.
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Returns the value of {@code test}.
     *
     * @return The value of {@code test}.
     */
    public String getTest() {
        return test;
    }

    /**
     * Sets the value of {@code test}.
     *
     * @param value The value to set.
     */
    public void setTest(String value) {
        this.test = value;
    }

    /**
     * Returns the value of {@code type}.
     *
     * @return The value of {@code type}.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of {@code type}.
     *
     * @param value The value to set.
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Returns the value of {@code value}.
     *
     * @return The value of {@code value}.
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of {@code value}.
     *
     * @param value The value to set.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Returns the value of {@code level}.
     *
     * @return The value of {@code level}.
     */
    public SeverityLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of {@code level}.
     *
     * @param value The value to set.
     */
    public void setLevel(SeverityLevel value) {
        this.level = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link ReportItem} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link ReportItem} instances using a fluent API.
     */
    public static class Builder {

        private final ReportItem wrapped;

        private Builder() {
            this.wrapped = new ReportItem();
        }

        /**
         * Sets the assertion identifier.
         *
         * @param assertionID The assertion identifier to set.
         * @return This builder.
         */
        public Builder withAssertionID(String assertionID) {
            wrapped.setAssertionID(assertionID);
            return this;
        }

        /**
         * Sets the human-readable description of the report item.
         *
         * @param description The description to set.
         * @return This builder.
         */
        public Builder withDescription(String description) {
            wrapped.setDescription(description);
            return this;
        }

        /**
         * Sets the location reference within the validated content that triggered this item.
         *
         * @param location The location reference to set.
         * @return This builder.
         */
        public Builder withLocation(String location) {
            wrapped.setLocation(location);
            return this;
        }

        /**
         * Sets the test expression or rule that was evaluated.
         *
         * @param test The test expression to set.
         * @return This builder.
         */
        public Builder withTest(String test) {
            wrapped.setTest(test);
            return this;
        }

        /**
         * Sets the type classification of the report item.
         *
         * @param type The type to set.
         * @return This builder.
         */
        public Builder withType(String type) {
            wrapped.setType(type);
            return this;
        }

        /**
         * Sets the value associated with the report item.
         *
         * @param value The value to set.
         * @return This builder.
         */
        public Builder withValue(String value) {
            wrapped.setValue(value);
            return this;
        }

        /**
         * Sets the severity level of the report item.
         *
         * @param level The severity level to set.
         * @return This builder.
         */
        public Builder withLevel(SeverityLevel level) {
            wrapped.setLevel(level);
            return this;
        }

        /**
         * Builds and returns the configured {@link ReportItem} instance.
         *
         * @return The configured instance.
         */
        public ReportItem build() {
            return wrapped;
        }

    }

}
