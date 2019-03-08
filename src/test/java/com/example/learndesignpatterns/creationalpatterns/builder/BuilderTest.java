package com.example.learndesignpatterns.creationalpatterns.builder;

import com.example.learndesignpatterns.LearnDesignPatternsApplicationTests;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description: 测试构建器模式的实现。
 * @author: lee
 * @create: 2019/03/08 13:56
 */
public class BuilderTest extends LearnDesignPatternsApplicationTests {

    @Test
    public void testBuilder() {

        //创建ConcreteBuilder类型的对象
        ConcreteBuilder builder = new ConcreteBuilder();
        //创建Director类型的对象
        Director director = new Director(builder);
        // Director构造一个产品
        director.construct();
        //从builder获取产品
        Product product = builder.getResult();

        Assert.assertEquals(product.getPart1(),"part1");
        Assert.assertEquals(product.getPart2(),"part2");
    }
}
