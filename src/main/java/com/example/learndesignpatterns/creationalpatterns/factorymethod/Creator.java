package com.example.learndesignpatterns.creationalpatterns.factorymethod;

/**
 * @description: 此类声明工厂方法
 * @author: lee
 * @create: 2019/03/08 14:02
 */
public abstract class Creator {

    abstract Product factoryMethod(String type);
}
