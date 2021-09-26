package exercise01;

import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalSum = 0;
        while (!input.equals("Start")) {
            double currentSum = Double.parseDouble(input);
            if (currentSum == 0.10 || currentSum == 0.20 ||
                    currentSum == 0.50 || currentSum == 1.00 || currentSum == 2.00) {
                totalSum = totalSum + currentSum;
            }else {
                System.out.printf("Cannot accept %.2f\n",currentSum);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")){
            double price = 0;
            if (product.equals("Nuts") || product.equals("Water") || product.equals("Crisps") || product.equals("Soda") || product.equals("Coke")) {
                if (product.equals("Nuts")) {
                    price = 2;
                } else if (product.equals("Water")) {
                    price = 0.7;
                } else if (product.equals("Crisps")) {
                    price = 1.5;
                } else if (product.equals("Soda")) {
                    price = 0.8;
                } else {
                    price = 1;
                }
                if (totalSum >= price){
                    System.out.printf("Purchased %s\n",product);
                    totalSum -= price;
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else {
                System.out.println("Invalid product");
            }

            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",totalSum);
    }
}
