package com.hongyb.pattern.abstrac.factory;

/**
 * 抽象工厂
 * 具体实现交给子类
 */
public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
