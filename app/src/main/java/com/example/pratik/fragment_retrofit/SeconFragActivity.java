package com.example.pratik.fragment_retrofit;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SeconFragActivity extends FragmentActivity  {

    actiToFrag act;
    String data1,data2;
    interface actiToFrag{
        void sendTofrag(String s1,String s2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secon_frag);
        Intent intent=getIntent();
        data1=intent.getStringExtra("s1");
        data2=intent.getStringExtra("s2");

        act.sendTofrag(data1,data2);

    }

    @Override
    public void onAttachFragment(android.support.v4.app.Fragment fragment) {
        super.onAttachFragment(fragment);
        act= (actiToFrag) fragment;
    }
}
