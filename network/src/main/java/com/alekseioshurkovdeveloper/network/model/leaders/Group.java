package com.alekseioshurkovdeveloper.network.model.leaders;

import com.alekseioshurkovdeveloper.network.model.about.Photo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Group {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("urlname")
    @Expose
    private String urlname;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("who")
    @Expose
    private String who;

    @SerializedName("members")
    @Expose
    private String members;

    @SerializedName("join_mode")
    @Expose
    private String joinMode;

    @SerializedName("localized_location")
    @Expose
    private String localizedLocation;

    @SerializedName("group_photo")
    @Expose
    private Photo groupPhoto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getJoinMode() {
        return joinMode;
    }

    public void setJoinMode(String joinMode) {
        this.joinMode = joinMode;
    }

    public String getLocalizedLocation() {
        return localizedLocation;
    }

    public void setLocalizedLocation(String localizedLocation) {
        this.localizedLocation = localizedLocation;
    }

    public Photo getGroupPhoto() {
        return groupPhoto;
    }

    public void setGroupPhoto(Photo groupPhoto) {
        this.groupPhoto = groupPhoto;
    }
}
