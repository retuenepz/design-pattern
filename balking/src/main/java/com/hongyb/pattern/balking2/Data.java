package com.hongyb.pattern.balking2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 要存储的数据
 * Created by hongyanbo on 2018/2/2.
 */
public class Data {
    /**
     * 日志
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(Data.class);
    /**
     * 是否能够存储的标志
     * true代表可以save
     * false代表不能save
     */
    private boolean flag = false;
    /**
     * 保存
     */
    public synchronized void save(String who) {
        if(!flag){
            LOGGER.info("{}调用：不需要save",who);
            return;
        }
        LOGGER.info("{}调用:save完成",who);
        flag=false;
    }

    /**
     * 写数据
     * @param i
     */
    public synchronized void write(int i) {
        LOGGER.info("数据写入完成{}",i);
        flag=true;
    }
}
