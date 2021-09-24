package ExamPrep;

import java.util.Scanner;

public class E03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String device = scanner.nextLine();

        double hard = 0;
        double performance = 0;
        double total = 0;
        if(country.equals("Russia")){
            if(device.equals("ribbon")){
               hard = 9.100;
               performance = 9.400;
               total = hard + performance;

            }else if(device.equals("hoop")){
                hard = 9.300;
                performance = 9.800;
                total = hard + performance;
            }else if(device.equals("rope")){
                hard = 9.600;
                performance = 9.000;
                total = hard + performance;
            }

        }else if(country.equals("Bulgaria")){
            if(device.equals("ribbon")){
                hard = 9.600;
                performance = 9.400;
                total = hard + performance;

            }else if(device.equals("hoop")){
                hard = 9.550;
                performance = 9.750;
                total = hard + performance;
            }else if(device.equals("rope")){
                hard = 9.500;
                performance = 9.400;
                total = hard + performance;
            }
        }else if(country.equals("Italy")){
            if(device.equals("ribbon")){
                hard = 9.200;
                performance = 9.500;
                total = hard + performance;

            }else if(device.equals("hoop")){
                hard = 9.450;
                performance = 9.350;
                total = hard + performance;
            }else if(device.equals("rope")){
                hard = 9.700;
                performance = 9.150;
                total = hard + performance;
            }
        }
        double max = 20 - total;
        double percent = (max / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.\n",country,total,device);
        System.out.printf("%.2f%%",percent);
    }
}
