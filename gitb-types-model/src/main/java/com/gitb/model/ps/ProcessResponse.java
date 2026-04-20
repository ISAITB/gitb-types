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

import com.gitb.model.core.AnyContent;
import com.gitb.model.tr.TAR;

import java.util.ArrayList;
import java.util.List;


/**
 * Response containing the processing report and produced outputs.
 */
public class ProcessResponse {

    protected TAR report;
    protected List<AnyContent> output;

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
     * Returns the live list backing {@code output}.
     *
     * @return The live list for {@code output}.
     */
    public List<AnyContent> getOutput() {
        if (output == null) {
            output = new ArrayList<>();
        }
        return this.output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final ProcessResponse wrapped;

        private Builder() {
            this.wrapped = new ProcessResponse();
        }

        public Builder withOutput(AnyContent... outputs) {
            for (AnyContent output : outputs) {
                wrapped.getOutput().add(output);
            }
            return this;
        }

        public Builder withReport(TAR report) {
            wrapped.setReport(report);
            return this;
        }

        public ProcessResponse build() {
            return wrapped;
        }

    }

}
