
package com.hongyb.pattern.builder;

/**
 * 作者:hongyanbo
 * 时间:2018/2/12
 */
public enum Profession {

  WARRIOR, THIEF, MAGE, PRIEST;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
