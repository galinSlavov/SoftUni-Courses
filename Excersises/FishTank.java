package FirstStepsInCoding.Excersises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //  Дължина в см – цяло число в интервала [10 … 500]
        //2.	Широчина в см – цяло число в интервала [10 … 300]
        //3.	Височина в см – цяло число в интервала [10… 200]
        //4.	Процент  – реално число в интервала [0.000 … 100.000]
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble((scanner.nextLine()));

        int volume = length * width * height;
        double totalLiters = volume * 0.001;
        double percentOf = percent * 0.01;
        double realTotalLiters = totalLiters * (1 - percentOf);

        System.out.printf("%.2f", realTotalLiters);


    }
}
