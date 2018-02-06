package com.hongyb.pattern.execute.around;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {
    public SimpleFileWriter(String fileName , SimpleFileAction fileAction) throws IOException {
            FileWriter fileWriter = new FileWriter(fileName);
            try {
                fileAction.writeFile(fileWriter);
            }finally {
                fileWriter.close();
            }
    }
}
