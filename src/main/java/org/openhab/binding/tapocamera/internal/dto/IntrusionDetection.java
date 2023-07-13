/*
 * Copyright (c) 2010-2023 Contributors to the openHAB project
 *
 *  See the NOTICE file(s) distributed with this work for additional
 *  information.
 *
 * This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.openhab.binding.tapocamera.internal.dto;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class IntrusionDetection implements Serializable {

    @SerializedName("enabled")
    private String enabled = "off";

    public IntrusionDetection() {
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "IntrusionDetection{" + "enabled='" + enabled + '\'' + '}';
    }
}