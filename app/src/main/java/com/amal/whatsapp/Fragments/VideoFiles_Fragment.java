package com.amal.whatsapp.Fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amal.whatsapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFiles_Fragment extends Fragment {


    public VideoFiles_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video_files, container, false);
    }


}