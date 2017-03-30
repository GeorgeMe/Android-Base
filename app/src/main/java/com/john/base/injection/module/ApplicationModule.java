package com.john.base.injection.module;

import android.app.Application;
import android.content.Context;
import com.john.base.data.remote.RibotsService;
import com.john.base.injection.ApplicationContext;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Provide application-level dependencies.
 */
@Module
public class ApplicationModule {
    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    RibotsService provideRibotsService() {
        return RibotsService.Creator.newRibotsService();
    }

}
