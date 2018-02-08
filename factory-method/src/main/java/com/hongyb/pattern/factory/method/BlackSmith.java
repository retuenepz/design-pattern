package com.hongyb.pattern.factory.method;

/**
 * 铁匠接口
 *
 * */
public interface BlackSmith {
    Weapon manufactureWeapon(WeaponType type);
}
