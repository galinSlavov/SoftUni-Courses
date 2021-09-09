package FirstStepsInCoding.Excersises;

import java.util.Scanner;

public class VacationBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHours = Integer.parseInt(scanner.nextLine());
        int daysNumber = Integer.parseInt(scanner.nextLine());

        int readingTime = pages / pagesPerHours;
        int neededDays = readingTime / daysNumber;
        System.out.println(neededDays);
    }
}
