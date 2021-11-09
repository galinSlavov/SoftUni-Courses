package lecture6;

import java.util.Scanner;

public class P01MainForCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        P01Car car = new P01Car("Ferrari", "GT350", 1000);

        P01Car car1 = new P01Car("Tesla", "Model T", 2000);

        P01Car car2 = new P01Car("BMW", "X5", 3000);
        // variation 1
//        System.out.printf("This car is: %s %s %d HP.",
//                car.getBrand(),car.getModel(),car.getHorsePower());

        //variation 2 We place all information in toString method
        String s = car.toString();
        String s1 = car1.toString();
        String s2 = car2.toString();

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
