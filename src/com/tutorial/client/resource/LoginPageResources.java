package com.tutorial.client.resource;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface LoginPageResources extends ClientBundle {
    /**
     * Sample CssResource.
     */
    public interface MyCSS extends CssResource {
        String blackText();
        String redText();
        String loginButton();
        String box();
        String background();
    }

    @Source("css/style.css")
    MyCSS style();
}