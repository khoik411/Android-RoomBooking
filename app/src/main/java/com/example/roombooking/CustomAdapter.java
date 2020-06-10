package com.example.roombooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int layoutId;

    ArrayList<booking> TruckManagementList = new ArrayList<>();
    public CustomAdapter(@NonNull submit_acti context, int layoutId,
                         ArrayList<booking> TruckManagementList) {
        super(context, layoutId);
        this.context = context;
        this.layoutId = layoutId;
        this.TruckManagementList = TruckManagementList;
    }
    @Override
    public int getCount() {
        return TruckManagementList.size();
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater.from(context));
        convertView = inflater.inflate(layoutId, null);
        TextView txtXe = convertView.findViewById(R.id.txtXe);
        TextView txtChuyen = convertView.findViewById(R.id.txtChuyen);
        TextView txtDate = convertView.findViewById(R.id.txtDate);
        TextView txtStart = convertView.findViewById(R.id.txtStart);

        txtXe.setText(TruckManagementList.get(position).getName());
        txtChuyen.setText(TruckManagementList.get(position).getRoom());
        txtDate.setText(TruckManagementList.get(position).getDate());
        txtStart.setText(TruckManagementList.get(position).getPhone());
        return convertView;
    }
}

