package com.example.factory;

/**
 * 具体的工厂类,由反射获得
 * <p>
 * Created by will on 2018/2/28.
 */

public class ConcreteFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {

        T p = null;
        try {
            p = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return p;
    }

}
