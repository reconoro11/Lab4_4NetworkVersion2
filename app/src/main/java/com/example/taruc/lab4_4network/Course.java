package com.example.taruc.lab4_4network;

public class Course {
    private String code;
    private String title;
    private String credit;

//empty constructor
    public Course() {
    }

    public Course(String code, String title, String credit) {
        this.code = code;
        this.title = title;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getCredit() {
        return credit;
    }

}
