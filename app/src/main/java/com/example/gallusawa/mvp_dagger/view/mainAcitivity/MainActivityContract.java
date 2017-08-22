package com.example.gallusawa.mvp_dagger.view.mainAcitivity;

import android.content.Context;

import com.example.gallusawa.mvp_dagger.BasePresenter;
import com.example.gallusawa.mvp_dagger.BaseView;

/**
 * Created by gallusawa on 8/21/17.
 */

public interface MainActivityContract {

    Context context = null;

    interface View extends BaseView{

        void isPersonSave(boolean isSaved);
        void sendPerson(String person);

    }

    interface Presenter extends BasePresenter<View>{


        void savePerson(String person);
        String getPerson();
        void  setContext(Context context);


    }


}
