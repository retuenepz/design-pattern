package com.hongyb.toy;

/**
 * 可以划的船，虽然这个接口没有写实现类，但是你懂的，即使有实现类只要通过对象适配模式适配了这个接口，
 * 实际就适配了他所有的实现类
 * Created by hongyanbo on 2018/2/1.
 */
public interface RowingBoat
{
    void row();
}
