/*
* File: FileHandler.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft I/N
* Date: 2026-04-21
* Github: https://github.com/CWGSkyStone
* Licenc: MIT
*/

package dev.skystone;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    static void writeToFile(String line){
        try {
            tryWriteToFile(line);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    private static void tryWriteToFile(String line) throws IOException{
        FileWriter wr = new FileWriter("test.txt", true);
        wr.write(line);
        wr.close();
    }
}
