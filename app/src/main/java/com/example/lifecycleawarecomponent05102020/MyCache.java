package com.example.lifecycleawarecomponent05102020;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class MyCache implements LifecycleObserver {

    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor mEditor;

    public void createCache(Context context){
        mSharedPreferences = context.getSharedPreferences("AppCache", Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void clearCache(){
        if (mSharedPreferences != null){
            if (mEditor != null){
                mEditor.clear();
                mEditor.commit();
                Log.d("BBB","Clear cache");
            }
        }
    }
}
