package com.seribits.daggersezzh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.seribits.daggersezzh.components.DaggerMyComponent;
import com.seribits.daggersezzh.components.MyComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject BackendService backendService;
    private MyComponent component;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.target);

        component = DaggerMyComponent.builder().build();
        component.inject(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        text.setText(backendService.callServer());
    }
}
