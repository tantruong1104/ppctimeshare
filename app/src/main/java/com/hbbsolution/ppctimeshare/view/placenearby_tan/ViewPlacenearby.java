package com.hbbsolution.ppctimeshare.view.placenearby_tan;

import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.model.placenearby.Placeneraby;

import java.util.List;

/**
 * Created by tantr on 2/15/2017.
 */

public interface ViewPlacenearby {
    void DisplayDestination(List<Placeneraby> eventList);
    void DisplayNonDestinationList();
}
