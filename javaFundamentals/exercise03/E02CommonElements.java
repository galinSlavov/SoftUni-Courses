package exercise03;

import java.util.Scanner;

public class E02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 red = 1 masiv
        // 2 red = 2 masiv

        String firsRow = scanner.nextLine();  //Hey hello 2 4
        String secondRow = scanner.nextLine(); //10 hey 4 hello

        String[] array1 = firsRow.split(" "); // ["Hey" "hello" "2" "4"]
        String[] array2 = secondRow.split(" "); // ["10" "hey" "4" "hello"]

        for (String secondWord : array2){
            for (String firstWord : array1){
                if (secondWord.equals(firstWord)){
                    System.out.print(firstWord + " ");
                }
            }
        }
    }
}
