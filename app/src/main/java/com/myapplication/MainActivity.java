package com.myapplication;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity
{


    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*//        在类中创建一个方法，在类外针对方法名进行实现。
//        而简单断点调试可以在方法stepnext(i)这行断，当中可以对变量名i进行watch观察
//            断点调试有step over：一步步往下走；step into：看到方法往里走
//        force step into :所有方法看完整
//        看到你所调用的所有方法的实现会让你跟着它走一遍，研究源码使用非常方便
//        step out ：有断点下一个，走完断点继续走
//        run to Cursor ：下个断点我们见*/


//        for (int i = 0; i < 10; i++)
//        {
//
//            stepNext(i);
//        }


//        第一次实现mainwen文件夹多个java文件，可以调用其他java文件里的方法。
        adddemo.Add();
        sub();
    }




//    private void stepNext(int i)
//    {
//        Log.e(TAG, "printLog: i=" + i);
//    }



    private void sub()
    {
        for (int i = 0; i >= 0; i--)
        {
            System.out.println(i);
        }
    }



}

