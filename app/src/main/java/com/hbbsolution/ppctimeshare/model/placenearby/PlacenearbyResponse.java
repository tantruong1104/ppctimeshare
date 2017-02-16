package com.hbbsolution.ppctimeshare.model.placenearby;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tantr on 2/15/2017.
 */

public class PlacenearbyResponse {
    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public List<Placeneraby> getPlacenerabies() {
        return placenerabies;
    }

    public void setPlacenerabies(List<Placeneraby> placenerabies) {
        this.placenerabies = placenerabies;
    }

    public PlacenearbyResponse(int error, List<Placeneraby> placenerabies) {
        this.error = error;
        this.placenerabies = placenerabies;
    }

    @SerializedName("error")
    private int error;
    @SerializedName("data")
    private List<Placeneraby> placenerabies;

}
