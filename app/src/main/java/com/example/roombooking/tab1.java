package com.example.roombooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class tab1 extends Fragment {

    ArrayList shift = new ArrayList();
    ArrayList room = new ArrayList();
    Spinner spnShift, spnRoom;
    Button btnSubmit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_m1, container, false);
        return rootView;
//        shift.add("A: 19:00 - 20:00");
//        shift.add("B: 20:00 - 21:00");
//        shift.add("C: 21:00 - 22:00");
//        ArrayAdapter adapterShift = new ArrayAdapter(this,android.R.layout.simple_spinner_item,shift);
//        spnShift.setAdapter(adapterShift);
    }

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        spnShift = spnShift.findViewById(R.id.spnShift);
//
//    }
}
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tab_m1);
//        btnSubmit = findViewById(R.id.btnSubmit);
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent( this,activity_su);
//                startActivity(intent);
//            }
//        });

//    }

