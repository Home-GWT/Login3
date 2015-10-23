package com.tutorial.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tutorial.client.rpc.LoginPageService;

public class LoginPageServiceImpl extends RemoteServiceServlet implements LoginPageService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}