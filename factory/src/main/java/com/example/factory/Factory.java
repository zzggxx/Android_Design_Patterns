package com.example.factory;

/**
 * Created by will on 2018/2/28.
 */

public abstract class Factory {
    /**
     * 抽象工厂方法
     * @param clz
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
