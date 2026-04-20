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

import com.gitb.model.core.AnyContent;

import java.util.ArrayList;
import java.util.List;

/**
 * Test assertion report produced by messaging, processing or validation operations.
 */
public class TAR extends TestStepReportType {

    protected ValidationOverview overview;
    protected ValidationCounters counters;
    protected AnyContent context;
    protected String name;
    protected List<ReportItem> items;

    /**
     * Returns the value of {@code overview}.
     *
     * @return The value of {@code overview}.
     */
    public ValidationOverview getOverview() {
        return overview;
    }

    /**
     * Sets the value of {@code overview}.
     *
     * @param value The value to set.
     */
    public void setOverview(ValidationOverview value) {
        this.overview = value;
    }

    /**
     * Returns the value of {@code counters}.
     *
     * @return The value of {@code counters}.
     */
    public ValidationCounters getCounters() {
        return counters;
    }

    /**
     * Sets the value of {@code counters}.
     *
     * @param value The value to set.
     */
    public void setCounters(ValidationCounters value) {
        this.counters = value;
    }

    /**
     * Returns the value of {@code context}.
     *
     * @return The value of {@code context}.
     */
    public AnyContent getContext() {
        return context;
    }

    /**
     * Sets the value of {@code context}.
     *
     * @param value The value to set.
     */
    public void setContext(AnyContent value) {
        this.context = value;
    }

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
     * Returns the live list backing {@code items}.
     *
     * @return The live list for {@code items}.
     */
    public List<ReportItem> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends TestStepReportType.Builder<TAR, Builder> {

        public Builder() {
            super(new TAR());
        }

        public Builder withItem(ReportItem... items) {
            for (ReportItem item : items) {
                wrapped.getItems().add(item);
            }
            return this;
        }

        public Builder withOverview(ValidationOverview overview) {
            wrapped.setOverview(overview);
            return this;
        }

        public Builder withOverview(ValidationCounters counters) {
            wrapped.setCounters(counters);
            return this;
        }

        public Builder withName(String name) {
            wrapped.setName(name);
            return this;
        }

        public Builder withContext(AnyContent context) {
            wrapped.setContext(context);
            return this;
        }

        public TAR build() {
            return wrapped;
        }

    }

}
