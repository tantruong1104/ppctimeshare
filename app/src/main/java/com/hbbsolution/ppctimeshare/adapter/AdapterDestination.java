package com.hbbsolution.ppctimeshare.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hbbsolution.ppctimeshare.R;
import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.view.detail_resort_tan.DetailResortActivity;

import java.util.List;

/**
 * Created by tantr on 2/14/2017.
 */

public class AdapterDestination extends RecyclerView.Adapter<AdapterDestination.ViewHolderDestination> {

    private List<Destination> destinationList;
    private Context context;

    public AdapterDestination(List<Destination> destinationList, Context context) {
        this.destinationList = destinationList;
        this.context = context;
    }

    @Override
    public ViewHolderDestination onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.item_recycler_destination,parent,false);

        ViewHolderDestination viewHolderDestination = new ViewHolderDestination(itemView);
        return viewHolderDestination;
    }

    @Override
    public void onBindViewHolder(ViewHolderDestination holder, int position) {
        final Destination event = destinationList.get(position);
        holder.textName.setText(event.getName());
        holder.txtAddress.setText(event.getAddress());
//        holder.txtPrice.setText(event.getPrice() + "");
        String mIntroduce = event.getIntroduce().substring(0, 150) + "...";
        holder.txtContent.setText(mIntroduce);
        Glide.with(context).load(event.getImages()[0]).placeholder(R.drawable.bocongthuong).error(R.drawable.bocongthuong).centerCrop().into(holder.imgPost);

        holder.lo_item_destination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailResortActivity.class);
                intent.putExtra("event", event);
                context.startActivity(intent);
//                ((Activity)context).finish();
            }
        });
    }

    @Override
    public int getItemCount() {
        return destinationList.size();
    }

    public class ViewHolderDestination extends RecyclerView.ViewHolder {
        LinearLayout lo_item_destination;
        ImageView imgPost;
        TextView textName, txtAddress,txtPrice, txtContent;

    public ViewHolderDestination(View itemView) {
        super(itemView);
        lo_item_destination = (LinearLayout) itemView.findViewById(R.id.lo_item_destination);
        imgPost = (ImageView) itemView.findViewById(R.id.imgPoster_item_destination);
        textName = (TextView) itemView. findViewById(R.id.txtName_item_destination);
        txtAddress = (TextView) itemView.findViewById(R.id.txtAddress_item_destination);
        txtPrice = (TextView) itemView.findViewById(R.id.txtPrice_detail_project);
        txtContent = (TextView) itemView.findViewById(R.id.txtConten_item_destination);

    }
}
}
