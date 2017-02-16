package com.hbbsolution.ppctimeshare.view.placenearby_tan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.hbbsolution.ppctimeshare.R;
import com.hbbsolution.ppctimeshare.adapter.AdapterPlacenearby;
import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.presenter.destination.DestinationPresenter;
import com.hbbsolution.ppctimeshare.view.destination_tan.ViewDestination;
import com.hbbsolution.ppctimeshare.view.home_tan.HomeActivity;

import java.util.List;

public class PlacenearbyActivity extends AppCompatActivity implements ViewDestination {
    private Toolbar mToolbar;
    private ImageView mImgBack;
    private RecyclerView mRecyclerView;
    public ProgressDialog mProgressDialog ;
    private DestinationPresenter placenearbyPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placenearby);

        mToolbar = (Toolbar) findViewById(R.id.toolbarback);
        mImgBack = (ImageView) mToolbar.findViewById(R.id.imgback);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyvler_placenearby);
        placenearbyPresenter = new DestinationPresenter(this, this);
        placenearbyPresenter.GetPlacenearList("10.76671", "106.689319", 1000);
        showProgessDialog();

        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlacenearbyActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void DisplayDestination(List<Destination> eventList) {
        hideProgressDialog();
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
        AdapterPlacenearby adapterPlacenearby = new AdapterPlacenearby(eventList,this);
        mRecyclerView.setAdapter(adapterPlacenearby);
        adapterPlacenearby.notifyDataSetChanged();

    }

    @Override
    public void DisplayNonDestinationList() {
        hideProgressDialog();
        Toast.makeText(getApplicationContext(), "Không có địa điểm", Toast.LENGTH_SHORT).show();
    }

    public void showProgessDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
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



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(PlacenearbyActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
