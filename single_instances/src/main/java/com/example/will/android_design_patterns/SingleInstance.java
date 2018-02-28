package com.example.will.android_design_patterns;

/**
 * Created by will on 2018/2/14.
 */

public class SingleInstance {

    static SingleInstance signleInstance;

    private SingleInstance() {
    }

    public static SingleInstance newInstance() {
        if (signleInstance == null) {
            synchronized (SingleInstance.class) {
                signleInstance = new SingleInstance();
            }
        }
        return signleInstance;
    }
}
