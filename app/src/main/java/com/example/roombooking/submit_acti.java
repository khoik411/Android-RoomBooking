package com.example.roombooking;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.os.Bundle;

import android.support.v4.app.*;
import java.util.ArrayList;
import java.util.Calendar;
import android.view.LayoutInflater;
import android.view.View;


public class submit_acti extends AppCompatActivity  implements DatePickerDialog.OnDateSetListener{
    EditText txtDate, txtName, txtNote, txtMail, txtRoom, txtPhone ;
    Button btnSend;
    ListView lsvShow;
    ArrayList<booking> BookingList = new ArrayList<>();

    CustomAdapter customAdapter ;
    RoomDB roomDB;


    //    RadioGroup GroupRoom, GroupShift;
//    RadioButton radioButton;
    ArrayList shift = new ArrayList();
    ArrayList room = new ArrayList();
    Spinner spnShift, spnRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_acti);
        txtDate = findViewById(R.id.txtTime);
        txtRoom = findViewById(R.id.edtRoom);
        txtPhone = findViewById(R.id.txtPhoneNumber);
        txtNote = findViewById(R.id.txtRequest);
        txtName = findViewById(R.id.txtName);
        txtMail = findViewById(R.id.txtMail);



        btnSend = findViewById(R.id.btnSubmit);


                btnSend.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        booking book = new booking();
                        book.setName(txtName.getText().toString());
                        book.setDate(txtDate.getText().toString());
                        book.setEmail(txtMail.getText().toString());
                        book.setNote(txtNote.getText().toString());
                        book.setRoom(txtRoom.getText().toString());
                        book.setPhone(txtPhone.getText().toString());
                        RoomDB.them(book);
                        updateData();
                    }
                });

                txtDate = findViewById(R.id.txtTime);
                txtDate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pickDate();
                    }
                });

                customAdapter = new CustomAdapter(this, R.layout.listviewitem, BookingList);
                lsvShow.setAdapter(customAdapter);

        }
    private  void updateData(){
        Cursor cursor = RoomDB.layTatCaDuLieu();
        if (cursor != null) {

            BookingList.clear();
            while (cursor.moveToNext()) {
                booking truck = new booking();
                truck.setName("" + cursor.getInt(0));
                truck.setDate(cursor.getString(1));
                truck.setEmail(cursor.getString(2));
                truck.setRoom(cursor.getString(3));
                truck.setPhone(cursor.getString(4));
                truck.setNote(cursor.getString(5));
                //TruckManagentList.add(truck);

                //           truckArrayAdapter.add(truck);
                BookingList.add(truck);
            }

//            truckArrayAdapter.notifyDataSetChanged();
            customAdapter.notifyDataSetChanged();
        }
    }
    private void pickDate(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
                );
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String data =   month +"/"+ dayOfMonth +"/"+ year;
        txtDate.setText(data);
    }
}
