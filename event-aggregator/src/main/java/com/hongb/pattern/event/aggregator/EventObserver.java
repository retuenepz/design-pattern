package com.hongb.pattern.event.aggregator;

/**
 * 事件监听接口
 * 消费事件
 */
public interface EventObserver {
    void onEvent(Event e);
}
