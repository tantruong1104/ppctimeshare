package com.hbbsolution.ppctimeshare.view.destination_tan;

import com.hbbsolution.ppctimeshare.model.destination.Destination;

import java.util.List;

/**
 * Created by tantr on 2/15/2017.
 */

public interface ViewDestination {
    void DisplayDestination(List<Destination> eventList);
    void DisplayNonDestinationList();
}
