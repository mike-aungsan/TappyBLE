/*
 * Copyright (c) 2016. Papyrus Electronics, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * you may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.taptrack.tcmptappy.ui.modules.mainnavigationbar;

import com.taptrack.tcmptappy.data.ActiveTappyWithStatus;
import com.taptrack.tcmptappy.tappy.ble.TappyBleDeviceDefinition;
import com.taptrack.tcmptappy.ui.mvp.Vista;

import java.util.List;

public interface MainNavigationVista extends Vista<MainNavigationPresenter> {
    public void setActiveTappies(List<ActiveTappyWithStatus> tappies);
    public void setSavedTappies(List<TappyBleDeviceDefinition> tappies);
    public void setCommunicationActive(boolean isActive);
    public void setNdefBackground(boolean isNdefBackground);

    public void setDisplayData(List<ActiveTappyWithStatus> activeTappies,
                               List<TappyBleDeviceDefinition> savedTappies,
                               boolean communicationActive,
                               boolean ndefLaunch);
    public void displayTooManyTappies(int maxLimit);
}
