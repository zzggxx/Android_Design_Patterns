package com.example.will.android_design_patterns;

/**
 * Created by will on 2018/2/14.
 */

public class SingleInstance4 {

    static SingleInstance4 signleInstance;

    private SingleInstance4() {
    }

    public static SingleInstance4 newInstance() {
        return SingletonHolder.sInstance4;
    }

    private static class SingletonHolder {
        private static final SingleInstance4 sInstance4 = new SingleInstance4();
    }
}
