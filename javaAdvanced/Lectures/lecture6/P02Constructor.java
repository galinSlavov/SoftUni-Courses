package lecture6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02Constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<P01Car> cars = new ArrayList<>();

        while (n-- > 0){
            String[] tokens = scanner.nextLine().split("\\s+");

            P01Car car;
            if (tokens.length == 1){
                car = new P01Car(tokens[0]);
            }else {
                car = new P01Car(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
            }
            cars.add(car);

        }
        for (P01Car car : cars){
            System.out.println(car.toString());
        }
    }
}
