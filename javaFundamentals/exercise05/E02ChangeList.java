package exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrays = Arrays.stream(scanner.nextLine()
                .split("\\s+"))  // its called whitespace
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandData = command.split("\\s+");
            String cmd = commandData[0];

            if (cmd.equals("Delete")) {
                int element = Integer.parseInt(commandData[1]);
                while (arrays.contains(element)) {
                    arrays.remove(Integer.valueOf(element));
                }

            } else {
                int element = Integer.parseInt(commandData[1]);
                int index = Integer.parseInt(commandData[2]);
                if (index < arrays.size()) {
                    arrays.add(index, element);
                }
            }
                command = scanner.nextLine();
            }
            for (int array : arrays) {
                System.out.print(array + " ");
            }

        }

    }
