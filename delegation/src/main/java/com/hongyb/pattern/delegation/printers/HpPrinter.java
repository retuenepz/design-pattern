package com.hongyb.pattern.delegation.printers;

import com.hongyb.pattern.delegation.Printer;

/**
 * 惠普打印机
 */
public class HpPrinter implements Printer {
    @Override
    public void print(String mes) {
        System.out.println("Hp打印机打印"+mes);
    }
}
