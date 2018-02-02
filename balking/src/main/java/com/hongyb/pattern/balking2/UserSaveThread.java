package com.hongyb.pattern.balking2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * 用户存储线程
 * 用随机数模拟用户行为，每隔一段时间存储一次
 * Created by hongyanbo on 2018/2/2.
 */
public class UserSaveThread extends Thread{
    /**
     * 日志
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(UserSaveThread.class);
    /**
     * 数据
     */
    private Data data ;
    private Random random = new Random(1000);

    public UserSaveThread(Data data) {
        this.data = data;
    }

    /**
     * 写入数据，存储
     */
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            try {
                    data.write(i);
                    Thread.sleep(random.nextInt(1000));
                    data.save("usersave");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
