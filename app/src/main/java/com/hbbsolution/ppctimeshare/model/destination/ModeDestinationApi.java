package com.hbbsolution.ppctimeshare.model.destination;

import android.util.Log;
import android.widget.Toast;

import com.hbbsolution.ppctimeshare.api.ApiClient;
import com.hbbsolution.ppctimeshare.api.ApiInterface;
import com.hbbsolution.ppctimeshare.listener.FetchDataCallback;
import com.hbbsolution.ppctimeshare.view.placenearby_tan.PlacenearbyActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tantr on 2/15/2017.
 */

public class ModeDestinationApi {
    PlacenearbyActivity placenearbyActivity;

    public void GetDestinationList (final FetchDataCallback dataCallback){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<DestinationResponse> call = apiService.getEventList();
        call.enqueue(new Callback<DestinationResponse>() {
            @Override
            public void onResponse(Call<DestinationResponse> call, Response<DestinationResponse> response) {
                if(response.isSuccessful()) {
                    try {
                        List<Destination> destinatList = response.body().getDestinationList();
                        dataCallback.onFetchSuccess(destinatList);
                    } catch (Exception e) {
                        dataCallback.onFetchFault(e);
                    }
                }
            }
            @Override
            public void onFailure(Call<DestinationResponse> call, Throwable t) {
                dataCallback.onFetchFault(new Exception(t));
                Log.d("data", t.toString());
            }
        });
    }

    public void GetDestinationList (final FetchDataCallback dataCallback, String lat, String lng, int distance){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<DestinationResponse> call = apiService.getPlacenearbytList(lat, lng, distance);
        call.enqueue(new Callback<DestinationResponse>() {
            @Override
            public void onResponse(Call<DestinationResponse> call, Response<DestinationResponse> response) {
                if(response.isSuccessful()) {
                    try {
                        List<Destination> destinatList = response.body().getDestinationList();
                        dataCallback.onFetchSuccess(destinatList);
                    } catch (Exception e) {
                        dataCallback.onFetchFault(e);
                    }
                }
            }
            @Override
            public void onFailure(Call<DestinationResponse> call, Throwable t) {
                dataCallback.onFetchFault(new Exception(t));
                Log.d("data", t.toString());
            }
        });
    }


}
