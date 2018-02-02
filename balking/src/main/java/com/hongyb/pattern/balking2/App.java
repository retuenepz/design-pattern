package com.hongyb.pattern.balking2;

/**
 * 我觉得洗衣机的例子不够好，所以从网上找了另外一个例子。
 * 存储文件的动作可能会被两个线程出发，一个是用户主动存储，另外一个是每隔一段时间自动存储一次。
 * Created by hongyanbo on 2018/2/2.
 */
public class App {
    public static void main(String[] args) {
        Data data = new Data();
        new AutoSaveThread(data).start();
        new UserSaveThread(data).start();
    }
}
