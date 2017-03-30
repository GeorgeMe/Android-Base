package com.john.base.injection.component;

import com.john.base.injection.PerActivity;
import com.john.base.injection.module.ActivityModule;
import com.john.base.ui.main.MainActivity;
import dagger.Subcomponent;


/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
