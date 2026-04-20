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

import com.gitb.model.core.Parameter;
import com.gitb.model.core.TestModule;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition of a messaging service module and its configuration points.
 */
public class MessagingModule extends TestModule {

    protected List<Parameter> actorConfigs;
    protected List<Parameter> transactionConfigs;
    protected List<Parameter> listenConfigs;
    protected List<Parameter> receiveConfigs;
    protected List<Parameter> sendConfigs;

    /**
     * Returns the live list backing {@code actorConfigs}.
     *
     * @return The live list for {@code actorConfigs}.
     */
    public List<Parameter> getActorConfigs() {
        if (actorConfigs == null) {
            actorConfigs = new ArrayList<>();
        }
        return actorConfigs;
    }

    /**
     * Sets the value of {@code actorConfigs}.
     *
     * @param value The value to set.
     */
    public void setActorConfigs(List<Parameter> value) {
        this.actorConfigs = value;
    }

    /**
     * Returns the live list backing {@code transactionConfigs}.
     *
     * @return The live list for {@code transactionConfigs}.
     */
    public List<Parameter> getTransactionConfigs() {
        if (transactionConfigs == null) {
            transactionConfigs = new ArrayList<>();
        }
        return transactionConfigs;
    }

    /**
     * Sets the value of {@code transactionConfigs}.
     *
     * @param value The value to set.
     */
    public void setTransactionConfigs(List<Parameter> value) {
        this.transactionConfigs = value;
    }

    /**
     * Returns the live list backing {@code listenConfigs}.
     *
     * @return The live list for {@code listenConfigs}.
     */
    public List<Parameter> getListenConfigs() {
        if (listenConfigs == null) {
            listenConfigs = new ArrayList<>();
        }
        return listenConfigs;
    }

    /**
     * Sets the value of {@code listenConfigs}.
     *
     * @param value The value to set.
     */
    public void setListenConfigs(List<Parameter> value) {
        this.listenConfigs = value;
    }

    /**
     * Returns the live list backing {@code receiveConfigs}.
     *
     * @return The live list for {@code receiveConfigs}.
     */
    public List<Parameter> getReceiveConfigs() {
        if (receiveConfigs == null) {
            receiveConfigs = new ArrayList<>();
        }
        return receiveConfigs;
    }

    /**
     * Sets the value of {@code receiveConfigs}.
     *
     * @param value The value to set.
     */
    public void setReceiveConfigs(List<Parameter> value) {
        this.receiveConfigs = value;
    }

    /**
     * Returns the live list backing {@code sendConfigs}.
     *
     * @return The live list for {@code sendConfigs}.
     */
    public List<Parameter> getSendConfigs() {
        if (sendConfigs == null) {
            sendConfigs = new ArrayList<>();
        }
        return sendConfigs;
    }

    /**
     * Sets the value of {@code sendConfigs}.
     *
     * @param value The value to set.
     */
    public void setSendConfigs(List<Parameter> value) {
        this.sendConfigs = value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends TestModule.Builder<MessagingModule, Builder> {

        private Builder() {
            super(new MessagingModule());
        }

        public Builder withActorConfig(Parameter... configs) {
            for (Parameter config : configs) {
                wrapped.getActorConfigs().add(config);
            }
            return this;
        }

        public Builder withTransactionConfigs(Parameter... configs) {
            for (Parameter config : configs) {
                wrapped.getTransactionConfigs().add(config);
            }
            return this;
        }

        public Builder withListenConfigs(Parameter... configs) {
            for (Parameter config : configs) {
                wrapped.getListenConfigs().add(config);
            }
            return this;
        }

        public Builder withReceiveConfigs(Parameter... configs) {
            for (Parameter config : configs) {
                wrapped.getReceiveConfigs().add(config);
            }
            return this;
        }

        public Builder withSendConfigs(Parameter... configs) {
            for (Parameter config : configs) {
                wrapped.getSendConfigs().add(config);
            }
            return this;
        }

    }

}
