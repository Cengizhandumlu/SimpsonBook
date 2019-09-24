package com.example.simpsonbook;

import android.widget.ImageView;

import java.io.Serializable;

public class Simpson implements Serializable {//serializable yapmamız icin implement etmemiz gerekti

    private String name;//degistirilememesi icin private yapıldı.
    private String job;
    private int pictureInteger;

    public Simpson(String name,String job,int pictureInteger){
        this.job=job;
        this.name=name;
        this.pictureInteger=pictureInteger;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getPictureInteger() {
        return pictureInteger;
    }
}
