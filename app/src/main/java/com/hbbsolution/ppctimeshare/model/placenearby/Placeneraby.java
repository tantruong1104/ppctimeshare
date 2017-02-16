package com.hbbsolution.ppctimeshare.model.placenearby;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tantr on 2/15/2017.
 */

public class Placeneraby {

    public Placeneraby(int id, String name, String distance) {
        this.id = id;
        this.name = name;
        this.distance = distance;
    }

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("distance")
    private String distance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
