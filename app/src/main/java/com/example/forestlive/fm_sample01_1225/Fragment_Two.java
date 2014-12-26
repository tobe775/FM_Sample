package com.example.forestlive.fm_sample01_1225;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by forestlive on 2014/12/25.
 */
public class Fragment_Two extends Fragment implements View.OnClickListener{

    private CallbackTwo mCallback;

    private Button bt_two = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fargment_two, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bt_two = (Button)view.findViewById(R.id.bt_two);
        bt_two.setOnClickListener(this);
    }

    public interface CallbackTwo {
        void onTestTwo(String url);
    }

    public void setOnCallBackLisner(CallbackTwo callback) {
        this.mCallback = callback;
    }

    public void TestMessage(String message){
        Log.d("OUT", "mes Two: " + message);


    }

    @Override
    public void onClick(View v) {
        mCallback.onTestTwo("Hello Main. Two");
    }
}
