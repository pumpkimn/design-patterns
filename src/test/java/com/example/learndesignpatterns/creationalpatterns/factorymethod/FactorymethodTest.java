package com.example.learndesignpatterns.creationalpatterns.factorymethod;

import com.example.learndesignpatterns.LearnDesignPatternsApplicationTests;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description: 测试FactoryMethod模式的实现。
 * @author: lee
 * @create: 2019/03/08 14:07
 */
public class FactorymethodTest extends LearnDesignPatternsApplicationTests {

    @Test
    public void testFactoryMethod() {
        Creator factory = new ConcreteCreator();
        Product productA =  factory.factoryMethod("A");
        Product productB =  factory.factoryMethod("B");

        Assert.assertEquals("com.example.learndesignpatterns.creationalpatterns.factorymethod.ConcreteProductA"
        ,productA.getClass().getName());
        Assert.assertEquals("com.example.learndesignpatterns.creationalpatterns.factorymethod.ConcreteProductB"
                ,productB.getClass().getName());

        Assert.assertEquals(null,factory.factoryMethod(""));
    }
}
