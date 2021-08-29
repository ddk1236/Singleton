package com.fc.singleton;

/**
 * 饿汉式创建单例
 */
public class Singleton {
    //静态字段引用唯一实例
    private static final Singleton INSTANCE = new Singleton();
    //private构造方法保证外部无法实例化
    private Singleton(){
        System.out.println("初始化Singleton");
    }
    //通过静态方法直接返回一个实例
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
