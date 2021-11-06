package lecture4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class P02WriteFile {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("out.txt");
        int value = inputStream.read();
        Set<Character> punctuation = Set.of(',', '.', '!', '?');


        while (value != -1) {
            char current = (char) value;
            if (!punctuation.contains(current)) {
                outputStream.write(current);

            }
            value = inputStream.read();
        }
        inputStream.close();
        outputStream.close();
    }
}

