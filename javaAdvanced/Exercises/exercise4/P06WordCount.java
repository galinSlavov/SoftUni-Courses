package exercise4;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class P06WordCount {
    public static void main(String[] args)throws IOException {
        String pathOne = ("C:\\Users\\BOSS\\Desktop\\" +
                "java-Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        String pathTwo = ("C:\\Users\\BOSS\\Desktop\\" +
                "java-Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        String outputPath = "outputMerge.txt";

        PrintWriter writer = new PrintWriter(outputPath);
        Files.readAllLines(Path.of(pathOne))
                .forEach(writer::println);
        Files.readAllLines(Path.of(pathTwo))
                .forEach(writer::println);

        writer.close();
    }
}
