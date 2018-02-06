package com.hongb.pattern.event.aggregator;

/**
 * 大太监varys
 * 事件生产者
 */
public class LordVarys extends EventEmitter{
    public LordVarys() {
    }

    public LordVarys(EventObserver observer) {
        super(observer);
    }

    @Override
    public void timePass(WeekDay day) {
        // 星期六报告TRAITOR_DETECTED
        if (day.equals(WeekDay.SATURDAY)) {
            notifyObservers(Event.TRAITOR_DETECTED);
        }
    }
}
