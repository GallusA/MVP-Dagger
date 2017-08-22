package com.example.gallusawa.mvp_dagger.Injection.mainActivity;

import com.example.gallusawa.mvp_dagger.view.mainAcitivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gallusawa on 8/21/17.
 */

@Module
public class MainActivityModule {

    @Provides
    MainActivityPresenter providesMainActivityPresenter(){
        return  new MainActivityPresenter();
    }
}
