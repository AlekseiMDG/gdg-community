package com.alekseioshurkovdeveloper.network.model.about;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MetaCategory {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("shortname")
    @Expose
    private String shortname;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("sort_name")
    @Expose
    private String sortName;

    @SerializedName("photo")
    @Expose
    private Photo photo;

    @SerializedName("category_ids")
    @Expose
    private List<String> categoryIds = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public List<String> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }
}
