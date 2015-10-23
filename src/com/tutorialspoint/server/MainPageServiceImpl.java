package com.tutorialspoint.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.tutorialspoint.client.MainPageService;

public class MainPageServiceImpl extends RemoteServiceServlet implements MainPageService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}