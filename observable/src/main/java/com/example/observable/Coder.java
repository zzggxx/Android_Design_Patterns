package com.example.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * <p>
 * Created by will on 2018/2/28.
 */

public class Coder implements Observer {
    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi," + name + "你订阅的网站有更新了啊,内容: " + arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
