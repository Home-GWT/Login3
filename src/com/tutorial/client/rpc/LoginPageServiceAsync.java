package com.tutorial.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginPageServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
