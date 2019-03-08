package com.example.learndesignpatterns.creationalpatterns.abstractfactory;

/**
 * @description: 具体的Product1对象的创建
 * @author: lee
 * @create: 2019/03/08 14:17
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
