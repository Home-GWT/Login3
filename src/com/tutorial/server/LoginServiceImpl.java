package com.tutorial.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tutorial.client.rpc.LoginService;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}