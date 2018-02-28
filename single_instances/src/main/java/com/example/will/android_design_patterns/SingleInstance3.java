package com.example.will.android_design_patterns;

/**
 * Created by will on 2018/2/14.
 */

public class SingleInstance3 {

    static SingleInstance3 signleInstance;

    private SingleInstance3() {
    }

    public static SingleInstance3 newInstance() {
        if (signleInstance == null) {
            synchronized (SingleInstance3.class) {
                if (signleInstance == null) {
                    signleInstance = new SingleInstance3();
                }
            }
        }
        return signleInstance;
    }
}
