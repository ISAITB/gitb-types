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

import java.util.ArrayList;
import java.util.List;

/**
 * Recursively defined content wrapper used to transport text, binary or referenced values.
 */
public class AnyContent {

    protected List<AnyContent> item;
    protected String value;
    protected String name;
    protected ValueEmbeddingEnumeration embeddingMethod;
    protected String type;
    protected String encoding;
    protected String mimeType;
    protected Boolean forContext;
    protected Boolean forDisplay;

    /**
     * Returns the live list backing {@code item}.
     *
     * @return The live list for {@code item}.
     */
    public List<AnyContent> getItem() {
        if (item == null) {
            item = new ArrayList<>();
        }
        return this.item;
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
     * Returns the value of {@code embeddingMethod}.
     *
     * @return The value of {@code embeddingMethod}.
     */
    public ValueEmbeddingEnumeration getEmbeddingMethod() {
        return embeddingMethod;
    }

    /**
     * Sets the value of {@code embeddingMethod}.
     *
     * @param value The value to set.
     */
    public void setEmbeddingMethod(ValueEmbeddingEnumeration value) {
        this.embeddingMethod = value;
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
     * Returns the value of {@code encoding}.
     *
     * @return The value of {@code encoding}.
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of {@code encoding}.
     *
     * @param value The value to set.
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Returns the value of {@code mimeType}.
     *
     * @return The value of {@code mimeType}.
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of {@code mimeType}.
     *
     * @param value The value to set.
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Returns the value of {@code forContext}.
     *
     * @return The value of {@code forContext}.
     */
    public Boolean isForContext() {
        return forContext;
    }

    /**
     * Sets the value of {@code forContext}.
     *
     * @param value The value to set.
     */
    public void setForContext(Boolean value) {
        this.forContext = value;
    }

    /**
     * Returns the value of {@code forDisplay}.
     *
     * @return The value of {@code forDisplay}.
     */
    public Boolean isForDisplay() {
        return forDisplay;
    }

    /**
     * Sets the value of {@code forDisplay}.
     *
     * @param value The value to set.
     */
    public void setForDisplay(Boolean value) {
        this.forDisplay = value;
    }

    /**
     * Creates a new {@link Builder} to construct an {@link AnyContent} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link AnyContent} instances using a fluent API.
     */
    public static class Builder {

        private final AnyContent wrapped;

        public Builder() {
            this.wrapped = new AnyContent();
        }

        /**
         * Sets the string, binary or URI value.
         *
         * @param value The value to set.
         * @return This builder.
         */
        public Builder withValue(String value) {
            wrapped.setValue(value);
            return this;
        }

        /**
         * Sets the content type.
         *
         * @param type The type to set.
         * @return This builder.
         */
        public Builder withType(String type) {
            wrapped.setType(type);
            return this;
        }

        /**
         * Sets the name used to identify this content item.
         *
         * @param name The name to set.
         * @return This builder.
         */
        public Builder withName(String name) {
            wrapped.setName(name);
            return this;
        }

        /**
         * Sets the character encoding of the content.
         *
         * @param encoding The encoding to set.
         * @return This builder.
         */
        public Builder withEncoding(String encoding) {
            wrapped.setEncoding(encoding);
            return this;
        }

        /**
         * Sets the MIME type of the content.
         *
         * @param mimeType The MIME type to set.
         * @return This builder.
         */
        public Builder withMimeType(String mimeType) {
            wrapped.setMimeType(mimeType);
            return this;
        }

        /**
         * Sets whether this item should be added to the test session context.
         *
         * @param forContext {@code true} to add to context.
         * @return This builder.
         */
        public Builder withForContext(Boolean forContext) {
            wrapped.setForContext(forContext);
            return this;
        }

        /**
         * Sets whether this item should be included in the display output.
         *
         * @param forDisplay {@code true} to include in display output.
         * @return This builder.
         */
        public Builder withForDisplay(Boolean forDisplay) {
            wrapped.setForDisplay(forDisplay);
            return this;
        }

        /**
         * Sets the embedding method used to carry the value.
         *
         * @param embeddingMethod The embedding method to set.
         * @return This builder.
         */
        public Builder withEmbeddingMethod(ValueEmbeddingEnumeration embeddingMethod) {
            wrapped.setEmbeddingMethod(embeddingMethod);
            return this;
        }

        /**
         * Adds one or more nested content items.
         *
         * @param items The items to add.
         * @return This builder.
         */
        public Builder withItem(AnyContent... items) {
            if (items != null) {
                for (AnyContent item : items) {
                    wrapped.getItem().add(item);
                }
            }
            return this;
        }

        /**
         * Builds and returns the configured {@link AnyContent} instance.
         *
         * @return The configured instance.
         */
        public AnyContent build() {
            return wrapped;
        }

    }

}
