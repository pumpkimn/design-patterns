package com.example.learndesignpatterns.behavioral.observer;

/**
 * @description:
 * @author: lee
 * @create: 2019/04/01 15:15
 */

/**
 * ConcreteSubject存储具体观察器对象的兴趣状态，发送一个
 * 当其状态发生变化时通知其观察员。
 *
 */
public class ConcreteSubject extends Subject {


    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObervers();
    }
}
