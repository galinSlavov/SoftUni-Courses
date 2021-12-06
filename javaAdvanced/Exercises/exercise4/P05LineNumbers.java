package exercise4;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicInteger;

public class P05LineNumbers {
    public static void main(String[] args)throws IOException {
        Path path = Path.of("C:\\Users\\BOSS\\Desktop\\" +
                "java-Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");

        String outputPath = "outputLine.txt";
        PrintWriter writer = new PrintWriter(outputPath);

        AtomicInteger countRow = new AtomicInteger(1);
        Files.readAllLines(Path.of(String.valueOf(path)))
                .forEach(line ->
                        writer.println(countRow.getAndIncrement() + ". " + line));

        writer.close();
    }
}
