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
 * Definition of a configurable or descriptive parameter.
 */
public class Parameter {

    protected String value;
    protected String name;
    protected String label;
    protected UsageEnumeration use;
    protected ConfigurationType kind;
    protected String desc;

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
     * Returns the value of {@code label}.
     *
     * @return The value of {@code label}.
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of {@code label}.
     *
     * @param value The value to set.
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Returns the value of {@code use}.
     *
     * @return The value of {@code use}.
     */
    public UsageEnumeration getUse() {
        return use;
    }

    /**
     * Sets the value of {@code use}.
     *
     * @param value The value to set.
     */
    public void setUse(UsageEnumeration value) {
        this.use = value;
    }

    /**
     * Returns the value of {@code kind}.
     *
     * @return The value of {@code kind}.
     */
    public ConfigurationType getKind() {
        return kind;
    }

    /**
     * Sets the value of {@code kind}.
     *
     * @param value The value to set.
     */
    public void setKind(ConfigurationType value) {
        this.kind = value;
    }

    /**
     * Returns the value of {@code desc}.
     *
     * @return The value of {@code desc}.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of {@code desc}.
     *
     * @param value The value to set.
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    public static BuilderForParameter builderForParameter() {
        return new BuilderForParameter();
    }

    public static class BuilderForParameter extends Builder<Parameter, BuilderForParameter> {

        private BuilderForParameter() {
            super(new Parameter());
        }

    }

    public static class Builder<T extends Parameter, B extends Builder<T, B>> {

        protected final T wrapped;

        protected Builder(T wrapped) {
            this.wrapped = wrapped;
        }

        @SuppressWarnings("unchecked")
        public B withValue(String value) {
            wrapped.setValue(value);
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B withName(String name) {
            wrapped.setName(name);
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B withLabel(String label) {
            wrapped.setLabel(label);
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B withUse(UsageEnumeration use) {
            wrapped.setUse(use);
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B withKind(ConfigurationType kind) {
            wrapped.setKind(kind);
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B withDesc(String desc) {
            wrapped.setDesc(desc);
            return (B) this;
        }

        public T build() {
            return wrapped;
        }

    }

}
