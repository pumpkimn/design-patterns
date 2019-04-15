package com.example.learndesignpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: lee
 * @create: 2019/04/01 15:14
 */
/**
 *受试者了解其观察员。任何数量的观察者对象都可以观察到
 *主题。
 *
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObervers() {
        for (Iterator iterator = observers.iterator(); iterator.hasNext();) {
            Observer observer = (Observer) iterator.next();
            observer.update();
        }
    }
}
