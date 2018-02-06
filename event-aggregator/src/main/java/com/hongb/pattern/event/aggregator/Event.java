package com.hongb.pattern.event.aggregator;

/**
 * 各种事件
 */
public enum Event {
    STARK_SIGHTED("发现了stark"),WARSHIPS_APPROACHING("敌方战船接近中"), TRAITOR_DETECTED(
            "发现叛徒");
    private String message ;

    Event(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Event{" +
                "message='" + message + '\'' +
                '}';
    }
}
