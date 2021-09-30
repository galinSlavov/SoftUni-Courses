package exercise03;

import java.util.Arrays;
import java.util.Scanner;

public class E06EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isFound = false;

        for (int index = 0; index < numbers.length; index++) {

            int leftSum = 0; //sum of element in left
            int rightSum = 0; //sum of element in right
            // to find element in left -> 0 index to myIndex

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }
            // sum of elements in right -> take myIndex + 1 to last (number.length - 1)
            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1 ; rightIndex++) {
                rightSum += numbers[rightIndex];
            }
            //check right and left are equal
            if (leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("no");
        }
    }
}
