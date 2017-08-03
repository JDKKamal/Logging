package com.jdkgroup.logging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jdkgroup.utils.Debug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Debug.log("Tag", "Welcome to  android");  
    }
}
