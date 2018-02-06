package com.hongb.pattern.event.aggregator;

/**
 * 侦察兵
 */
public class Scout extends EventEmitter{
    public Scout() {
    }

    public Scout(EventObserver observer) {
        super(observer);
    }

    @Override
    public void timePass(WeekDay day) {
        if (day.equals(WeekDay.TUESDAY)) {
            notifyObservers(Event.WARSHIPS_APPROACHING);
        }
    }
}
