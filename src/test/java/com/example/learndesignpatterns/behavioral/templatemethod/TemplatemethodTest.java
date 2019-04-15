package com.example.learndesignpatterns.behavioral.templatemethod;

import com.example.learndesignpatterns.LearnDesignPatternsApplicationTests;
import com.example.learndesignpatterns.behavioral.templatemethod.ConcreteClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: lee
 * @create: 2019/04/01 15:06
 */
public class TemplatemethodTest extends LearnDesignPatternsApplicationTests {
    @Test
    public void test() {
        ConcreteClass template = new ConcreteClass();
        Assert.assertEquals("TemplateMethod", template.templateMethod());
    }
}
