package com.hongyb.pattern.balking;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  洗衣机
 * Created by hongyanbo on 2018/2/2.
 */
public class WashingMaching {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(WashingMaching.class);
    /**
     * 洗衣机状态
     */
    private WashingMachineState washingMachineState;

    /**
     * 默认初始化状态为ENABLED
     */
    public WashingMaching() {
        washingMachineState = WashingMachineState.ENABLED;
    }

    /**
     * 如果状态为ENABLED 就可以洗 否则就不能洗衣服
     */
    public void wash(){
        synchronized (this){
            LOGGER.info("{}:当前洗衣机状态为：{}",Thread.currentThread().getName(),washingMachineState);
            if (washingMachineState == WashingMachineState.WASHING){
                LOGGER.info("{}:洗衣机被人占用了,老子洗不了了",Thread.currentThread().getName());
                return;
            }
            // 抢到了洗衣机
            washingMachineState = WashingMachineState.WASHING;
        }
        // 代码执行到这里就不存在竞争了。已经抢到了执行顺序的线程可以为所欲为，比如说睡一会
        LOGGER.info("{}:正在洗衣服",Thread.currentThread().getName());
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        endWashing();
    }
    /**
     * 洗完衣服
     */
    public synchronized void endWashing(){
        washingMachineState = WashingMachineState.ENABLED;
        LOGGER.info("{}:我已经洗完了，你们可以继续抢了",Thread.currentThread().getName());
    }
}
