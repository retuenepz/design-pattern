package com.hongyb.pattern.builder;

/**
 * 作者:hongyanbo
 * 时间:2018/2/12
 */
public class App {
    public static void main(String[] args) {
        Hero mage =
                new Hero.Builder(Profession.MAGE, "Riobard").withHairColor(HairColor.BLACK)
                        .withWeapon(Weapon.DAGGER).build();
    }
}
