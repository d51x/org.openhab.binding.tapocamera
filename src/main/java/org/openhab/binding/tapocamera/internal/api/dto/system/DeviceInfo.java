/**
 * Copyright (c) 2010-2023 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.tapocamera.internal.api.dto.system;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * The type Device info.
 *
 * @author "Dmintry P (d51x)" - Initial contribution
 */
public class DeviceInfo implements Serializable {
    private static final long serialVersionUID = 418701930052854366L;
    /**
     * The Basic.
     */
    @SerializedName("basic_info")
    public DeviceInfoBasic basic;
    /**
     * The Full.
     */
    @SerializedName("info")
    public DeviceInfoFull full;

    @Override
    public String toString() {
        return "DeviceInfo{" + "basic=" + basic + ", full=" + full + '}';
    }
}
