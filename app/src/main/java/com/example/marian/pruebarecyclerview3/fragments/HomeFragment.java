package com.example.marian.pruebarecyclerview3.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marian.pruebarecyclerview3.Model.Picture;
import com.example.marian.pruebarecyclerview3.R;
import com.example.marian.pruebarecyclerview3.adapter.PictureAdapterRecyclerView;

import java.util.ArrayList;


public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView picture_recyclerView = (RecyclerView) view.findViewById(R.id.picture_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picture_recyclerView.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPicturesCard(),R.layout.cardview_picture,getActivity());
        picture_recyclerView.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> buildPicturesCard()
    {
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://www.pexels.com/photo/beach-birds-calm-clouds-219998/","Rolo Puente"));
        return pictures;
    }


}
