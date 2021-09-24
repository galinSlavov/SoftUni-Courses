package ExamPrep.march28;

import java.util.Scanner;

public class E03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//1.	Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
//2.	Размерът на сета - текст с възможности: "small" или "big"
//3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int countOrderSets =Integer.parseInt(scanner.nextLine());

        double priceForSet = 0;
        if (fruit.equals("Watermelon")){
              if (size.equals("small")){
               priceForSet = 2 * 56.00;
              }else if (size.equals("big")){
               priceForSet = 5 * 28.70;
              }
        }else if (fruit.equals("Mango")){
            if (size.equals("small")){
                priceForSet = 2 * 36.66;
            }else if (size.equals("big")){
                priceForSet = 5 * 19.60;
            }
        }else if (fruit.equals("Pineapple")){
            if (size.equals("small")){
                priceForSet = 2 * 42.10;
            }else if (size.equals("big")){
                priceForSet = 5 * 24.80;
            }
        }else if (fruit.equals("Raspberry")){
            if (size.equals("small")){
                priceForSet = 2 * 20.00;
            }else if (size.equals("big")){
                priceForSet = 5 * 15.20;
            }
        }
        double totalPrice = priceForSet * countOrderSets;
        if (totalPrice > 400 && totalPrice <= 1000){
            totalPrice = totalPrice - (totalPrice * 0.15);
            System.out.printf("%.2f lv.",totalPrice);
        }else if(totalPrice > 1000){
            totalPrice = totalPrice - (totalPrice * 0.50);
            System.out.printf("%.2f lv.",totalPrice);
        }else {
            System.out.printf("%.2f lv.",totalPrice);
        }
    }
}
