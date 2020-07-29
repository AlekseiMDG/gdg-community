package com.alekseioshurkovdeveloper.network.model.about;

import com.google.gson.annotations.SerializedName;

public enum Status {

    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("prereg")
    PREREG("prereg"),

    @SerializedName("unknown")
    UNKNOW("unknown");

    private String mStatus;

    Status(String status) {
        mStatus = status;
    }

    public String getStatus() {
        return mStatus;
    }
}
