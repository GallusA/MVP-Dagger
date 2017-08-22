package com.example.gallusawa.mvp_dagger;

/**
 * Created by gallusawa on 8/21/17.
 */

public interface BasePresenter<V extends  BaseView> {

    void attachView(V view);
    void removeView();

}
