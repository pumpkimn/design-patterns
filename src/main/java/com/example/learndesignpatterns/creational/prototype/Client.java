package com.example.learndesignpatterns.creational.prototype;

/**
 * @description: 通过要求原型克隆自己来创建一个新对象。
 * @author: lee
 * @create: 2019/03/08 13:35
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype operation()throws CloneNotSupportedException{
        return prototype.copyMe();
    }
}
