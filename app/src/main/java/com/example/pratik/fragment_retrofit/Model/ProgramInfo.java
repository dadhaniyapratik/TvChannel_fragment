package com.example.pratik.fragment_retrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Pratik on 17-Dec-16.
 */

public class ProgramInfo {
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("channelName")
    @Expose
    private String channelName;
    @SerializedName("listOfShows")
    @Expose
    private List<ListOfShow> listOfShows = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public List<ListOfShow> getListOfShows() {
        return listOfShows;
    }

    public void setListOfShows(List<ListOfShow> listOfShows) {
        this.listOfShows = listOfShows;
    }

}
