package com.dangxy.codestudy.java;


public class GenericityJava {

    public static void main(String[] args ){


        Student student = new Student<>("111");

        Student student2 = new Student<>(new Student<>(1));
    }
}
class Student<T>{

    public Student(T t) {
        System.out.println(t);
    }


    public static <M> void getName(M m) {

        System.out.println(m);
    }

    public static <Q> int getAge(Q q) {
        return 0;
    }

    public  void  getType(T t){
    }
}




