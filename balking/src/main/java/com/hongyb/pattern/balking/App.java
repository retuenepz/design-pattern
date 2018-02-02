package com.hongyb.pattern.balking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *  balking pattern
 *  洗衣机例子
 *  这个例子当中洗衣机有俩状态，ENABLED 就是说没人占用洗衣机，可以随便用。WASHING 就是有人正在洗衣服，后来的人肯定就用不了了。
 *  ps:吐槽一下，我觉得这个例子并不是很好，没有体现出竞争，并且掺杂了concurrent包 和java8的知识，所以你可以瞅瞅另外一个例子。
 * Created by hongyanbo on 2018/2/2.
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        final WashingMaching washingMaching = new WashingMaching();
        // 固定大小线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.execute(washingMaching::wash);
        }
        executorService.shutdown();
        // 等待线程结束
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LOGGER.error("ERROR:正在等待线程结束");
        }

    }
}
