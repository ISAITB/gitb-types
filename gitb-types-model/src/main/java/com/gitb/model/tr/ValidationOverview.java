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
 * High-level metadata describing a validation execution.
 */
public class ValidationOverview {

    protected String profileID;
    protected String customizationID;
    protected String transactionID;
    protected String validationServiceName;
    protected String validationServiceVersion;
    protected String note;

    /**
     * Returns the value of {@code profileID}.
     *
     * @return The value of {@code profileID}.
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of {@code profileID}.
     *
     * @param value The value to set.
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Returns the value of {@code customizationID}.
     *
     * @return The value of {@code customizationID}.
     */
    public String getCustomizationID() {
        return customizationID;
    }

    /**
     * Sets the value of {@code customizationID}.
     *
     * @param value The value to set.
     */
    public void setCustomizationID(String value) {
        this.customizationID = value;
    }

    /**
     * Returns the value of {@code transactionID}.
     *
     * @return The value of {@code transactionID}.
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of {@code transactionID}.
     *
     * @param value The value to set.
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Returns the value of {@code validationServiceName}.
     *
     * @return The value of {@code validationServiceName}.
     */
    public String getValidationServiceName() {
        return validationServiceName;
    }

    /**
     * Sets the value of {@code validationServiceName}.
     *
     * @param value The value to set.
     */
    public void setValidationServiceName(String value) {
        this.validationServiceName = value;
    }

    /**
     * Returns the value of {@code validationServiceVersion}.
     *
     * @return The value of {@code validationServiceVersion}.
     */
    public String getValidationServiceVersion() {
        return validationServiceVersion;
    }

    /**
     * Sets the value of {@code validationServiceVersion}.
     *
     * @param value The value to set.
     */
    public void setValidationServiceVersion(String value) {
        this.validationServiceVersion = value;
    }

    /**
     * Returns the value of {@code note}.
     *
     * @return The value of {@code note}.
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of {@code note}.
     *
     * @param value The value to set.
     */
    public void setNote(String value) {
        this.note = value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final ValidationOverview wrapped;

        private Builder() {
            this.wrapped = new ValidationOverview();
        }

        public Builder withProfileID(String profileID) {
            wrapped.setProfileID(profileID);
            return this;
        }

        public Builder withCustomizationID(String customizationID) {
            wrapped.setCustomizationID(customizationID);
            return this;
        }

        public Builder withTransactionID(String transactionID) {
            wrapped.setTransactionID(transactionID);
            return this;
        }

        public Builder withValidationServiceName(String validationServiceName) {
            wrapped.setValidationServiceName(validationServiceName);
            return this;
        }

        public Builder withValidationServiceVersion(String validationServiceVersion) {
            wrapped.setValidationServiceVersion(validationServiceVersion);
            return this;
        }

        public Builder withNote(String note) {
            wrapped.setNote(note);
            return this;
        }

        public ValidationOverview build() {
            return wrapped;
        }

    }

}
