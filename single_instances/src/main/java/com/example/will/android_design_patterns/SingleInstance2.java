package com.example.will.android_design_patterns;

/**
 * Created by will on 2018/2/14.
 */

public class SingleInstance2 {

    static SingleInstance2 signleInstance = new SingleInstance2();

    private SingleInstance2() {
    }

    public static SingleInstance2 newInstance() {
        return signleInstance;
    }
}
