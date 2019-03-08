package com.example.learndesignpatterns.creationalpatterns.builder;

/**
 * @description: 声明用于创建产品对象部件的接口
 * @author: lee
 * @create: 2019/03/08 13:49
 */
public abstract class Builder {

    public abstract Builder createProduct();

    public abstract Builder builderPart1(String part);

    public abstract Builder builderPart2(String part);
}
