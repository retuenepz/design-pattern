package com.hongyb.pattern.execute.around;

import java.io.FileWriter;
import java.io.IOException;

public interface SimpleFileAction {
    void writeFile(FileWriter writer) throws IOException;
}
