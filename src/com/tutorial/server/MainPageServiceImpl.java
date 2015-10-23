package com.tutorial.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tutorial.client.MainPageService;

public class MainPageServiceImpl extends RemoteServiceServlet implements MainPageService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}