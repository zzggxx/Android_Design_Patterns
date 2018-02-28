package com.example.observable;

import java.util.Observable;

/**
 * Obserable:被观察者
 * <p>
 * Created by will on 2018/2/28.
 */

public class CSDN extends Observable {

    public void postNesPublist(String content) {
        setChanged();
        notifyObservers(content);
    }

}
