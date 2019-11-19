package com.example.student_staff_card;




public class Studentitem {

    private int mImageResource;
    private String mstuname;
    private String mstuno;

    public Studentitem(int imageResource, String stuname, String stuno) {
        mImageResource = imageResource;
        mstuname = stuname;
        mstuno = stuno;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getstuname() {
        return mstuname;
    }

    public String getstuno() {
        return mstuno;
    }
    public int setImageResource() {
        return mImageResource;
    }

    public String setstuname() {
        return mstuname;
    }

    public String setstuno() {
        return mstuno;
    }
}
