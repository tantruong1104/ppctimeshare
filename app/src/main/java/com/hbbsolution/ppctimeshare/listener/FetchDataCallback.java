package com.hbbsolution.ppctimeshare.listener;

import com.hbbsolution.ppctimeshare.model.destination.Destination;

import java.util.List;

/**
 * Created by tantr on 2/15/2017.
 */

public interface FetchDataCallback {
    void onFetchSuccess(List<Destination> list);
    void onFetchFault(Exception e);
}
