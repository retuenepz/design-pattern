package com.hongyb.pattern.callback;

/**
 * 有了java8 就可以用lambda了
 * Created by hongyanbo on 2018/2/2.
 */
public class LambdaApp {
    public static void main(String[] args) {
        Callback callback = ()-> System.out.println("|-_-|");
        new SimpleTask().executeWith(callback);
    }
}
