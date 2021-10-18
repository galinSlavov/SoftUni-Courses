package midExam3006;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequence = Arrays.stream(scanner.nextLine().split( " ")).collect(Collectors.toList());
        String userInput = scanner.nextLine();

        int counter = 0;
        while (!userInput.equals("end")){
            int[] userInputArray = Arrays.stream(userInput.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int firstIndex = userInputArray[0];
            int secondIndex = userInputArray[1];

            if (userIsCheeting(firstIndex, secondIndex, sequence)){
                System.out.println("Invalid input! Adding additional elements to the board");
                counter++;
                String penaltyNumber = String.format("-%da",counter);
                sequence.add(sequence.size()/2,penaltyNumber);
                sequence.add(sequence.size()/2,penaltyNumber);

                userInput = scanner.nextLine();
                continue;
            }

            String firstNumber = sequence.get(firstIndex);
            String secondNumber = sequence.get(secondIndex);

            if (firstNumber.equals(secondNumber)){
                sequence.remove(firstNumber);
                sequence.remove(secondNumber);
                System.out.printf("Congrats! You have found matching elements - %s!%n", firstNumber);
                counter++;
            }else{
                System.out.println("Try again!");
            }

            if (sequence.size() == 0){
                break;
            }
            userInput = scanner.nextLine();
        }
        if (sequence.isEmpty()){
            System.out.printf("You have won in %d turns!",counter);
        }else{
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ",sequence));
        }


    }

    private static boolean userIsCheeting(int firstIndex, int secondIndex, List<String> sequence) {
        if (firstIndex == secondIndex){
            return true;
        }
        if (firstIndex < 0 || firstIndex >= sequence.size()){
            return true;
        }
        if (secondIndex < 0 || secondIndex >= sequence.size()){
            return  true;
        }
        return false;
    }
}
