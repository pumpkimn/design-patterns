package com.example.learndesignpatterns.creationalpatterns.builder;

/**
 * @description: 类，使用生成器接口构造对象
 * @author: lee
 * @create: 2019/03/08 13:53
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.createProduct().builderPart1("part1").builderPart2("part2");
    }
}
