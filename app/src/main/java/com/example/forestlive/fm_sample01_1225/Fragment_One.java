package com.example.forestlive.fm_sample01_1225;

import android.app.Activity;
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
public class Fragment_One extends Fragment implements View.OnClickListener{

    private CallbackOne mCallback = null;

    private Button bt_one = null;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fargment_one, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bt_one = (Button)view.findViewById(R.id.bt_one);
        bt_one.setOnClickListener(this);
    }

    public interface CallbackOne {
        void onTestOne(String url);
    }

    public void setOnCallBackLisner(CallbackOne callback) {
        this.mCallback = callback;
    }

    public void TestMessage(String message){
        Log.d("OUT","mes One : " + message);
    }


    @Override
    public void onClick(View v) {
        mCallback.onTestOne("Hello Main. One");
    }
}
