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

package com.gitb.model.ms;

import com.gitb.model.core.AnyContent;
import com.gitb.model.core.BasicRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Request asking a messaging service to send content to a target actor or endpoint.
 */
public class SendRequest extends BasicRequest {

    protected String to;
    protected List<AnyContent> input;

    /**
     * Returns the value of {@code to}.
     *
     * @return The value of {@code to}.
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of {@code to}.
     *
     * @param value The value to set.
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Returns the live list backing {@code input}.
     *
     * @return The live list for {@code input}.
     */
    public List<AnyContent> getInput() {
        if (input == null) {
            input = new ArrayList<>();
        }
        return this.input;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link SendRequest} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link SendRequest} instances using a fluent API.
     *
     * <p>Inherits {@code withSessionId} from {@link com.gitb.model.core.BasicRequest.Builder}.
     */
    public static class Builder extends BasicRequest.Builder<SendRequest, Builder> {

        private Builder() {
            super(new SendRequest());
        }

        /**
         * Adds one or more input content items to be sent.
         *
         * @param inputs The content items to add.
         * @return This builder.
         */
        public Builder withInput(AnyContent... inputs) {
            for (AnyContent input : inputs) {
                wrapped.getInput().add(input);
            }
            return this;
        }

        /**
         * Sets the identifier of the target actor or endpoint to send the content to.
         *
         * @param to The recipient identifier to set.
         * @return This builder.
         */
        public Builder withTo(String to) {
            wrapped.setTo(to);
            return this;
        }

    }

}
