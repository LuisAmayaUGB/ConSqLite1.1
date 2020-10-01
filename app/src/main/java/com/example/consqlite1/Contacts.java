package com.example.consqlite1;

public class Contacts {
    private int id;
    private String name;
    private String phoneNumber;

    //Constructor
    Contacts(String name, String phno) {
        this.name = name;
        this.phoneNumber = phno;
    }

    //constructor
    Contacts(int id, String name, String phno) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phno;
    }
    //por cada campo o propiedad un set y get

    int getId() {

        return id;
    }
    public void setId(int id) {

        this.id = id;
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    String getPhno() {

        return phoneNumber;
    }
    public void setPhno(String phno) {

        this.phoneNumber = phno;
    }
}