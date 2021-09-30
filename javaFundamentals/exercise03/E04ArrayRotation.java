package exercise03;

import java.util.Scanner;

public class E04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // "51, 47, 32, 61, 21"
        String[] numbers = input.split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine()); // count rotations

        for (int rotation = 1; rotation <= countRotations ; rotation++) {
            //rotation
            // 1.take first element
            String firstElement = numbers[0];

            // 2.change all elements with one in left
            for (int index = 0; index < numbers.length - 1; index++) {
                 numbers[index] = numbers[index + 1];
            }
            // 3.last index have to be first element
            numbers[numbers.length - 1] = firstElement;
        }

        System.out.println(String.join(" ",numbers));
    }
}
