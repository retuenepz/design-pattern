package com.hongyb.pattern.factory.method;

public class OrcWeapon implements Weapon {
    private WeaponType weaponType ;

    @Override
    public String toString() {
        return "OrcWeapon{" +
                "weaponType=" + weaponType +
                '}';
    }

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }
}
