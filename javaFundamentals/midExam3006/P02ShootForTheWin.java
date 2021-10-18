package midExam3006;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequence = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String userInput = scanner.nextLine();

        int shots = 0;
        while (!userInput.equals("End")) {
            int[] userInputArray = Arrays.stream(userInput.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();


            userInput = scanner.nextLine();
        }
    }
}
