package com.oriharakun.kidosanswitch.setlist;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class readtest {
 
    public static void main(String[] args) throws IOException {
        
        Path file = Paths.get("./softwarePath.txt");
        String text = Files.readString(file);

        System.out.println(text);
    }
}
