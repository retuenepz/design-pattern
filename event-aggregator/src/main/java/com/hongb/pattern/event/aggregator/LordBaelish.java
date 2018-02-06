package com.hongb.pattern.event.aggregator;

/**
 * 妓院老板 小指头
 * 负责向首相报告情况
 */
public class LordBaelish  extends EventEmitter{

    public LordBaelish() {
    }

    public LordBaelish(EventObserver observer) {
        super(observer);
    }

    @Override
    public void timePass(WeekDay day) {
        // 星期五的时候报告STARK_SIGHTED
        if (day.equals(WeekDay.FRIDAY)) {
            notifyObservers(Event.STARK_SIGHTED);
        }
    }
}
