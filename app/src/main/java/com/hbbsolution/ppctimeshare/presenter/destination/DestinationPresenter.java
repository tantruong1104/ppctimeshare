package com.hbbsolution.ppctimeshare.presenter.destination;

import android.app.ProgressDialog;
import android.content.Context;

import com.hbbsolution.ppctimeshare.listener.FetchDataCallback;
import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.model.destination.ModeDestinationApi;
import com.hbbsolution.ppctimeshare.view.destination_tan.ViewDestination;

import java.util.List;

/**
 * Created by tantr on 2/15/2017.
 */

public class DestinationPresenter implements ImpDestinationPresenter {
    ProgressDialog mProgressDialog;
    Context context;
    ModeDestinationApi modeDestinationApi;
    ViewDestination viewDestination;

    public DestinationPresenter(ViewDestination viewDestination, Context context){
        this.viewDestination = viewDestination;
        modeDestinationApi = new ModeDestinationApi();
        this.context = context;
    }

    @Override
    public void GetDestinationList() {
        showProgessDialog();
        modeDestinationApi.GetDestinationList(new FetchDataCallback() {
            @Override
            public void onFetchSuccess(List<Destination> list) {
                if(list.size() > 0){
                    viewDestination.DisplayDestination(list);
                    hideProgressDialog();
                }else{
                    viewDestination.DisplayNonDestinationList();
                }
            }

            @Override
            public void onFetchFault(Exception e) {

            }
        });
    }

    @Override
    public void GetPlacenearList(String lat, String lng, int distance) {
        modeDestinationApi.GetDestinationList(new FetchDataCallback() {
            @Override
            public void onFetchSuccess(List<Destination> list) {
                if(list.size() > 0){
                    viewDestination.DisplayDestination(list);
                }else{
                    viewDestination.DisplayNonDestinationList();
                }
            }

            @Override
            public void onFetchFault(Exception e) {

            }
        }, lat, lng, distance);

    }

    private void showProgessDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(context);
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setCancelable(false);
        }
        try {
            mProgressDialog.show();
        } catch (Exception e) {
        }

    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            try {
                mProgressDialog.dismiss();
            } catch (Exception e) {
            }

        }
    }
}
