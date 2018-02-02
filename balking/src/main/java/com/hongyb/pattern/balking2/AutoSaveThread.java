package com.hongyb.pattern.balking2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自动存储线程
 * Created by hongyanbo on 2018/2/2.
 */
public class AutoSaveThread extends Thread {
    /**
     * 日志
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(AutoSaveThread.class);
    /**
     * 数据
     */
    private Data data;

    public AutoSaveThread(Data data) {
        this.data = data;
    }
    /**
     * 非常简单，每隔一段时间就去调用一次存储
     */
    @Override
    public void run() {
        while (true){
            // 存储然后等待
                data.save("autosave");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
