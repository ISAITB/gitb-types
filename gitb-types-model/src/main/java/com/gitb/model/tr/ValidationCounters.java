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
 * Counters summarising assertion, error and warning totals.
 */
public class ValidationCounters {

    protected Integer nrOfAssertions;
    protected Integer nrOfErrors;
    protected Integer nrOfWarnings;

    /**
     * Returns the value of {@code nrOfAssertions}.
     *
     * @return The value of {@code nrOfAssertions}.
     */
    public Integer getNrOfAssertions() {
        return nrOfAssertions;
    }

    /**
     * Sets the value of {@code nrOfAssertions}.
     *
     * @param value The value to set.
     */
    public void setNrOfAssertions(int value) {
        this.nrOfAssertions = value;
    }

    /**
     * Returns the value of {@code nrOfErrors}.
     *
     * @return The value of {@code nrOfErrors}.
     */
    public Integer getNrOfErrors() {
        return nrOfErrors;
    }

    /**
     * Sets the value of {@code nrOfErrors}.
     *
     * @param value The value to set.
     */
    public void setNrOfErrors(int value) {
        this.nrOfErrors = value;
    }

    /**
     * Returns the value of {@code nrOfWarnings}.
     *
     * @return The value of {@code nrOfWarnings}.
     */
    public Integer getNrOfWarnings() {
        return nrOfWarnings;
    }

    /**
     * Sets the value of {@code nrOfWarnings}.
     *
     * @param value The value to set.
     */
    public void setNrOfWarnings(int value) {
        this.nrOfWarnings = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link ValidationCounters} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link ValidationCounters} instances using a fluent API.
     */
    public static class Builder {

        private final ValidationCounters wrapped;

        private Builder() {
            this.wrapped = new ValidationCounters();
        }

        /**
         * Sets the number of errors found.
         *
         * @param errors The error count to set.
         * @return This builder.
         */
        public Builder withNrOfErrors(int errors) {
            wrapped.setNrOfErrors(errors);
            return this;
        }

        /**
         * Sets the number of warnings found.
         *
         * @param warnings The warning count to set.
         * @return This builder.
         */
        public Builder withNrOfWarnings(int warnings) {
            wrapped.setNrOfWarnings(warnings);
            return this;
        }

        /**
         * Sets the total number of assertions evaluated.
         *
         * @param assertions The assertion count to set.
         * @return This builder.
         */
        public Builder withNrOfAssertions(int assertions) {
            wrapped.setNrOfAssertions(assertions);
            return this;
        }

        /**
         * Builds and returns the configured {@link ValidationCounters} instance.
         *
         * @return The configured instance.
         */
        public ValidationCounters build() {
            return wrapped;
        }

    }

}
