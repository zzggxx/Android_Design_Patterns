package com.example.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        客户的具体使用步骤
        ConcreteFactory concreteFactory = new ConcreteFactory();
        ConcreteProductB productB = concreteFactory.createProduct(ConcreteProductB.class);
        productB.method();
    }
}
