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

import java.time.ZonedDateTime;

/**
 * Base type for time-stamped step reports.
 */
public abstract class TestStepReportType {

    protected ZonedDateTime date;
    protected TestResultType result;
    protected String id;

    /**
     * Returns the value of {@code date}.
     *
     * @return The value of {@code date}.
     */
    public ZonedDateTime getDate() {
        return date;
    }

    /**
     * Sets the value of {@code date}.
     *
     * @param value The value to set.
     */
    public void setDate(ZonedDateTime value) {
        this.date = value;
    }

    /**
     * Returns the value of {@code result}.
     *
     * @return The value of {@code result}.
     */
    public TestResultType getResult() {
        return result;
    }

    /**
     * Sets the value of {@code result}.
     *
     * @param value The value to set.
     */
    public void setResult(TestResultType value) {
        this.result = value;
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
     * Generic builder base providing fluent setter methods for {@link TestStepReportType} and its sub-types.
     *
     * @param <T> The concrete report type being built.
     * @param <B> The concrete builder type (for method chaining).
     */
    public static class Builder<T extends TestStepReportType, B extends Builder<T, B>> {

        protected final T wrapped;

        protected Builder(T wrapped) {
            this.wrapped = wrapped;
        }

        /**
         * Sets the date and time at which the step was executed.
         *
         * @param date The date/time to set.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B withDate(ZonedDateTime date) {
            wrapped.setDate(date);
            return (B) this;
        }

        /**
         * Sets the overall result of the step.
         *
         * @param result The result to set.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B withResult(TestResultType result) {
            wrapped.setResult(result);
            return (B) this;
        }

        /**
         * Sets the report identifier.
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
         * Builds and returns the configured instance.
         *
         * @return The configured instance.
         */
        public T build() {
            return wrapped;
        }

    }

}
