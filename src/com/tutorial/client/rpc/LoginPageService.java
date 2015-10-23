package com.tutorial.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("LoginPageService")
public interface LoginPageService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class  (Утилита/Удобство класс)
     * Use MainPageService.App.getInstance() to access static instance of MainPageServiceAsync
     */
    public static class App {
        private static LoginPageServiceAsync ourInstance = GWT.create(LoginPageService.class);
        public static synchronized LoginPageServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
