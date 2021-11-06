package lecture4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("out-as.txt");

        PrintStream out = new PrintStream(outputStream);

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                out.println(number);
            }
            scanner.next();
        }
        inputStream.close();
        outputStream.close();
    }
}
