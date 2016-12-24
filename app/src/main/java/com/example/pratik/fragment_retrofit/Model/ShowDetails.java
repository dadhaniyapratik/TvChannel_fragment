package com.example.pratik.fragment_retrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Pratik on 17-Dec-16.
 */

public class ShowDetails {
    @SerializedName("Writer")
    @Expose
    private String writer;
    @SerializedName("Actor")
    @Expose
    private String actor;
    @SerializedName("Language:")
    @Expose
    private String language;
    @SerializedName("Creator")
    @Expose
    private String creator;
    @SerializedName("Release Date")
    @Expose
    private String releaseDate;
    @SerializedName("Producer")
    @Expose
    private String producer;
    @SerializedName("Genre:")
    @Expose
    private String genre;
    @SerializedName("Director")
    @Expose
    private String director;
    @SerializedName("Show Type:")
    @Expose
    private String showType;
    @SerializedName("Show Description")
    @Expose
    private String showDescription;
    @SerializedName("Created By")
    @Expose
    private String createdBy;
    @SerializedName("Judges")
    @Expose
    private String judges;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getShowDescription() {
        return showDescription;
    }

    public void setShowDescription(String showDescription) {
        this.showDescription = showDescription;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getJudges() {
        return judges;
    }

    public void setJudges(String judges) {
        this.judges = judges;
    }

}
