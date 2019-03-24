package com.dangxy.codestudy.java;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String [] args){
        //demo();
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        demo();
        demo(); //git dev1
        demo(); // git dev2
        demo(); // git master
        demo(); // git master03

    }

    /**
     * 测试方法
     */
    private static void demo() {
        System.out.println("hello world");

        List<String> list = new ArrayList<>();

        list.add("test");
        list.add("test1");
        for (String str:list
             ) {
           System.out.println(str);
           System.out.println(str+"git master");

           System.out.println(str+"dev01");
           System.out.println(str+"git master");

        }

    }


    private static class ThreadDemo extends Thread{
        @Override
        public void run() {
            super.run();

            System.out.println(" Thread run");
        }
    }
   }
