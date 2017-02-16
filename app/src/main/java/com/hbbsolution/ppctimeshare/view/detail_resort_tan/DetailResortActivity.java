package com.hbbsolution.ppctimeshare.view.detail_resort_tan;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hbbsolution.ppctimeshare.R;
import com.hbbsolution.ppctimeshare.adapter.ViewPagerAdapter;
import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.view.destination_tan.DestinationActivity;
import com.hbbsolution.ppctimeshare.view.home_tan.HomeActivity;
import com.hbbsolution.ppctimeshare.view.placenearby_tan.PlacenearbyActivity;

import java.util.ArrayList;

public class DetailResortActivity extends AppCompatActivity {
    private TextView mTxtName, mTxtAddress, mTxtPrice, mTxtIntroduce;
    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private ArrayList<String> mListImage;
    private String[] mImageList;
    private FloatingActionButton mFbt_detail;
    private Toolbar mToolbar;
    private ImageView mImgBack, mImgHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resort);

        mToolbar = (Toolbar) findViewById(R.id.toolbarbackhome);
        mFbt_detail = (FloatingActionButton) findViewById(R.id.foatbutton_detail);
        mTxtName = (TextView) findViewById(R.id.txtName_detail_project);
        mTxtAddress = (TextView) findViewById(R.id.txtAddress_detail_project);
        mTxtPrice = (TextView) findViewById(R.id.txtPrice_detail_project);
        mTxtIntroduce = (TextView) findViewById(R.id.txtIntroduce);
        mImgBack = (ImageView) mToolbar.findViewById(R.id.imgback);
        mImgHome = (ImageView) mToolbar.findViewById(R.id.imgHome);
        mViewPager=(ViewPager)findViewById(R.id.viewPager);

        mListImage = new ArrayList<>();

        Intent intent = getIntent();
        Destination event = (Destination) intent.getSerializableExtra("event");

        mTxtName.setText(event.getName());
        mTxtAddress.setText(event.getAddress());
        mTxtPrice.setText(event.getPrice());
        mTxtIntroduce.setText(event.getIntroduce());

        mImageList = event.getImages();
        for (int i =0; i < mImageList.length; i++){
            String text =  mImageList[i];
            mListImage.add(text);
        }

        mViewPagerAdapter=new ViewPagerAdapter(this,mListImage);
        mViewPager.setAdapter(mViewPagerAdapter);


        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(HomeActivity.page == 1){
                    HomeActivity.page = 0;

                    Intent intent = new Intent(DetailResortActivity.this, DestinationActivity.class);
                    startActivity(intent);
                    finish();
                }else if(HomeActivity.page == 2) {
                    HomeActivity.page = 0;

                    Intent intent = new Intent(DetailResortActivity.this, PlacenearbyActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });


        mImgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailResortActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        mFbt_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailResortActivity.this, "Bản đồ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        Intent intent = new Intent(DetailResortActivity.this, DestinationActivity.class);
//        startActivity(intent);
//        finish();
    }
}
