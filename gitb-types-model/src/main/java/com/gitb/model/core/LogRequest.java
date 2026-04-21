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
 * Log entry reported for a specific session.
 */
public class LogRequest {

    protected String sessionId;
    protected String message;
    protected LogLevel level;

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

    /**
     * Returns the value of {@code message}.
     *
     * @return The value of {@code message}.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of {@code message}.
     *
     * @param value The value to set.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Returns the value of {@code level}.
     *
     * @return The value of {@code level}.
     */
    public LogLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of {@code level}.
     *
     * @param value The value to set.
     */
    public void setLevel(LogLevel value) {
        this.level = value;
    }

    /**
     * Creates a new {@link Builder} to construct a {@link LogRequest} instance.
     *
     * @return A new builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for constructing {@link LogRequest} instances using a fluent API.
     */
    public static class Builder {

        private final LogRequest wrapped;

        private Builder() {
            this.wrapped = new LogRequest();
        }

        /**
         * Sets the session identifier to which the log entry belongs.
         *
         * @param sessionId The session identifier to set.
         * @return This builder.
         */
        public Builder withSessionId(String sessionId) {
            wrapped.setSessionId(sessionId);
            return this;
        }

        /**
         * Sets the log message text.
         *
         * @param message The message to set.
         * @return This builder.
         */
        public Builder withMessage(String message) {
            wrapped.setMessage(message);
            return this;
        }

        /**
         * Sets the severity level of the log entry.
         *
         * @param level The log level to set.
         * @return This builder.
         */
        public Builder withLevel(LogLevel level) {
            wrapped.setLevel(level);
            return this;
        }

        /**
         * Builds and returns the configured {@link LogRequest} instance.
         *
         * @return The configured instance.
         */
        public LogRequest build() {
            return wrapped;
        }

    }

}
