package exercise4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class P08GetFolderSize {
    public static void main(String[] args)throws IOException {
        Path path = Path.of("C:\\Users\\BOSS\\Desktop\\" +
                "java-Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");

        File folder = new File(String.valueOf(path));
        File [] filesInFolder = folder.listFiles();

        int folderSize = 0;
        for (File file : filesInFolder){
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);
    }
}
