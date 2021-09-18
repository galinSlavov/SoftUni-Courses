package lecture5.moreexercises;

import java.util.Scanner;

public class E04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        double fail = 0;
        double between34 = 0;
        double between45 = 0;
        double top = 0;
        double allStudents = 0;
        double averageScore = 0;
        for (int i = 1; i <= countStudents; i++) {
            double gradePerStudent = Double.parseDouble(scanner.nextLine());

            if (gradePerStudent >= 2.00 && gradePerStudent <= 2.99) {
                fail++;
                allStudents++;
            } else if (gradePerStudent >= 3.00 && gradePerStudent <= 3.99) {
                between34++;
                allStudents++;
            } else if (gradePerStudent >= 4.00 && gradePerStudent <= 4.99) {
                between45++;
                allStudents++;
            } else if (gradePerStudent >= 5.00) {
                top++;
                allStudents++;
            }

            averageScore += gradePerStudent;
        }
        System.out.printf("Top students: %.2f%%\n",(top/allStudents) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",(between45/allStudents) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",(between34/allStudents) * 100);
        System.out.printf("Fail: %.2f%%\n",(fail/allStudents) * 100);
        System.out.printf("Average: %.2f\n",(averageScore/allStudents));
    }
}
