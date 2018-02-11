package com.hongyb.pattern.abstrac.factory;

/**
 * 兽人王国工厂
 * 抽象工厂的一个具体实现
 * 负责生产一族的产品
 */
public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
