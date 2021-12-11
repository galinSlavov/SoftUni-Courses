package examPreparation.february2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //We take 1st element in 1st box -> Queue FIFO(first in first out)
        ArrayDeque<Integer> firstBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        //We take last element in 2nd box -> Stack LIFO
        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).forEach(secondBox::push);

        int claimedItems = 0;
        while (!firstBox.isEmpty() && !secondBox.isEmpty()){
            int sumOfBoxes = firstBox.peek() + secondBox.peek();

            if (sumOfBoxes % 2 == 0){
                claimedItems += sumOfBoxes;
                firstBox.poll();
                secondBox.pop();
            }else {
                firstBox.offerLast(secondBox.pop());
            }
        }
        if (firstBox.isEmpty()) {
            System.out.println("First magic box is empty.");
        }
        if (secondBox.isEmpty()) {
            System.out.println("Second magic box is empty.");
        }
        System.out.println(claimedItems < 90
                ? "Poor prey... Value: " + claimedItems
                : "Wow, your prey was epic! Value: " + claimedItems);
    }
}
