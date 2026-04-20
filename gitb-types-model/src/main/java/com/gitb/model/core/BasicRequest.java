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
 * Base request carrying the session identifier of an ongoing interaction.
 */
public class BasicRequest {

    protected String sessionId;

    /**
     * Returns the value of {@code sessionId}.
     *
     * @return The value of {@code sessionId}.
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of {@code sessionId}.
     *
     * @param value The value to set.
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    public static BuilderForBasicRequest builderForBasicRequest() {
        return new BuilderForBasicRequest();
    }

    public static class BuilderForBasicRequest extends Builder<BasicRequest, BuilderForBasicRequest> {

        private BuilderForBasicRequest() {
            super(new BasicRequest());
        }

    }

    public static class Builder<T extends BasicRequest, B extends Builder<T, B>> {

        protected final T wrapped;

        protected Builder(T wrapped) {
            this.wrapped = wrapped;
        }

        @SuppressWarnings("unchecked")
        public B withSessionId(String sessionId) {
            wrapped.setSessionId(sessionId);
            return (B) this;
        }

        public T build() {
            return wrapped;
        }

    }
}
