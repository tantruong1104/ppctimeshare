package com.hbbsolution.ppctimeshare.view.home_tan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.hbbsolution.ppctimeshare.R;
import com.hbbsolution.ppctimeshare.view.destination_tan.DestinationActivity;
import com.hbbsolution.ppctimeshare.view.placenearby_tan.PlacenearbyActivity;
import com.hbbsolution.ppctimeshare.view.special_offers_tan.SpecialOffersActivity;

public class HomeActivity extends AppCompatActivity {
    public static int page =0;

    private ImageView imgUser;
    private ImageView imgSetting;
    private LinearLayout loResort;
    private FrameLayout loSpecialOffers;
    private FrameLayout loDiscover;
    private FrameLayout loDestination;
    private FrameLayout loIntroduct;
    private LinearLayout loRecruitment;
    private FrameLayout loSendRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgUser = (ImageView) findViewById(R.id.imgUser);
        imgSetting = (ImageView) findViewById(R.id.imgSetting);
        loResort = (LinearLayout) findViewById(R.id.loResort);
        loSpecialOffers = (FrameLayout) findViewById(R.id.loPromotion);
        loDiscover = (FrameLayout) findViewById(R.id.loDiscover);
        loDestination = (FrameLayout) findViewById(R.id.loSuggest);
        loIntroduct = (FrameLayout) findViewById(R.id.loIntroduce);
        loRecruitment = (LinearLayout) findViewById(R.id.loRecruitment);
        loSendRequest = (FrameLayout) findViewById(R.id.loSendRequest);

        imgUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "User", Toast.LENGTH_SHORT).show();
            }
        });

        imgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "Setting", Toast.LENGTH_SHORT).show();
            }
        });

        loResort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "List Resort", Toast.LENGTH_SHORT).show();
            }
        });

        loSpecialOffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SpecialOffersActivity.class);
                startActivity(intent);
                finish();
            }
        });

        loDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                page = 1;
                Intent intent = new Intent(HomeActivity.this, DestinationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        loDestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                page = 2;
                Intent intent = new Intent(HomeActivity.this, PlacenearbyActivity.class);
                startActivity(intent);

            }
        });

        loIntroduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "Introduct", Toast.LENGTH_SHORT).show();
            }
        });

        loRecruitment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "Recruitment", Toast.LENGTH_SHORT).show();
            }
        });

        loSendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "Send Reqquest", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
