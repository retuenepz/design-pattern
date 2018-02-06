package com.hongb.pattern.event.aggregator;

/**
 * 这个就是所谓的事件聚合器了，这个类不生产任何事件，只负责把监听到的事件转发给监听者
 * 他既是事件发送者也是事件接受者，接受其他对象的事件将他们转发给其他订阅了自己的监听者
 * 国王之手就是首相
 * 屎大颗就是死在这个位置
 */
public class KingsHand extends EventEmitter implements EventObserver{

    public KingsHand(EventObserver observer) {
        super(observer);
    }

    public KingsHand() {

    }

    @Override
    public void timePass(WeekDay day) {
        // 与时间无关
    }

    @Override
    public void onEvent(Event e) {
        // 转发
        notifyObservers(e);
    }
}
