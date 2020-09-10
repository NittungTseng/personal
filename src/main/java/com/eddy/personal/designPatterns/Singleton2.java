package com.eddy.personal.designPatterns;

/**
 * 【懒汉模式】
 */
public class Singleton2 {
    //step1:将构造方式私有化，不允许外边直接创建对象
    private Singleton2(){
    }

    //step2:创建类的唯一实例，使用private static修饰(没有实例化)
    private static  Singleton2 instance;

    //step3:提供一个用于获取实例的方法，使用public static修饰
    public static /*synchronized*/ Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
