package lecture2;

import java.util.Scanner;

public class PB04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kmCount = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
        //Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.

        double dayPrice = 0;
        double nightPrice = 0;
        if (kmCount < 20) {

            if (time.equals("day")) {
                dayPrice = 0.70 + (kmCount * 0.79);
                System.out.printf("%.2f",dayPrice);
            } else if (time.equals("night")) {

                nightPrice = 0.70 + (kmCount * 0.90);
                System.out.printf("%.2f",nightPrice);
            }
        } else if (kmCount >= 20 && kmCount < 100) {

            if (time.equals("day") || time.equals("night")) {
                dayPrice = kmCount * 0.09;
                System.out.printf("%.2f",dayPrice);
            }

        } else if (kmCount >= 100) {
            if (time.equals("day") || time.equals("night")) {
                dayPrice = kmCount * 0.06;
                System.out.printf("%.2f",dayPrice);

            }

        }

    }
}
