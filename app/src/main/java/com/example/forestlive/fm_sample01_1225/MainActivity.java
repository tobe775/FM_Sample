package com.example.forestlive.fm_sample01_1225;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity implements Fragment_One.CallbackOne, Fragment_Two.CallbackTwo {

    private final String TAG = "MainActivity_TAG";

    private Fragment_One fm_one = null;
    private Fragment_Two fm_two = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm_one = (Fragment_One) getFragmentManager().findFragmentById(R.id.fm_one);
        fm_one.setOnCallBackLisner(this);

        fm_two = (Fragment_Two) getFragmentManager().findFragmentById(R.id.fm_two);
        fm_two.setOnCallBackLisner(this);
        fm_two.TestMessage("Hi");
    }

    @Override
    public void onTestOne(String url) {
        Log.d(TAG, "onTestOne  " + url);
    }

    @Override
    public void onTestTwo(String url) {
        Log.d(TAG, "onTestTwo  " + url);
    }
}
