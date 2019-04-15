package com.example.learndesignpatterns.behavioral.templatemethod;

/**
 * @description:
 * @author: lee
 * @create: 2019/04/01 15:04
 */
/**
 *
 *实现基本操作，以执行特定于子类的步骤
 *算法。
 *
 */
public class ConcreteClass extends AbstractClass {
    @Override
    String primitiveOperation1() {
        return "Template";
    }

    @Override
    String primitiveOperation2() {
        return "Method";
    }
}
