package com.example.roombooking;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.Date;

public class DBHelper extends SQLiteOpenHelper {
    public static final String TEN_DATABASE = "Booking";

    public static final String TEN_BANG_ROOM = "RoomBooking";

    public static final String COT_NAME = "_name";
    public static final String COT_DATE = "_date";
    public static final String COT_MAIL = "_email";
    public static final String COT_PHONE = "_phone";
    public static final String COT_NOTE = "_note";
    public static final String COT_ROOM = "_room";

    private static final String TAO_BANG_ROOM = ""
            + "create table " + TEN_BANG_ROOM + " ( "
            + COT_NAME + " text not null ,"
            + COT_DATE + " text not null, "
            + COT_MAIL + " text not null, "
            + COT_PHONE + " text not null, "
            + COT_NOTE + " text not null, "
            + COT_ROOM + " text not null )";

    public DBHelper(@Nullable Context context ) {
        super(context,TEN_DATABASE,null,1);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TEN_BANG_ROOM);

    }
}