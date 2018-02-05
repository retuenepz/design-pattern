package com.hongyb.pattern.decorator;


import javax.sound.midi.Soundbank;

/**
 * 掏出了大棒子的魁拔
 * 这个类就是装饰器了！
 */
public class ClubbedTroll implements Troll{

    /**
     * 被装饰的对象
     */
    private Troll decorated ;

    public ClubbedTroll(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        System.out.println("装备了大棒子");
        decorated.attack();
    }

    @Override
    public int attackPower() {
        // 由于拿了棒子 攻击力提升
        // 这意味着装饰器可以改变被装饰对象本身的行为
        System.out.println("系统：装备大棒子攻击力+10");
        return decorated.attackPower()+10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("没有用还是打不过你");
        decorated.fleeBattle();
    }
}
