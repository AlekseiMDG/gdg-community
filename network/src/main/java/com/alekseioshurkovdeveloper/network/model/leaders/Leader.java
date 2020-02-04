package com.alekseioshurkovdeveloper.network.model.leaders;

import com.alekseioshurkovdeveloper.network.model.about.Photo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Leader {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("joined")
    @Expose
    private String joined;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("localized_country_name")
    @Expose
    private String localizedCountryName;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("photo")
    @Expose
    private Photo photo;
    @SerializedName("group_profile")
    @Expose
    private GroupProfile groupProfile;
    @SerializedName("is_pro_admin")
    @Expose
    private String isProAdmin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocalizedCountryName() {
        return localizedCountryName;
    }

    public void setLocalizedCountryName(String localizedCountryName) {
        this.localizedCountryName = localizedCountryName;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public GroupProfile getGroupProfile() {
        return groupProfile;
    }

    public void setGroupProfile(GroupProfile groupProfile) {
        this.groupProfile = groupProfile;
    }

    public String getIsProAdmin() {
        return isProAdmin;
    }

    public void setIsProAdmin(String isProAdmin) {
        this.isProAdmin = isProAdmin;
    }
}
