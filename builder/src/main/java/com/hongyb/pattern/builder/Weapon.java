
package com.hongyb.pattern.builder;

/**
 * 作者:hongyanbo
 * 时间:2018/2/12
 */
public enum Weapon {

  DAGGER, SWORD, AXE, WARHAMMER, BOW;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
