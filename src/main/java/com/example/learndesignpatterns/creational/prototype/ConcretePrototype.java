package com.example.learndesignpatterns.creational.prototype;

/**
 * @description: 实现原型，即克隆方法。
 * @author: lee
 * @create: 2019/03/08 13:36
 */
public class ConcretePrototype extends Prototype {
    /**
     * 实现原型，即克隆方法。
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Prototype copyMe() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }
}
