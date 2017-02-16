package com.hbbsolution.ppctimeshare.view.detail_specials_offers;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.hbbsolution.ppctimeshare.R;
import com.hbbsolution.ppctimeshare.adapter.ViewPagerAdapter;

import java.util.ArrayList;

public class Detail_Specials_OffersActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView mTxtName, mTxtContent;
    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private ArrayList<String> mListImage;

    private ImageView mImgBack,mImgHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__specials__offers);

        mToolbar = (Toolbar) findViewById(R.id.toolbarbackhome);
        mTxtName = (TextView) findViewById(R.id.txtName_detail_specials);
        mTxtContent = (TextView) findViewById(R.id.txtIntroduce);
        mImgBack = (ImageView) mToolbar.findViewById(R.id.imgback);
        mImgHome = (ImageView) mToolbar.findViewById(R.id.imgHome);
        mViewPager=(ViewPager)findViewById(R.id.viewPager);

        String[] mImageList ={"http://ppctimeshare.hbbsolution.com/img/1487043262_h1.jpg", "http://ppctimeshare.hbbsolution.com/img/1487043262_h2.jpg", "http://ppctimeshare.hbbsolution.com/img/1487043262_h3.jpg", "http://ppctimeshare.hbbsolution.com/img/1487043262_h4.jpg"};

        for (int i =0; i < mImageList.length; i++){
            String text =  mImageList[i];
            mListImage.add(text);
        }


        mViewPagerAdapter=new ViewPagerAdapter(this,mListImage);
        mViewPager.setAdapter(mViewPagerAdapter);
    }
}
