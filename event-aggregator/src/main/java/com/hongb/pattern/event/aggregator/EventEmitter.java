package com.hongb.pattern.event.aggregator;

import java.util.LinkedList;
import java.util.List;

/**
 * 事件分发器
 * 事件的生产者
 *
 */
public abstract class EventEmitter {
    /**
     * 观察者们
     */
    private List<EventObserver> observers ;

    public EventEmitter() {
        observers = new LinkedList<>();
    }
    public EventEmitter(EventObserver observer) {
        this();
        registObserver(observer);
    }

    /**
     * 注册观察者
     * @param observer
     */
    public void registObserver(EventObserver observer){
        this.observers.add(observer);
    }

    /**
     * 通知观察者
     */
    protected void notifyObservers(Event event){
        this.observers.stream().forEach(observer -> observer.onEvent(event));
    }

    /**
     * 由子类自己决定在什么时候发出什么样的事件
     */
    public abstract void timePass(WeekDay day);
}
