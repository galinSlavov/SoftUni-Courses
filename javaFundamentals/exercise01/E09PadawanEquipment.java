package exercise01;

import java.util.Scanner;

public class E09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
       double lightSaber = Double.parseDouble(scanner.nextLine());
        double robe = Double.parseDouble(scanner.nextLine());
        double belt = Double.parseDouble(scanner.nextLine());



        double totalLightSabers = lightSaber * Math.ceil(countOfStudents + (countOfStudents * 0.10));
        double totalRobes = robe * countOfStudents;
        double totalBelts = countOfStudents * belt;
        int freeBelts = countOfStudents / 6;

        double totalNeededMoney = totalLightSabers + totalRobes + (totalBelts - freeBelts * belt);

        if (totalNeededMoney <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",totalNeededMoney);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",Math.abs (amountOfMoney - totalNeededMoney));
        }
    }
}
