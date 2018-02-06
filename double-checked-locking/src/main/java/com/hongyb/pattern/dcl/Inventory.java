package com.hongyb.pattern.dcl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 库存
 */
public class Inventory {
    public static final Logger LOGGER = LoggerFactory.getLogger(Inventory.class);
    private final int size ;
    private List<Item> items ;
    private final Lock lock;

    public Inventory(int size) {
        this.size = size;
        this.items = new ArrayList<>(size);
        this.lock = new ReentrantLock();
    }

    /**
     * 这个方法就是这个模式最核心的部分了
     * 双层锁的意义主要是为了提高效率，不要过度的竞争锁，减少没有必要的竞争。
     * @param item
     * @return
     */
    public boolean addItem(Item item){
        if(items.size() < this.size){
            try {
                lock.lock();
                // 什么时候使用这个模式：
                // 1 判断条件是在同步代码内部发生变化的(add操作会导致items.size+1)
                // 2 判断是发生在同步代码块内部的（同步代码块的行为会因为条件改变而改变）
                if(items.size() < this.size){
                    items.add(item);
                    LOGGER.info("{}: items.size()={}, inventorySize={}", Thread.currentThread(), items.size(), size);
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
            }finally {
                lock.unlock();
            }

        }
        return false;
    }
}
