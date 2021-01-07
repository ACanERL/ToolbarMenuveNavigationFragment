package com.example.toolbarvemenu.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.toolbarvemenu.R;


public class AyarlarFragment extends Fragment {
    public AyarlarFragment() {
        // Required empty public constructor
    }
    public static AyarlarFragment newInstance(String param1, String param2) {
        AyarlarFragment fragment = new AyarlarFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_ayarlar, container, false);
    }
}