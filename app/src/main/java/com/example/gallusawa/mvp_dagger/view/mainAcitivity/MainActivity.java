package com.example.gallusawa.mvp_dagger.view.mainAcitivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.gallusawa.mvp_dagger.Injection.mainActivity.DaggerMainActivityComponent;
import com.example.gallusawa.mvp_dagger.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{



    private static final String TAG ="MainActivity" ;

    @Inject
    MainActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DaggerMainActivityComponent.create().inject(this);




        presenter.attachView(this);
       presenter.setContext(this);

    }

    @Override
    public void showerror(String person) {



    }

    @Override
    public void isPersonSave(boolean isSaved) {

        Log.d(TAG, "isPersonSave: " + isSaved);

    }

    @Override
    public void sendPerson(String person) {

    }


    public void DoMAgic(View view) {
        presenter.savePerson("John Doe");
      //  presenter.getPerson();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.removeView();
    }


    public void GetPerson(View view) {
        presenter.getPerson();
    }
}
