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
 * Request used to signal that a message is to be received by a messaging service.
 */
public class ReceiveRequest extends BasicRequest {

    protected String callId;
    protected String from;
    protected List<AnyContent> input;

    /**
     * Returns the value of {@code callId}.
     *
     * @return The value of {@code callId}.
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Sets the value of {@code callId}.
     *
     * @param value The value to set.
     */
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * Returns the value of {@code from}.
     *
     * @return The value of {@code from}.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of {@code from}.
     *
     * @param value The value to set.
     */
    public void setFrom(String value) {
        this.from = value;
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends BasicRequest.Builder<ReceiveRequest, Builder> {

        private Builder() {
            super(new ReceiveRequest());
        }

        public Builder withInput(AnyContent... inputs) {
            for (AnyContent input : inputs) {
                wrapped.getInput().add(input);
            }
            return this;
        }

        public Builder withCallId(String callId) {
            wrapped.setCallId(callId);
            return this;
        }

        public Builder withFrom(String from) {
            wrapped.setFrom(from);
            return this;
        }

    }

}
