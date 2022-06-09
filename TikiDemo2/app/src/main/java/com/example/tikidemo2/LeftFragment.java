package com.example.tikidemo2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LeftFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LeftFragment extends Fragment {


    public LeftFragment() {
        // Required empty public constructor
    }

    public static LeftFragment newInstance() {
        LeftFragment fragment = new LeftFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button bt1 = view.findViewById(R.id.btnGoiY);
        Button bt2 = view.findViewById(R.id.btnAnhVan);
        Button bt3 = view.findViewById(R.id.btnToan);
        Button bt4 = view.findViewById(R.id.btnLy);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.rightFragment);
            }
        });

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_left, container, false);
    }
}