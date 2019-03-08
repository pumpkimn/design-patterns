package com.example.learndesignpatterns.creationalpatterns.sinleton;

import com.example.learndesignpatterns.LearnDesignPatternsApplicationTests;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: lee
 * @create: 2019/03/08 11:55
 */
public class SinletonTest extends LearnDesignPatternsApplicationTests {

    @Test
    public void testSinleton() {
        //第一次调用Singleton.getInstance()，
        //对象将被创建
        Singleton singleton = Singleton.getInstance();
        Assert.assertNotNull(singleton);

        //第二次调用Singleton.getInstance()，
        //返回对同一对象的引用
        Singleton singleton1 = Singleton.getInstance();
        Assert.assertEquals(singleton,singleton1);
    }
}
