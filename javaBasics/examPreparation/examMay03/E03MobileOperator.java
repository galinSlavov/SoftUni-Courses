package ExamPrep.may03;

import java.util.Scanner;

public class E03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Срок на договор – текст – "one", или "two"
        //2.	Тип на договор – текст – "Small",  "Middle", "Large"или "ExtraLarge"
        //3.	Добавен мобилен интернет – текст – "yes" или "no"
        //4.	Брой месеци за плащане - цяло число в интервала [1 … 24]

        String contractYears = scanner.nextLine();
        String contractType = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int countMonthsForPay = Integer.parseInt(scanner.nextLine());

        double contractPrice = 0;
        double contractWithDisc = 0;
         switch (contractType){
             case "Small":
                 if (contractYears.equals("one")){
                     if (mobileInternet.equals("yes")){
                         contractPrice = 9.98 + 5.50;
                         System.out.printf("%.2f lv.",contractPrice * countMonthsForPay);
                     }else if (mobileInternet.equals("no")){
                         contractPrice = 9.98;
                         System.out.printf("%.2f lv.",contractPrice * countMonthsForPay);
                     }
                 }else if (contractYears.equals("two")){
                     if (mobileInternet.equals("yes")){
                         contractPrice = 8.58 + 5.50;
                         contractWithDisc = contractPrice * 0.9625;
                         System.out.printf("%.2f lv.",contractWithDisc * countMonthsForPay);
                     }else if (mobileInternet.equals("no")){
                         contractPrice = 8.58;
                         contractWithDisc = contractPrice * 0.9625;
                         System.out.printf("%.2f lv.",contractWithDisc * countMonthsForPay);
                     }
                 }
                 break;
             case "Middle":
                 if (contractYears.equals("one")){
                     if (mobileInternet.equals("yes")){
                         contractPrice = 18.99 + 4.35;
                         System.out.printf("%.2f lv.",contractPrice * countMonthsForPay);
                     }else if (mobileInternet.equals("no")){
                         contractPrice = 18.99;
                         System.out.printf("%.2f lv.",contractPrice * countMonthsForPay);
                     }
                 }else if (contractYears.equals("two")){
                     if (mobileInternet.equals("yes")){
                         contractPrice = 17.09 + 4.35;
                         contractWithDisc = contractPrice * 0.9625;
                         System.out.printf("%.2f lv.",contractWithDisc * countMonthsForPay);

                     }else if (mobileInternet.equals("no")){
                         contractPrice = 17.09;
                         contractWithDisc = contractPrice * 0.9625;
                         System.out.printf("%.2f lv.",contractWithDisc * countMonthsForPay);
                     }
                 }
                 break;
             case "Large":
                 if (contractYears.equals("one")){
                     if (mobileInternet.equals("yes")){
                         contractPrice = 25.98 + 4.35;
                         System.out.printf("%.2f lv.",contractPrice * countMonthsForPay);
                     }else if (mobileInternet.equals("no")){
                         contractPrice = 25.98;
                         System.out.printf("%.2f lv.",contractPrice * countMonthsForPay);
                     }
                 }else if (contractYears.equals("two")){
                     if (mobileInternet.equals("yes")){
                         contractPrice = 23.59 + 4.35;
                         contractWithDisc = contractPrice * 0.9625;
                         System.out.printf("%.2f lv.",contractWithDisc * countMonthsForPay);

                     }else if (mobileInternet.equals("no")){
                         contractPrice = 23.59;
                         contractWithDisc = contractPrice * 0.9625;
                         System.out.printf("%.2f lv.",contractWithDisc * countMonthsForPay);
                     }
                 }
                 break;
             case "ExtraLarge":
                 if (contractYears.equals("one")){
                     if (mobileInternet.equals("yes")){
                         contractPrice = 35.99 + 3.85;
                         System.out.printf("%.2f lv.",contractPrice * countMonthsForPay);
                     }else if (mobileInternet.equals("no")){
                         contractPrice = 35.99;
                         System.out.printf("%.2f lv.",contractPrice * countMonthsForPay);
                     }
                 }else if (contractYears.equals("two")){
                     if (mobileInternet.equals("yes")){
                         contractPrice = 31.79 + 3.85;
                         contractWithDisc = contractPrice * 0.9625;
                         System.out.printf("%.2f lv.",contractWithDisc * countMonthsForPay);

                     }else if (mobileInternet.equals("no")){
                         contractPrice = 31.79;
                         contractWithDisc = contractPrice * 0.9625;
                         System.out.printf("%.2f lv.",contractWithDisc * countMonthsForPay);
                     }
                 }
                 break;
         }
    }
}
