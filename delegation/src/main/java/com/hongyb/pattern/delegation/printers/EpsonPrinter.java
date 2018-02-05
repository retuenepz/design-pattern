package com.hongyb.pattern.delegation.printers;

import com.hongyb.pattern.delegation.Printer;

/**
 * Epson打印机
 */
public class EpsonPrinter implements Printer{

    @Override
    public void print(String mes) {
        System.out.println("Epson打印机打印"+mes);
    }
}
