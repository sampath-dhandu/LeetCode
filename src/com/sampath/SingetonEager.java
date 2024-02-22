package com.sampath;

public class SingetonEager {

    private static final SingetonEager instance = new SingetonEager();

    private SingetonEager() {


    }

    public static SingetonEager getInstance() {
        return instance;
    }

}
