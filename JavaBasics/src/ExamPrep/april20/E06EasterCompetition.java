package ExamPrep.april20;

import java.util.Scanner;

public class E06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCozunak = Integer.parseInt(scanner.nextLine());
        String gradeAsString = "";
        String topShef = "";

        int maxChefGrades = Integer.MIN_VALUE;

        for (int i = 1; i <= numberOfCozunak; i++) {

            String nameOfChef = scanner.nextLine();
            gradeAsString = scanner.nextLine();
            int sumGrades = 0;

            while (!gradeAsString.equals("Stop")){
                int grade = Integer.parseInt(gradeAsString);

                if (grade <= 0 || grade > 10)
                {
                    gradeAsString = scanner.nextLine();
                    continue;
                }

                sumGrades += grade;
                gradeAsString = scanner.nextLine();

            }
            System.out.printf("%s has %d points.\n",nameOfChef,sumGrades);

            if (sumGrades > maxChefGrades){
               maxChefGrades =  sumGrades;
                topShef = nameOfChef;
                System.out.printf("%s is the new number 1!\n",topShef);
            }

        }
        System.out.printf("%s won competition with %d points!\n",topShef,maxChefGrades);
    }
}
