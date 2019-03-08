package com.example.learndesignpatterns.creationalpatterns.abstractfactory;

/**
 * @description: 具体的Product1对象的创建
 * @author: lee
 * @create: 2019/03/08 14:17
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
