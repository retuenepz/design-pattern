package com.hongyb.pattern.delegation;

/**
 * 代理printer
 * 这个模式可以说时decortator 非常相似了
 */
public class PrinterController implements Printer {
    /**
     * 被代理的printer
     */
    Printer printer ;

    public PrinterController(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String mes) {
        printer.print(mes);
    }
}
