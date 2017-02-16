package com.hbbsolution.ppctimeshare.model.placenearby;

import android.util.Log;
import android.widget.Toast;

import com.hbbsolution.ppctimeshare.api.ApiClient;
import com.hbbsolution.ppctimeshare.api.ApiInterface;
import com.hbbsolution.ppctimeshare.listener.FetchDataCallback;
import com.hbbsolution.ppctimeshare.listener.Fetchback;
import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.model.destination.DestinationResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tantr on 2/15/2017.
 */

public class ModelPlacenearbyApi {
//    public void GetDestinationList (final Fetchback dataCallback){
//        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
//        Call<PlacenearbyResponse> call = apiService.getPlacenearbytList();
//        call.enqueue(new Callback<PlacenearbyResponse>() {
//            @Override
//            public void onResponse(Call<PlacenearbyResponse> call, Response<PlacenearbyResponse> response) {
//                if(response.isSuccessful()) {
//                    try {
////                        String message=  response.message();
//                        List<Placeneraby> destinatList = response.body().getPlacenerabies();
//                        dataCallback.onFetchSuccess(destinatList);
//                    } catch (Exception e) {
//                        dataCallback.onFetchFault(e);
//
//                    }
//                }
//            }
//            @Override
//            public void onFailure(Call<PlacenearbyResponse> call, Throwable t) {
//                dataCallback.onFetchFault(new Exception(t));
//                Log.d("data", t.toString());
////                Toast.makeText(placenearbyActivity, t.toString(), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }


}
