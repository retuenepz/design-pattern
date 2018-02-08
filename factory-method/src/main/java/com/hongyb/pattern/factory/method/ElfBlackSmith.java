package com.hongyb.pattern.factory.method;

/**
 * 精灵铁匠
 */
public class ElfBlackSmith implements BlackSmith{

    @Override
    public Weapon manufactureWeapon(WeaponType type) {
        return new ElfWeapon(type);
    }
}
