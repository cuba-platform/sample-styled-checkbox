/*
 * Copyright (c) 2016 Haulmont
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.company.styledcheckbox.web.screens;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.CheckBox;

import javax.inject.Inject;
import java.util.Map;

public class StyledCheckboxExample extends AbstractWindow {

    @Inject
    private CheckBox sampleCheckBox;

    @Override
    public void init(Map<String, Object> params) {
        com.vaadin.ui.CheckBox vaadinCheckBox = sampleCheckBox.unwrap(com.vaadin.ui.CheckBox.class);
        vaadinCheckBox.setCaptionAsHtml(true);
        vaadinCheckBox.setCaption("<span class=\"onoffswitch-inner\"></span><span class=\"onoffswitch-switch\"></span>");
    }
}