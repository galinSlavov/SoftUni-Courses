package finalExam1406;

import java.util.Scanner;

public class E401TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String command = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        while (!command.equals("Decode")){
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            //•	Move {number of letters}
            //•	Insert {index} {value}
            //•	ChangeAll {substring} {replacement}
            switch (commandName){
                case "Move":
                    //взимаме 3те 1ви букви и ги слагаме в края на съобщението
                    int numberOfLetter =Integer.parseInt(commandParts[1]);

                    stringBuilder.append(message, 0, numberOfLetter);
                    message = message.substring(numberOfLetter).concat(stringBuilder.toString());
                    stringBuilder.setLength(0);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    stringBuilder.append(message);
                    message = stringBuilder.insert(index, value).toString();
                    stringBuilder.setLength(0);
                    break;
                case "ChangeAll":
                    String substring = commandParts[1];
                    String replacement = commandParts[2];
                    if (message.contains(substring)) {
                        message = message.replace(substring, replacement);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);
    }
}
