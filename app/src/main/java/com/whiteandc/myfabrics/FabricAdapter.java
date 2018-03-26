package com.whiteandc.myfabrics;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.whiteandc.myfabrics.model.Fabric;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by BLANCA on 26/03/2018.
 */

public class FabricAdapter extends RecyclerView.Adapter<FabricAdapter.FabricViewHolder>{

    private Context context;
    List<Fabric> fabricList = new ArrayList<>();

    @Override
    public FabricViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_fabric, null);
        FabricViewHolder viewHolder = new FabricViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(FabricViewHolder holder, int position) {
        Fabric fabric = fabricList.get(position);
        Glide.with(context).load(fabric.getImgPath()).into(holder.ivFabric);
        holder.tvNickName.setText(fabric.getNickName());
    }

    @Override
    public int getItemCount() {
        return fabricList.size();
    }

    class FabricViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.iv_fabric)
        ImageView ivFabric;

        @BindView(R.id.tv_nick_name)
        TextView tvNickName;

        public FabricViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);
        }
    }
}
