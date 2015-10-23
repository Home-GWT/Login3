package com.tutorialspoint.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("MainPageService")
public interface MainPageService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class  (Утилита/Удобство класс)
     * Use MainPageService.App.getInstance() to access static instance of MainPageServiceAsync
     */
    public static class App {
        private static MainPageServiceAsync ourInstance = GWT.create(MainPageService.class);
        public static synchronized MainPageServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
