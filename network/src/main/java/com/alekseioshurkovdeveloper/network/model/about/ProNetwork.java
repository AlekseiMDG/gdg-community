package com.alekseioshurkovdeveloper.network.model.about;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProNetwork {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("urlname")
    @Expose
    private String urlname;

    @SerializedName("number_of_groups")
    @Expose
    private String numberOfGroups;

    @SerializedName("network_url")
    @Expose
    private String networkUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname;
    }

    public String getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(String numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public String getNetworkUrl() {
        return networkUrl;
    }

    public void setNetworkUrl(String networkUrl) {
        this.networkUrl = networkUrl;
    }
}
