package com.fc.test;

import com.fc.singleton.Singleton;
import com.fc.singleton.SingletonLazy;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void test01(){
        //Singleton构造方法被private修饰无法直接new对象
        //Singleton singleton = new Singleton();



        //java标准库中使用单例模式的类
        //Runtime runtime = new Runtime();//编译错误
        //Runtime.getRuntime();//通过编译

        //通过静态方法直接返回一个类的实例
        Singleton.getInstance();

    }
    @Test
    public void SingletonLazyTest(){


    }

}
