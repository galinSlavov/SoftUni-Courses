package lecture2;

import java.util.Scanner;

public class E08Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0.0;
        double excellentScholarship = 0.0;

        //проверка за соц.стипенция и ако може на каква стойност
        if (income < minSalary) {
            if (averageScore < 4.50) ;{
                socialScholarship = Math.floor(averageScore * 0.35);
            }
        }
        //проверка за отлична стипендия
        if (averageScore >= 5.50) {
            excellentScholarship = Math.floor(averageScore * 25);
        }
        if (socialScholarship == 0 && excellentScholarship == 0) {
            System.out.println("You cannot get a scholarship!");
        } else if (socialScholarship > excellentScholarship) {
            System.out.printf("You get a Social scholarship %.0fBGN", socialScholarship);
        } else if (socialScholarship < excellentScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);


        }
    }
}


