package com.example.pratik.fragment_retrofit;

import com.example.pratik.fragment_retrofit.Model.ProgramInfo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Pratik on 17-Dec-16.
 */

public interface RetrofitObjectAPI {
    @GET("/indian_television_guide?channel=%26tv&date=23122016")
    Call<ProgramInfo> getStudentDetails();
}
