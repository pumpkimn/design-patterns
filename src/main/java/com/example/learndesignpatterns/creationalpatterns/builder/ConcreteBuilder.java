package com.example.learndesignpatterns.creationalpatterns.builder;

/**
 * @description: 类，构造和组装产品的各个部分 实现构建器接口
 * @author: lee
 * @create: 2019/03/08 13:51
 */
public class ConcreteBuilder extends Builder {

    private Product product;

    @Override
    public Builder createProduct() {
        this.product = new Product();
        return this;
    }

    @Override
    public Builder builderPart1(String part) {
        product.setPart1(part);
        return this;
    }

    @Override
    public Builder builderPart2(String part) {
        product.setPart2(part);
        return this;
    }

    public Product getResult(){
        return  product;
    }
}
