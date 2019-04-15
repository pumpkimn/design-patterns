package com.example.learndesignpatterns.creational.sinleton;

/**
 * @description: Singleton 实现单例模式 只能初始化一个对象
 * @author: lee
 * @create: 2019/03/08 11:27
 */
public class Singleton {
    /**
     * 保存对单个实例的引用。
     */
    private static Singleton INSTANCE;

    /**
     * 覆盖公共构造函数。
     */
    private Singleton() {
    }

    /**
     * 创建还不存在的实例(延迟实例化)。
     * @return 对单个实例的引用。
     */
    public static Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }


}
