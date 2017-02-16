package com.hbbsolution.ppctimeshare.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hbbsolution.ppctimeshare.R;
import com.hbbsolution.ppctimeshare.model.destination.Destination;
import com.hbbsolution.ppctimeshare.view.detail_resort_tan.DetailResortActivity;

import java.util.List;

/**
 * Created by tantr on 2/15/2017.
 */

public class AdapterPlacenearby extends RecyclerView.Adapter<AdapterPlacenearby.ViewHolderPlacenearby> {

    private List<Destination> placenerabyList;
    private Context context;

    public AdapterPlacenearby(List<Destination> placenerabyList, Context context) {
        this.placenerabyList = placenerabyList;
        this.context = context;
    }

    @Override
    public AdapterPlacenearby.ViewHolderPlacenearby onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.item_recycler_placenearby,parent,false);

        AdapterPlacenearby.ViewHolderPlacenearby viewHolderPlacenearby = new  AdapterPlacenearby.ViewHolderPlacenearby(itemView);
        return viewHolderPlacenearby;
    }

    @Override
    public void onBindViewHolder(AdapterPlacenearby.ViewHolderPlacenearby holder, int position) {
        final Destination event = placenerabyList.get(position);
        holder.textName.setText(event.getName());
        holder.txtDistance.setText(event.getDistance() + " km");
        holder.lo_item_placenearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailResortActivity.class);
                intent.putExtra("event", event);
                context.startActivity(intent);
                ((Activity)context).finish();
            }
        });

    }

    @Override
    public int getItemCount() {
        return placenerabyList.size();
    }

    public class ViewHolderPlacenearby extends RecyclerView.ViewHolder {
        TextView textName, txtDistance;
        LinearLayout lo_item_placenearby;
        public ViewHolderPlacenearby(View itemView) {
            super(itemView);
            lo_item_placenearby = (LinearLayout) itemView.findViewById(R.id.lo_item_placenearby);
            textName = (TextView) itemView. findViewById(R.id.txtName_item_placecearby);
            txtDistance = (TextView) itemView.findViewById(R.id.txtDistance_item_placecearby);
        }
    }
}
