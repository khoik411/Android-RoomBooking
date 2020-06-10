package com.example.roombooking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;


public class RoomDB {
        SQLiteDatabase db;
        DBHelper dbHelper;

        public RoomDB(Context context) {
            dbHelper = new DBHelper(context);
            try {
                db = dbHelper.getWritableDatabase();
            } catch (SQLiteException ex) {
                db = dbHelper.getReadableDatabase();
            }
        }

        public void close() {
            dbHelper.close();
        }
        public static Cursor layTatCaDuLieu() {
            SQLiteDatabase db = null;

            String[] cot = {
                    DBHelper.COT_NAME,
                    DBHelper.COT_DATE,
                    DBHelper.COT_MAIL,
                    DBHelper.COT_PHONE,
                    DBHelper.COT_NOTE,
                    DBHelper.COT_ROOM};
            Cursor cursor = null;
            cursor = db.query(DBHelper.
                            TEN_BANG_ROOM, cot, null, null, null, null,
                    null);
            return cursor;
        }
        public static long them(booking Booking) {
            SQLiteDatabase db = null;

            ContentValues values = new ContentValues();
            values.put(DBHelper.COT_NAME,
                    Booking.getName());
            values.put(DBHelper.COT_DATE,
                    Booking.getDate());
            values.put(DBHelper.COT_MAIL,
                    Booking.getEmail());
            values.put(DBHelper.COT_PHONE,
                    Booking.getPhone());
            values.put(DBHelper.COT_NOTE,
                    Booking.getNote());
            values.put(DBHelper.COT_ROOM,
                    Booking.getRoom());
            return db.insert(DBHelper.
                    TEN_BANG_ROOM, null, values);
        }
        public long xoa(booking Booking) {
            return db.delete(DBHelper

                    .TEN_BANG_ROOM, DBHelper
                    .COT_NAME + " = " + "'" +
                    Booking.getName() + "'", null);
        }
        public long sua(booking Booking) {
            ContentValues values = new ContentValues();
            values.put(DBHelper.COT_NAME,
                    Booking.getName());
            values.put(DBHelper.COT_DATE,
                    Booking.getDate());
            values.put(DBHelper.COT_MAIL,
                    Booking.getEmail());
            values.put(DBHelper.COT_PHONE,
                    Booking.getPhone());
            values.put(DBHelper.COT_NOTE,
                    Booking.getNote());
            values.put(DBHelper.COT_ROOM,
                    Booking.getRoom());
            return db.update(DBHelper
                            .TEN_BANG_ROOM, values,
                    DBHelper.COT_NAME + " = "
                            + Booking.getName(), null);
        }
}
