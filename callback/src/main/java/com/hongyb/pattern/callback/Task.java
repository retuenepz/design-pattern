package com.hongyb.pattern.callback;

/**
 *  制定callback执行的时机
 * Created by hongyanbo on 2018/2/2.
 */
public abstract class Task {
    /**
     *  执行callback
     *  final: 不想让别人修改callback调用时机
     * @param callback
     */
    public final void executeWith(Callback callback){
        execute();
        if(callback!=null){
            callback.call();
        }
    }

    /**
     * 抽象方法留给子类去实现，爱干嘛干嘛
     */
    protected abstract void execute();
}
