package com.hongyb.pattern.factory.method;

public enum WeaponType {
    SWORD("剑"),AXE("斧头"),SPEAR("长矛"),UNDEFINED("");
    private String type;

    WeaponType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "WeaponType{" +
                "type='" + type + '\'' +
                '}';
    }

}
