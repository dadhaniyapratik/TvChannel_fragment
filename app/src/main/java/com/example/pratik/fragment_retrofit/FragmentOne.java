package com.example.pratik.fragment_retrofit;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pratik.fragment_retrofit.Model.ListOfShow;
import com.example.pratik.fragment_retrofit.Model.ProgramInfo;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 19-12-2016.
 */



public class FragmentOne extends Fragment {
    @Bind(R.id.list_view)
    ListView listView;
    List<ListOfShow> listOfShows;
    List<ProgramInfo> programInfos;
    ProgramInfo programInfo;

    CustomBaseAdapter customBaseAdapter;
     Activity activity;
    String url = "http://indian-television-guide.appspot.com/";



    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment
        activity=getActivity();
        View view = inflater.inflate(
                R.layout.fragment_one, container, false);
        ButterKnife.bind(this, view);


//        programInfo = new ProgramInfo();
        listOfShows = new ArrayList<>();
        programInfos = new ArrayList<>();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitObjectAPI service = retrofit.create(RetrofitObjectAPI.class);

        Call<ProgramInfo> call = service.getStudentDetails();

        call.enqueue(new Callback<ProgramInfo>() {
            @Override
            public void onResponse(Call<ProgramInfo> call, Response<ProgramInfo> response) {
                listOfShows = response.body().getListOfShows();
                programInfo = response.body();



                customBaseAdapter = new CustomBaseAdapter(getActivity(), listOfShows,programInfo);
                listView.setAdapter(customBaseAdapter);
                customBaseAdapter.notifyDataSetChanged();
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        ProgramInfo programInfo = (ProgramInfo)customBaseAdapter.getItem(position);
                        ListOfShow listOfShow = (ListOfShow)customBaseAdapter.getItem(position);
//                        CustomBaseAdapter customBaseAdapter = (CustomBaseAdapter)parent.getAdapter();
//                        customBaseAdapter.getItem(position);
//                        String s1 = programInfo.getChannelName();
                        String s2 = listOfShow.getShowTime();
                        String s3 = listOfShow.getShowDetails().getWriter();

                        Intent intent=new Intent(getActivity(),SeconFragActivity.class);
                        intent.putExtra("s1",s2);
                        intent.putExtra("s2",s3);
                        startActivity(intent);



                        Toast.makeText(getActivity(), "jhkhk"+s2 +s3, Toast.LENGTH_SHORT).show();
                    }
                });

            }

            @Override
            public void onFailure(Call<ProgramInfo> call, Throwable t) {

            }
        });


        return view;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


}