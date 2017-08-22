package com.example.gallusawa.mvp_dagger.Injection.mainActivity;

import com.example.gallusawa.mvp_dagger.view.mainAcitivity.MainActivity;

import dagger.Component;

/**
 * Created by gallusawa on 8/21/17.
 */


@Component(modules = MainActivityModule.class)
    public interface MainActivityComponent {

    void inject(MainActivity mainActivity);


}
