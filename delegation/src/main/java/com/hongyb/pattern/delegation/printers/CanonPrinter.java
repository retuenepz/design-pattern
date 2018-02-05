package com.hongyb.pattern.delegation.printers;

import com.hongyb.pattern.delegation.Printer;

/**
 * Canon打印机
 */
public class CanonPrinter implements Printer {
    @Override
    public void print(String mes) {
        System.out.println("cannon 打印机打印"+mes);
    }
}
