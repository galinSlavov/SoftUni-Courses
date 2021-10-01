package lecture04;

import java.util.Scanner;

public class E05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (product.equals("coffee")){
            coffee(1.50,quantity);
        }else if (product.equals("water")){
            water(1.00,quantity);
        }else if (product.equals("coke")){
            coke(1.40,quantity);
        }else if (product.equals("snacks")){
            snacks(2.00,quantity);
        }
    }

    private static void snacks(double v, double quantity) {
        System.out.printf("%.2f",v * quantity);
    }

    private static void coke(double v, double quantity) {
        System.out.printf("%.2f",v * quantity);
    }

    private static void water(double v, double quantity) {
        System.out.printf("%.2f",v * quantity);
    }

    private static void coffee(double v, double quantity) {
        System.out.printf("%.2f",v * quantity);
    }


}
