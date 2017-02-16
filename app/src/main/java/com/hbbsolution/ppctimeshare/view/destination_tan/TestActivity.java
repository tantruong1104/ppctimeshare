package com.hbbsolution.ppctimeshare.view.destination_tan;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.hbbsolution.ppctimeshare.R;
import com.hbbsolution.ppctimeshare.adapter.ViewPagerAdapter;
import com.hbbsolution.ppctimeshare.model.destination.Destination;


import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {
    TextView txtName, txtAddress,txtPrice, txtContent;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    ArrayList<String> listImage;
    String[] imageList;
    FloatingActionButton fbt_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resort);

        txtName = (TextView) findViewById(R.id.txtName_detail_project);
        txtAddress = (TextView) findViewById(R.id.txtAddress_detail_project);
        txtPrice = (TextView) findViewById(R.id.txtPrice_detail_project);
        //        txtContent = (TextView) findViewById(R.id.txtConten_destination);
        fbt_detail = (FloatingActionButton) findViewById(R.id.foatbutton_detail);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        listImage = new ArrayList<>();
        Intent intent = getIntent();
        Destination event = (Destination) intent.getSerializableExtra("event");

        txtName.setText(event.getName());
        txtAddress.setText(event.getAddress());
        txtPrice.setText(event.getPrice());
        imageList = event.getImages();
        for (int i =0; i < imageList.length; i++){
            String text =  imageList[i];
            listImage.add(text);
        }

        viewPagerAdapter=new ViewPagerAdapter(this,listImage);
        viewPager.setAdapter(viewPagerAdapter);

//        String [] imageList = event.getImages();
//        for (int i =0; i < imageList.length; i++){
//            String text =  imageList[i];
//            Toast.makeText(this,text, Toast.LENGTH_SHORT).show();
//        }

        fbt_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TestActivity.this, "Bản đồ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
