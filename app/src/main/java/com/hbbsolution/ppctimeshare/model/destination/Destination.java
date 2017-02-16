package com.hbbsolution.ppctimeshare.model.destination;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tantr on 2/14/2017.
 */

public class Destination implements Serializable {

    public Destination() {
    }

    @SerializedName("id")
    private Integer id;
    @SerializedName("address")
    private String address;
    @SerializedName("price")
    private String price;
    @SerializedName("introduce")
    private String introduce;
    @SerializedName("service")
    private String service;
    @SerializedName("equipment")
    private String equipment;
    @SerializedName("name")
    private String name;
    @SerializedName("resort_type")
    private String resort_type;
    @SerializedName("images")
    private String [] images;
    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double lng;
    @SerializedName("distance")
    private double distance;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResort_type() {
        return resort_type;
    }

    public void setResort_type(String resort_type) {
        this.resort_type = resort_type;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    public Destination(Integer id, String address, String price, String introduce, String service, String equipment, String name, String resort_type, String[] images, double lat, double lng, double distance) {
        this.id = id;
        this.address = address;
        this.price = price;
        this.introduce = introduce;
        this.service = service;
        this.equipment = equipment;
        this.name = name;
        this.resort_type = resort_type;
        this.images = images;
        this.lat = lat;
        this.lng = lng;
        this.distance = distance;
    }
}
