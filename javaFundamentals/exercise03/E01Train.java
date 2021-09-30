package exercise03;

import java.util.Scanner;

public class E01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = Integer.parseInt(scanner.nextLine());
//
//        int sum = 0;
//        for (int wagon = 1; wagon <= n; wagon++) {
//            int people = Integer.parseInt(scanner.nextLine());
//            System.out.print(people + " ");
//
//            sum += people;
//        }
//        System.out.println();
//        System.out.println(sum);

        int n = Integer.parseInt(scanner.nextLine());
        int[] peopleInWagons = new int[n];

        for (int index = 0; index < peopleInWagons.length - 1; index++) {
            peopleInWagons[index] = Integer.parseInt(scanner.nextLine());
        }
        int sumPeople = 0;
        for (int countPeople : peopleInWagons) {
            System.out.print(countPeople + " ");
            sumPeople += countPeople;
        }
        System.out.println();
        System.out.println(sumPeople);

    }
}
