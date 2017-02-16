package com.hbbsolution.ppctimeshare.api;

import com.hbbsolution.ppctimeshare.model.destination.DestinationResponse;
import com.hbbsolution.ppctimeshare.model.placenearby.PlacenearbyResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by tantr on 2/15/2017.
 */

public interface ApiInterface {
    @GET("resort/random")
    Call<DestinationResponse> getEventList();

    @GET("resort/nearby")
    Call<DestinationResponse> getPlacenearbytList(@Query("lat") String lat, @Query("lng") String lng, @Query("km") int distance);
}
