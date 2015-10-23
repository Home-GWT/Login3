package com.tutorial.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
