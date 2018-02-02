package com.hongyb.pattern.callback;

/**
 *  普通方式使用callback
 *  没有java8之前都是这样干的
 * Created by hongyanbo on 2018/2/2.
 */
public class App {
    public static void main(String[] args) {
        Callback callback = new Callback() {
            public void call() {
                System.out.println("|-_-|");
            }
        };
        new SimpleTask().executeWith(callback);
    }
}
