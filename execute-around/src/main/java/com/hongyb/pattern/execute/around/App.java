package com.hongyb.pattern.execute.around;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 老实说我觉得Function接口比这个模式好用。
 */
public class App {
    public static void main(String[] args)  throws IOException {
        new SimpleFileWriter("123.txt", new SimpleFileAction() {
            @Override
            public void writeFile(FileWriter writer) throws IOException {
                writer.write("hehe");
            }
        });
    }
}
