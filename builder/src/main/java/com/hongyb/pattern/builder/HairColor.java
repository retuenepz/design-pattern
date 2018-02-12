package com.hongyb.pattern.builder;

/**
 * 作者:hongyanbo
 * 时间:2018/2/12
 */
public enum HairColor {
    WHITE,BLOND,RED,BROWN,BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
