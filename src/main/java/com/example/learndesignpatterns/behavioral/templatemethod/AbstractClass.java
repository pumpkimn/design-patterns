package com.example.learndesignpatterns.behavioral.templatemethod;

/**
 * @description:
 * @author: lee
 * @create: 2019/04/01 15:00
 */
/**
 *为基本操作定义接口。实现算法。
 */
public abstract class AbstractClass {

    public String templateMethod() {
        return this.primitiveOperation1() + this.primitiveOperation2();
    }

    abstract String primitiveOperation1();

    abstract String primitiveOperation2();
}
