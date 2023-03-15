package com.mehditmimi.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      //  Button button = new Button(this);
      //  button.setText("hello world");
      //  setContentView(button);
        setContentView(R.layout.activity_main);
    }
}
