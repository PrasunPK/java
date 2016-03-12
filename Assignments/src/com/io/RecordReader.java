package com.io;

import java.io.File;
import java.io.FileReader;

public class RecordReader {
    public String[] read(String fileName) {
        File file = new File(fileName);
        char[] data = new char[(int) file.length()];
        try {
            FileReader reader = new FileReader(file);
            reader.read(data);
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
        String content = new String(data);
        return content.split("\n");
    }
}
