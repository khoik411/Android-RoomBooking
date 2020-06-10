package com.example.roombooking;

public class booking {
    String  name,phone,email,note,date,room;

    public booking(String name, String phone, String email, String note, String date, String room) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.note = note;
        this.date = date;
        this.room = room;
    }

    public booking() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "booking{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", note='" + note + '\'' +
                ", date='" + date + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
