package com.alekseioshurkovdeveloper.network.model.about;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Community {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("urlname")
    @Expose
    private String urlname;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("created")
    @Expose
    private String created;

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("untranslated_city")
    @Expose
    private String untranslatedCity;

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("localized_country_name")
    @Expose
    private String localizedCountryName;

    @SerializedName("localized_location")
    @Expose
    private String localizedLocation;

    @SerializedName("region2")
    @Expose
    private String region2;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("join_mode")
    @Expose
    private String joinMode;

    @SerializedName("visibility")
    @Expose
    private String visibility;

    @SerializedName("lat")
    @Expose
    private String lat;

    @SerializedName("lon")
    @Expose
    private String lon;

    @SerializedName("members")
    @Expose
    private Integer members;

    @SerializedName("member_pay_fee")
    @Expose
    private String memberPayFee;

    @SerializedName("organizer")
    @Expose
    private Member organizer;

    @SerializedName("who")
    @Expose
    private String who;

    @SerializedName("group_photo")
    @Expose
    private Photo groupPhoto;

    @SerializedName("key_photo")
    @Expose
    private Photo keyPhoto;

    @SerializedName("timezone")
    @Expose
    private String timezone;

    @SerializedName("category")
    @Expose
    private Category category;

    @SerializedName("meta_category")
    @Expose
    private MetaCategory metaCategory;

    @SerializedName("pro_network")
    @Expose
    private ProNetwork proNetwork;

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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUntranslatedCity() {
        return untranslatedCity;
    }

    public void setUntranslatedCity(String untranslatedCity) {
        this.untranslatedCity = untranslatedCity;
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

    public String getLocalizedLocation() {
        return localizedLocation;
    }

    public void setLocalizedLocation(String localizedLocation) {
        this.localizedLocation = localizedLocation;
    }

    public String getRegion2() {
        return region2;
    }

    public void setRegion2(String region2) {
        this.region2 = region2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJoinMode() {
        return joinMode;
    }

    public void setJoinMode(String joinMode) {
        this.joinMode = joinMode;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
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

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public String getMemberPayFee() {
        return memberPayFee;
    }

    public void setMemberPayFee(String memberPayFee) {
        this.memberPayFee = memberPayFee;
    }

    public Member getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Member organizer) {
        this.organizer = organizer;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public Photo getGroupPhoto() {
        return groupPhoto;
    }

    public void setGroupPhoto(Photo groupPhoto) {
        this.groupPhoto = groupPhoto;
    }

    public Photo getKeyPhoto() {
        return keyPhoto;
    }

    public void setKeyPhoto(Photo keyPhoto) {
        this.keyPhoto = keyPhoto;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public MetaCategory getMetaCategory() {
        return metaCategory;
    }

    public void setMetaCategory(MetaCategory metaCategory) {
        this.metaCategory = metaCategory;
    }

    public ProNetwork getProNetwork() {
        return proNetwork;
    }

    public void setProNetwork(ProNetwork proNetwork) {
        this.proNetwork = proNetwork;
    }
}
