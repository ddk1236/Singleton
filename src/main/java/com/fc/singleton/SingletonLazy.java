package com.fc.singleton;

/**
 * 懒汉式创建单例
 */
public class SingletonLazy {

    private static SingletonLazy INSTANCE = null;

    //private修饰构造方法外部无法实例化
    private SingletonLazy(){
        System.out.println("初始化SingletonLazy");
    }

    public static SingletonLazy getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }
}
