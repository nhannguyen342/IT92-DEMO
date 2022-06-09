package com.example.tikidemo2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RightFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RightFragment extends Fragment {
    private static final String ARG_Name = "name";

    private String mName;

    public RightFragment() {
        // Required empty public constructor
    }

    public static RightFragment newInstance(String name) {
        RightFragment fragment = new RightFragment();
        Bundle args = new Bundle();
        args.putString(ARG_Name, name);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() !=null){
            mName = getArguments().getString(ARG_Name);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_right, container, false);
    }
}