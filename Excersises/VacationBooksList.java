package FirstStepsInCoding.Excersises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vhod 1.	Брой страници в текущата книга – цяло число в интервала [1…1000];
        //2.	Страници, които може да прочита за 1 час – цяло число в интервала [1…1000];
        //3.	Броя на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000];
        int booksPages  = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        //izchisleniq
        int bookReadingTime = booksPages / pagesPerHour;
        int readingPerDay = bookReadingTime / numberOfDays;
        //printirane
        System.out.println(readingPerDay);
    }
}
