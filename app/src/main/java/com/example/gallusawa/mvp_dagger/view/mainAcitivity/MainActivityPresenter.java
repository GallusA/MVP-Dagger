package com.example.gallusawa.mvp_dagger.view.mainAcitivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

/**
 * Created by gallusawa on 8/21/17.
 */

public class MainActivityPresenter implements MainActivityContract .Presenter{

 MainActivityContract.View view;

    Context context;

    private final String TAG =" MainActivityPresenter";

    public void attachView(MainActivityContract.View view) {
        this.view =view;

    }

    @Override
    public void removeView() {
        this.view = null;

    }

    @Override
    public void savePerson(String person) {
        Log.d(TAG, "savePerson: " + person);
        view.isPersonSave(true);

        SharedPreferences sharedPrefernces = context.getSharedPreferences("myPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefernces.edit();
        editor.putString("person", person);
        boolean isSaved = editor.commit();

    }

    @Override
    public String getPerson() {

        String person;

        SharedPreferences sharedPrefernces = context.getSharedPreferences("myPref", Context.MODE_PRIVATE);
        person = sharedPrefernces.getString("person", "default person");
        view.sendPerson(person);



        return null;

    }
    @Override
    public void setContext(Context context){
        this.context=context;
    }
}
