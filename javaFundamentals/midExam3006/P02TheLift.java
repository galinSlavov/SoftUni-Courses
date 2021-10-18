package midExam3006;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleQueue = Integer.parseInt(scanner.nextLine());
        String[] userInput = scanner.nextLine().split(" ");

        int[] liftCabins = Arrays.stream(userInput).mapToInt(Integer::parseInt).toArray();
        //List<Integer> liftCabinsList = Arrays.stream(userInput).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < liftCabins.length; i++) {
            //Влизат хора
            int peopleInCabin = liftCabins[i];
            int freeSpace = 4 - peopleInCabin;

            if (peopleInCabin == 4){
                continue;
            }

            if (freeSpace >= peopleQueue){
                liftCabins[i] = liftCabins[i] + peopleQueue;
                peopleQueue = 0;
                break;
            }
            liftCabins[i] = 4;
            peopleQueue = peopleQueue - freeSpace;
        }

        boolean hasEmptySeats = false;
        for (int peopleInCabin : liftCabins) {
             if (peopleInCabin < 4){
                 hasEmptySeats = true;
                 break;
             }
        }

        if (hasEmptySeats){
            System.out.println("The lift has empty spots!");
        }else if (!hasEmptySeats && peopleQueue != 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n",peopleQueue);
        }else {

        }
//        if (peopleQueue == 0){
//            System.out.println("The lift has empty spots!");
//        }else {
//            System.out.printf("There isn't enough space! %d people in a queue!%n",peopleQueue);
//        }

        Arrays.stream(liftCabins).forEach(e -> System.out.print(e + " "));
    }
}
