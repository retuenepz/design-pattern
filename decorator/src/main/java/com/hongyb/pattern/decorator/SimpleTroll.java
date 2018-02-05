package com.hongyb.pattern.decorator;

/**
 * 简单魁拔 没武器的那种
 */
public class SimpleTroll implements Troll{

    @Override
    public void attack() {
        System.out.println("魁拔要揍你了！");
    }

    @Override
    public int attackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("魁拔逃跑了！");
    }
}
