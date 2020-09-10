package com.eddy.personal.designPatterns;

/**
 * 单例模式 Singleton 【饿汉模式】，实例为静态变量，不管是否使用，在类加载的时候就初始化了。
 *
 *  应用场合：有些对象只需要一个就足够了，如：古代的皇帝、老婆
 *  作用：保证整个应用中某个实例有且只有一个
 *  类型：饿汉模式、懒汉模式
 */
public class Singleton {
    //step1:将构造方法私有化，不允许外部直接创建对象；
    private Singleton(){
    }

    //step2:创建类的唯一实例(静态成员变量，直接通过类名访问成员),使用private static修饰
    private static Singleton instance = new Singleton();

    //step3:提供一个用于获取实例的方法，使用public static修饰
    public static Singleton getInstance(){
        return instance;
    }
}
