package com.hbbsolution.ppctimeshare.model.destination;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tantr on 2/15/2017.
 */

public class DestinationResponse {


    @SerializedName("error")
    private Integer error;
    @SerializedName("data")
    private List<Destination> destinationList;

    public DestinationResponse(Integer error, List<Destination> destinationList) {
        this.error = error;
        this.destinationList = destinationList;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public List<Destination> getDestinationList() {
        return destinationList;
    }

    public void setDestinationList(List<Destination> destinationList) {
        this.destinationList = destinationList;
    }
}
