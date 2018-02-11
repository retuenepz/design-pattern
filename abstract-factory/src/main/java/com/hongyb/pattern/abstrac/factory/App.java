package com.hongyb.pattern.abstrac.factory;

/**
 * 这个类跟模式没啥关系
 * 只是为了测试而存在
 */
public class App {
    public static void main(String[] args) {
        KingdomFactory factory = new ElfKingdomFactory();
        Army army = factory.createArmy();
        Castle castle = factory.createCastle();
        King king = factory.createKing();

    }
}
