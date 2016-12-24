package com.example.pratik.fragment_retrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Pratik on 17-Dec-16.
 */

public class ListOfShow {
    @SerializedName("showTitle")
    @Expose
    private String showTitle;
    @SerializedName("showTime")
    @Expose
    private String showTime;
    @SerializedName("showThumb")
    @Expose
    private String showThumb;
    @SerializedName("showDetails")
    @Expose
    private ShowDetails showDetails;

    public String getShowTitle() {
        return showTitle;
    }

    public void setShowTitle(String showTitle) {
        this.showTitle = showTitle;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getShowThumb() {
        return showThumb;
    }

    public void setShowThumb(String showThumb) {
        this.showThumb = showThumb;
    }

    public ShowDetails getShowDetails() {
        return showDetails;
    }

    public void setShowDetails(ShowDetails showDetails) {
        this.showDetails = showDetails;
    }

}
