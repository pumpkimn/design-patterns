package com.example.learndesignpatterns.behavioral.observer;

import com.example.learndesignpatterns.LearnDesignPatternsApplicationTests;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description:
 * @author: lee
 * @create: 2019/04/01 15:19
 */
public class ObserverTest extends LearnDesignPatternsApplicationTests {

    @Test
    public void test() {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer = new ConcreteObserver(subject);
        subject.attach(observer);
        subject.setState(1);

        //通过subject.setState的变化向观察者传播
        Assert.assertEquals(1, ((ConcreteObserver) observer).getObserverState());

        subject.dettach(observer);
        subject.setState(0);

        // 观察者是分离的，所以变化不会传播
        Assert.assertEquals(1, ((ConcreteObserver) observer).getObserverState());
    }
}
