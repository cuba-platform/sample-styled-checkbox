/*
 * Copyright (c) 2016 styled-checkbox
 */

package com.company.styledcheckbox.web.screens;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;

import javax.inject.Inject;
import java.util.Map;

public class StyledCheckboxExample extends AbstractWindow {

    @Inject
    private CheckBox sampleCheckBox;

    @Override
    public void init(Map<String, Object> params) {
        com.vaadin.ui.CheckBox vaadinCheckBox = (com.vaadin.ui.CheckBox) WebComponentsHelper.unwrap(sampleCheckBox);
        vaadinCheckBox.setCaptionAsHtml(true);
        vaadinCheckBox.setCaption("<span class=\"onoffswitch-inner\"></span><span class=\"onoffswitch-switch\"></span>");
    }
}