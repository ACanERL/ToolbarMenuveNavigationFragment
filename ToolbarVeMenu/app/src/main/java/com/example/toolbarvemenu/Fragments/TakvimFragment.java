package com.example.toolbarvemenu.Fragments;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toolbarvemenu.MainActivity;
import com.example.toolbarvemenu.R;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class TakvimFragment extends Fragment   {
    public TakvimFragment() {

    }

    public static TakvimFragment newInstance(String param1, String param2) {
        TakvimFragment fragment = new TakvimFragment();
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

        return inflater.inflate(R.layout.fragment_takvim, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView textView=(TextView)view.findViewById(R.id.textView2);
        CalendarView calendarView=(CalendarView)view.findViewById(R.id.calendarView);
        Long date;
        date=calendarView.getDate();
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(view.getContext(), "" + dayOfMonth+ "/" + (month+1) + "/" + year, Toast.LENGTH_SHORT).show();
                int yıl=year;
                int ay=month;
                int gün=dayOfMonth;
                textView.setText("Seçilen Tarih : "+gün+"/"+(ay+1)+"/"+yıl);
            }
        });


    }


}