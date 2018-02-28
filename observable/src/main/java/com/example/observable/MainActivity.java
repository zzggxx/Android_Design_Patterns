package com.example.observable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 被观察者持有观察者,接口抽象的定义
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CSDN csdn = new CSDN();

        Coder will = new Coder("will");
        Coder peter = new Coder("peter");

        csdn.addObserver(will);
        csdn.addObserver(peter);

        csdn.postNesPublist("2018,祝大家快乐!");
    }
}
