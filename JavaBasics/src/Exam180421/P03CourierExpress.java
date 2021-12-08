package Exam180421;

import java.util.Scanner;

public class P03CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Тегло на пратката в килограми – реално число в интервала [0.01 ... 150.00]
        //2.	Тип услуга –  текст със следните възможности: "standard" или "express"
        //3.	Разстояние в километри – цяло число в интервала [1 ... 1000]
        double packagesKg = Double.parseDouble(scanner.nextLine());
        String services = scanner.nextLine();
        int distanceKm = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        if(services.equals("standard")){
            if(packagesKg < 1){
               totalPrice = distanceKm * 0.03;
            }else if(packagesKg < 10){
                totalPrice = distanceKm * 0.05;
            }else if(packagesKg < 40){
                totalPrice = distanceKm * 0.10;
            }else if(packagesKg < 90){
                totalPrice = distanceKm * 0.15;
            }else if( packagesKg < 150){
                totalPrice = distanceKm * 0.20;
            }
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",packagesKg,totalPrice);

        }else if(services.equals("express")){

            if(packagesKg < 1){
                totalPrice = distanceKm * 0.03 + 0.03 * 0.80 * packagesKg * distanceKm;
            }else if(packagesKg < 10){
                totalPrice = distanceKm * 0.05 + 0.05 * 0.40 * packagesKg * distanceKm;
            }else if(packagesKg < 40){
                totalPrice = distanceKm * 0.10 + 0.10 * 0.05 * packagesKg * distanceKm;
            }else if(packagesKg < 90){
                totalPrice = distanceKm * 0.15 + 0.15 * 0.02 * packagesKg * distanceKm;
            }else if( packagesKg < 150){
                totalPrice = distanceKm * 0.20 + 0.20 * 0.01 * packagesKg * distanceKm;
            }
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",packagesKg,totalPrice);
        }


    }
}
