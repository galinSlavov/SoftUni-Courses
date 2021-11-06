package lecture4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class P06SortLine {
    public static void main(String[] args)throws IOException {

        Path path = Paths.get("C:\\Desktop\\JavaAdvanced\\input.txt");

        List<String> line = Files.readAllLines(path)
                .stream()
                .sorted()
                .collect(Collectors.toList());

        Files.write(Paths.get("out-sorted.txt"),line);
    }
}
