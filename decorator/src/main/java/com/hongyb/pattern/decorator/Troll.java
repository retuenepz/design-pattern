package com.hongyb.pattern.decorator;

/**
 * 魁拔怪兽！！
 */
public interface Troll {
    /**
     * 攻击
     */
    void attack();

    /**
     * 攻击力
     * @return
     */
    int attackPower();

    /**
     * 逃跑，打不过就果断跑
     */
    void fleeBattle();
}
