package finalExam1406;

import java.util.Scanner;

public class F01Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("End")){
            String commandName = command[0];
//            o	"Translate {char} {replacement}"
//            o	"Includes {string}"
//            o	"Start {string}"
//            o	"Lowercase"
//            o	"FindIndex {char}"
//            o	"Remove {startIndex} {count}"
            switch (commandName){
                case "Translate":
                    String existedChar = command[1];
                    String replacement = command[2];
                    message = message.replace(existedChar, replacement);
                    System.out.println(message);
                    break;
                case "Includes":
                    String part = command[1];
                    if (message.contains(part)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String lastPart = command[1];
                    if (message.startsWith(lastPart)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    message = message.toLowerCase();
                    System.out.println(message);
                    break;
                case "FindIndex":
                    String symbol = command[1];
                    int index = message.lastIndexOf(symbol);
                    System.out.println(index);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    message = message.substring(endIndex, startIndex + endIndex);
                    System.out.println(message);
                    break;
            }


            command = scanner.nextLine().split("\\s+");
        }

    }
}
