package com.hbbsolution.ppctimeshare.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.hbbsolution.ppctimeshare.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tantr on 2/15/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {
    private Context ctx;
    private LayoutInflater layoutInflater;
    private ArrayList<String> list;

    public ViewPagerAdapter(Context c, ArrayList<String>list) {
        ctx=c;
        this.list = list;
    }

    @Override
    public int getCount() {

        return list.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.activity_custom_swip,container,false);
        ImageView imageView=(ImageView) itemView.findViewById(R.id.swip_image_view);
        Glide.with(ctx).load(list.get(position))
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.bocongthuong)
                .error(R.drawable.bocongthuong)
                .centerCrop()
                .into(imageView);
        container.addView(itemView);
        return itemView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return  (view==object);
    }
}
