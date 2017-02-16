package com.hbbsolution.ppctimeshare.listener;

import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.model.placenearby.Placeneraby;

import java.util.List;

/**
 * Created by tantr on 2/15/2017.
 */

public interface Fetchback {
    void onFetchSuccess(List<Placeneraby> list);
    void onFetchFault(Exception e);
}
