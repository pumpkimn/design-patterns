package com.example.learndesignpatterns.creational.builder;

/**
 * @description: Product类，表示复杂对象
 * @author: lee
 * @create: 2019/03/08 13:52
 */
public class Product {
    private String part1;

    private String part2;

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }
}
