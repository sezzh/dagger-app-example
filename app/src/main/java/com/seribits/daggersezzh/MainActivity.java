package com.seribits.daggersezzh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

import com.seribits.daggersezzh.modules.MainActivityModule;
import com.seribits.daggersezzh.results.ResultActivity;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivityPresenter presenter;

    private TextView text;
    private AppCompatButton mBae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent();
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.target);
        mBae = (AppCompatButton) findViewById(R.id.holi);
        mBae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.openNewActivityByPresenter();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    protected void openNewActivity(String messageToSend) {
        DaggerApplication.get(this).createMessageComponent(messageToSend);
        startActivity(new Intent(this, ResultActivity.class));
    }

    private void setupActivityComponent() {
        System.out.println("in setup");
        DaggerApplication.get(this)
                .getAppComponent()
                .plus(new MainActivityModule(this))
                .inject(this);
    }
}
