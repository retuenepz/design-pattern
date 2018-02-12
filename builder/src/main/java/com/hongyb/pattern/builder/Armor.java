package com.hongyb.pattern.builder;

/**
 * 盔甲枚举
 * 作者:hongyanbo
 * 时间:2018/2/12
 */
public enum Armor {
    CLOTHES("棉甲"),LEATHER("皮甲"),CHAIN_MAIL("链甲"),PLATE_MAIL("板甲"),;
    private String mes ;

    Armor(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "mes='" + mes + '\'' +
                '}';
    }
}
