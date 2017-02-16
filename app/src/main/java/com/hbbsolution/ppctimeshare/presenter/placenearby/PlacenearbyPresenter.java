package com.hbbsolution.ppctimeshare.presenter.placenearby;

import com.hbbsolution.ppctimeshare.model.placenearby.ModelPlacenearbyApi;
import com.hbbsolution.ppctimeshare.view.placenearby_tan.ViewPlacenearby;

/**
 * Created by tantr on 2/15/2017.
 */

public class PlacenearbyPresenter implements ImpPlacenearbyPresenter {
    ModelPlacenearbyApi modelPlacenearbyApi;
    ViewPlacenearby viewPlacenearby;

    public PlacenearbyPresenter(ViewPlacenearby viewPlacenearby){
        this.viewPlacenearby = viewPlacenearby;
        modelPlacenearbyApi = new ModelPlacenearbyApi();

    }

    @Override
    public void GetPlacenearbyList() {
//        modelPlacenearbyApi.GetDestinationList(new Fetchback() {
//            @Override
//            public void onFetchSuccess(List<Placeneraby> list) {
//                if(list.size() > 0){
//                    viewPlacenearby.DisplayDestination(list);
//                }else{
//                    viewPlacenearby.DisplayNonDestinationList();
//                }
//            }
//
//            @Override
//            public void onFetchFault(Exception e) {
//
//            }
//        });

    }
}
