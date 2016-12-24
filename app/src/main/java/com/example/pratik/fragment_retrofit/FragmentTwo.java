package com.example.pratik.fragment_retrofit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class FragmentTwo extends Fragment implements SeconFragActivity.actiToFrag{


    @Bind(R.id.tv_writer)
    TextView tvWriter;
    @Bind(R.id.tv_time)
    TextView tvTime;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);

        ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void sendTofrag(String s1, String s2) {
      tvWriter.setText(s1);
      tvTime.setText(s2);
    }
}
