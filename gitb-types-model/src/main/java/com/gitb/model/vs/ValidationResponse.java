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

import com.gitb.model.tr.TAR;

/**
 * Response containing the validation report.
 */
public class ValidationResponse {

    protected TAR report;

    /**
     * Returns the value of {@code report}.
     *
     * @return The value of {@code report}.
     */
    public TAR getReport() {
        return report;
    }

    /**
     * Sets the value of {@code report}.
     *
     * @param value The value to set.
     */
    public void setReport(TAR value) {
        this.report = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link ValidationResponse} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link ValidationResponse} instances using a fluent API.
     */
    public static class Builder {

        private final ValidationResponse wrapped;

        private Builder() {
            this.wrapped = new ValidationResponse();
        }

        /**
         * Sets the test assertion report produced by the validation operation.
         *
         * @param report The report to set.
         * @return This builder.
         */
        public Builder withReport(TAR report) {
            wrapped.setReport(report);
            return this;
        }

        /**
         * Builds and returns the configured {@link ValidationResponse} instance.
         *
         * @return The configured instance.
         */
        public ValidationResponse build() {
            return wrapped;
        }

    }

}
