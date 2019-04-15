package com.example.learndesignpatterns.creational.abstractfactory;

import com.example.learndesignpatterns.LearnDesignPatternsApplicationTests;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description: 测试AbstractFactory模式的实现。
 * @author: lee
 * @create: 2019/03/08 14:23
 */
public class AbstractFactoryTest extends LearnDesignPatternsApplicationTests {

    @Test
    public void testAbstractFactory() {
        AbstractFactory abstractFactory1 = new ConcreteFactory1();
        AbstractFactory abstractFactory2 = new ConcreteFactory2();

        Assert.assertEquals("com.example.learndesignpatterns.creational.abstractfactory.ProductA1"
        ,abstractFactory1.createProductA().getClass().getName());

        Assert.assertEquals("com.example.learndesignpatterns.creational.abstractfactory.ProductB1"
                ,abstractFactory1.createProductB().getClass().getName());

        Assert.assertEquals("com.example.learndesignpatterns.creational.abstractfactory.ProductA2"
        ,abstractFactory2.createProductA().getClass().getName());

        Assert.assertEquals("com.example.learndesignpatterns.creational.abstractfactory.ProductB2"
                ,abstractFactory2.createProductB().getClass().getName());
    }
}
