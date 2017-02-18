package com.seribits.daggersezzh;

import android.app.Application;
import android.content.Context;

import com.seribits.daggersezzh.components.AppComponent;
import com.seribits.daggersezzh.components.DaggerAppComponent;
import com.seribits.daggersezzh.components.MessageComponent;
import com.seribits.daggersezzh.modules.AppModule;
import com.seribits.daggersezzh.modules.MessageModule;

/**
 * Created by sezzh on 17/02/17.
 */

public class DaggerApplication extends Application {

    private AppComponent appComponent;
    private MessageComponent messageComponent;

    public static DaggerApplication get(Context context) {
        return (DaggerApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initAppComponent();
    }

    private void initAppComponent() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void createMessageComponent(String message) {
        messageComponent = appComponent.plus(new MessageModule(message));
    }

    public MessageComponent getMessageComponent() {
        return messageComponent;
    }
}
