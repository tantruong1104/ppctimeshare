package com.hbbsolution.ppctimeshare.presenter.destination;

/**
 * Created by tantr on 2/15/2017.
 */

public interface ImpDestinationPresenter {
    void GetDestinationList();
    void GetPlacenearList(String lat, String lng, int distance);
}
