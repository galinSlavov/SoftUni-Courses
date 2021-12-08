package ExamPrep.july18;

import java.util.Scanner;

public class E03AluminiumJouinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJoinery = Integer.parseInt(scanner.nextLine());
        String sizeJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();

        double sumJoinery = 0;


        if (sizeJoinery.equals("90X130")) {
            if(countJoinery <= 30 ) {
               sumJoinery = countJoinery  * 110;
            }else if (countJoinery > 30 && countJoinery < 60) {
                sumJoinery = (countJoinery  * 110) * 0.95;
            }else if (countJoinery > 60){
                sumJoinery = (countJoinery  * 110) * 0.92;
            }else if (countJoinery < 10){
                System.out.println("Invalid order");
            }
            if (delivery.equals("With delivery")){
                sumJoinery = (sumJoinery + 60) * 0.96;
            }else if(delivery.equals("Without delivery")){
                sumJoinery = sumJoinery * 0.96;
            }

        } else if (sizeJoinery.equals("100X150")) {
            if(countJoinery <= 30 ) {
                sumJoinery = countJoinery  * 140;
            }else if (countJoinery > 30 && countJoinery < 60) {
                sumJoinery = (countJoinery  * 140) * 0.94;
            }else if (countJoinery > 60){
                sumJoinery = (countJoinery  * 140) * 0.90;
            }else if (countJoinery < 10){
                System.out.println("Invalid order");
            }
            if (delivery.equals("With delivery")){
                sumJoinery = (sumJoinery + 60) * 0.96;
            }else if(delivery.equals("Without delivery")){
                sumJoinery = sumJoinery * 0.96;
            }

        } else if (sizeJoinery.equals("130X180")) {
            if(countJoinery <= 30 ) {
                sumJoinery = countJoinery  * 190;
            }else if (countJoinery > 30 && countJoinery < 60) {
                sumJoinery = (countJoinery  * 190) * 0.93;
            }else if (countJoinery > 60){
                sumJoinery = (countJoinery  * 190) * 0.88;
            }else if (countJoinery < 10){
                System.out.println("Invalid order");
            }
            if (delivery.equals("With delivery")){
                sumJoinery = (sumJoinery + 60) * 0.96;
            }else if(delivery.equals("Without delivery")){
                sumJoinery = sumJoinery * 0.96;
            }

        } else if (sizeJoinery.equals("200X300")) {
            if(countJoinery <= 30 ) {
                sumJoinery = countJoinery  * 250;
            }else if (countJoinery > 30 && countJoinery < 60) {
                sumJoinery = (countJoinery  * 250) * 0.91;
            }else if (countJoinery > 60){
                sumJoinery = (countJoinery  * 250) * 0.86;
            }else if (countJoinery < 10){
                System.out.println("Invalid order");
            }
            if (delivery.equals("With delivery")){
                sumJoinery = (sumJoinery + 60) * 0.96;
            }else if(delivery.equals("Without delivery")){
                sumJoinery = sumJoinery * 0.96;
            }

        }
        System.out.printf("%.2f BGN",sumJoinery);
    }
}
