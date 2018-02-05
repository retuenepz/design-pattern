package com.hongyb.pattern.delegation;

import com.hongyb.pattern.delegation.printers.CanonPrinter;

/**
 * delegation 或者 proxy 模式
 * 这个模式非常相似于decorator
 * 不同点在于，deligation更重视控制访问，而decorator更重视修改对象行为.（目的性不同）
 */
public class App
{
    public static void main(String[] args) {
        // 客户端直接使用printerController不必关心具体是什么打印机
        PrinterController printerController = new PrinterController(new CanonPrinter());
        printerController.print("打印");
    }
}
