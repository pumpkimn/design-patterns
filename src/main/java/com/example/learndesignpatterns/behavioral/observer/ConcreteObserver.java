package com.example.learndesignpatterns.behavioral.observer;

/**
 * @description:
 * @author: lee
 * @create: 2019/04/01 15:12
 */

/**
 * 具体观察器维护对具体主题对象的引用，存储
 * 说明应与受试者保持一致，实施观察者
 * 更新界面以保持其状态与主题一致。
 */
public class ConcreteObserver implements Observer {

    private int observerState;

    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    public void update() {
        observerState = subject.getState();
    }

    protected int getObserverState() {
        return observerState;
    }
}
