package com.hongb.pattern.event.aggregator;

/**
 * 星期
 */
public enum WeekDay {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String message ;

    WeekDay(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "WeekDay{" +
                "message='" + message + '\'' +
                '}';
    }
}
