package com.hbbsolution.ppctimeshare.view.destination_tan;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.hbbsolution.ppctimeshare.R;
import com.hbbsolution.ppctimeshare.adapter.AdapterDestination;
import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.presenter.destination.DestinationPresenter;
import com.hbbsolution.ppctimeshare.view.home_tan.HomeActivity;

import java.util.List;

public class DestinationActivity extends AppCompatActivity implements ViewDestination {
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private ImageView mImgBack;
    public ProgressDialog mProgressDialog ;
    private DestinationPresenter destinationtPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resorts);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyvler_destination);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swip_refresh_detination);
        mImgBack = (ImageView) findViewById(R.id.img_back);

        destinationtPresenter = new DestinationPresenter(this, this);
        destinationtPresenter.GetDestinationList();

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mSwipeRefreshLayout.setRefreshing(false);
                        destinationtPresenter.GetDestinationList();
                    }
                }, 1000);
            }
        });

        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DestinationActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void DisplayDestination(List<Destination> eventList) {

        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
        AdapterDestination adapterDestination = new AdapterDestination(eventList,this);
        mRecyclerView.setAdapter(adapterDestination);
        adapterDestination.notifyDataSetChanged();

    }

    @Override
    public void DisplayNonDestinationList() {

        hideProgressDialog();
        Toast.makeText(DestinationActivity.this, " Khong co du lieu", Toast.LENGTH_SHORT).show();
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
//        Intent intent = new Intent(DestinationActivity.this, HomeActivity.class);
//        startActivity(intent);
//        finish();
    }
}
