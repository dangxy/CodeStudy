package com.dangxy.codestudy.java;


interface BaseView<T>   {
    void attachView(T t);
    void detachView(T t);

    T getData();

}
