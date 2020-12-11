package com.example.lifecycleawarecomponent05102020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyCache myCache;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCache = new MyCache();
        myCache.createCache(this);
        getLifecycle().addObserver(myCache);

    }
}