package com.example.learndesignpatterns.creationalpatterns.prototype;

import com.example.learndesignpatterns.LearnDesignPatternsApplicationTests;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description: 测试原型模式。
 * @author: lee
 * @create: 2019/03/08 13:39
 */
public class PrototypeTest extends LearnDesignPatternsApplicationTests {
    @Test
    public void testPrototype() throws CloneNotSupportedException {
        //创建原型类型的对象
        Prototype prototype = new ConcretePrototype();
        //创建客户端对象(原型通过构造函数“注入”)
        Client client = new Client(prototype);

        //客户端创建原型类型的新对象(克隆它自己)
        Prototype prototypeClone = client.operation();

        //确保原型和它自己的克隆不是相同的对象
        Assert.assertNotEquals(prototype,prototypeClone);
    }
}
