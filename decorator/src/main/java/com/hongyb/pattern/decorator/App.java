package com.hongyb.pattern.decorator;

/**
 * 经典模式 装饰器
 */
public class App {
    public static void main(String[] args) {
        System.out.println("你看到了一只魁拔,他很不友好！");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("过了一会他又回来了，并且掏出了大棒子");
        troll = new ClubbedTroll(troll);
        troll.attack();
        troll.attackPower();
        troll.fleeBattle();

    }
}
