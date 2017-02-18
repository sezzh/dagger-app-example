package com.seribits.daggersezzh.results;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.seribits.daggersezzh.DaggerApplication;
import com.seribits.daggersezzh.R;

import javax.inject.Inject;

public class ResultActivity extends AppCompatActivity {

    @Inject
    ResultActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent();
        setContentView(R.layout.activity_result);

        TextView text = (TextView) findViewById(R.id.result_message);
        text.setText(presenter.getMessageFromMain());
    }

    private void setupActivityComponent() {
        DaggerApplication.get(this).getMessageComponent()
                .plus(new ResultActivityModule(this))
                .inject(this);
    }
}
