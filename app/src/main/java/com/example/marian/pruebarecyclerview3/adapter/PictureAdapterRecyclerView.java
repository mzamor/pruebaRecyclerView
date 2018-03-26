package com.example.marian.pruebarecyclerview3.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marian.pruebarecyclerview3.Model.Picture;
import com.example.marian.pruebarecyclerview3.R;

import java.util.ArrayList;

/**
 * Created by marian on 25/03/18.
 */

public class PictureAdapterRecyclerView extends RecyclerView.
        Adapter<PictureAdapterRecyclerView.PictureViewHolder>{

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture = pictures.get(position);
        holder.usernameCard.setText(picture.getUserName());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{
        private ImageView pictureCard;
        private TextView usernameCard;

        public PictureViewHolder(View itemView) {
            super(itemView);
            pictureCard=(ImageView) itemView.findViewById(R.id.picture_card);
            usernameCard=(TextView) itemView.findViewById(R.id.username_card);
        }
    }

}
