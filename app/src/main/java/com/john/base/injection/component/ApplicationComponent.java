package com.john.base.injection.component;

import android.app.Application;
import android.content.Context;
import com.john.base.data.DataManager;
import com.john.base.data.SyncService;
import com.john.base.data.local.DatabaseHelper;
import com.john.base.data.local.PreferencesHelper;
import com.john.base.data.remote.RibotsService;
import com.john.base.injection.ApplicationContext;
import com.john.base.injection.module.ApplicationModule;
import com.john.base.util.RxEventBus;
import dagger.Component;

import javax.inject.Singleton;


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext
    Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
