package com.fc.singleton;

/**
 *静态内部方式创建单例模式
 */
public class SingletonSynchronizeLazy {
    private static SingletonSynchronizeLazy INSTANCE = null;

    private SingletonSynchronizeLazy(){

    }

    public static synchronized SingletonSynchronizeLazy getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SingletonSynchronizeLazy();
        }
        return INSTANCE;
    }

}
