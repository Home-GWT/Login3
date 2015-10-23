package com.tutorialspoint.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * {@link http://www.tutorialspoint.com/gwt/gwt_uibinder.htm}
 * {@link http://andrewyakovlev-gwt.blogspot.com/2013/02/gwt-uibinder.html}
 * {@link http://ru.overcram.com/questions/1026033/Google-Web-Toolkit---UiBinder-%D1%81-CSS-styling}
 */
public class MainPage implements EntryPoint {
    public void onModuleLoad() {
        RootPanel.get().add(new LoginPage());
    }
}
