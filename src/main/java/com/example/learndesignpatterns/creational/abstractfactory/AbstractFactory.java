package com.example.learndesignpatterns.creational.abstractfactory;

/**
 * @description: 定义用于创建抽象产品对象的接口
 * @author: lee
 * @create: 2019/03/08 14:15
 */
public interface AbstractFactory {

    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
