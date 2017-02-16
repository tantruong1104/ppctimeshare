package com.hbbsolution.ppctimeshare.view.special_offers_tan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.hbbsolution.ppctimeshare.R;
import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.view.home_tan.HomeActivity;

public class SpecialOffersActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ImageView mImgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_offers);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyvler_special_offers);
        mImgBack = (ImageView) findViewById(R.id.img_back);

        mImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntentHome = new Intent(SpecialOffersActivity.this, HomeActivity.class);
                startActivity(mIntentHome);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent mIntentHome = new Intent(SpecialOffersActivity.this, HomeActivity.class);
        startActivity(mIntentHome);
        finish();
    }
}
