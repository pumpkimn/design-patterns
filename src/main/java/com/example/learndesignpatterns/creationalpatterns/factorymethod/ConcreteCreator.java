package com.example.learndesignpatterns.creationalpatterns.factorymethod;

/**
 * @description: 类返回ConcreteProduct的实例 ( Creator 类的 实现)
 * @author: lee
 * @create: 2019/03/08 14:03
 */
public class ConcreteCreator extends Creator {
    @Override
    Product factoryMethod(String type) {
//        if (type.equals("A")) {
//            return new ConcreteProductA();
//        }else if (type.equals("B")){
//            return new ConcreteProductB();
//        }
//        return null;
        switch (type){
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                return null;
        }
    }
}
