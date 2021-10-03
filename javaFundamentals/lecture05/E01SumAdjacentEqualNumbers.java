package lecture05;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на входа
        List<Double> numberList = new ArrayList<>();
        String[] userInput = scanner.nextLine().split(" ");

        for (String stingNumber : userInput) {
            numberList.add(Double.parseDouble(stingNumber));
        }
        //Прочитане на входа по различен начин
//        List<Double> numbersList = Arrays.stream(userInput)
//                .map(Double::parseDouble)
//                .collect(Collectors.toList());
        for (int i = 0; i < numberList.size() - 1; i++) {
            if (numberList.get(i).equals(numberList.get(i + 1))) {
                double sum = numberList.get(i) + numberList.get(i + 1);
                numberList.set(i, sum);
                numberList.remove(i + 1);
                i = -1;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number : numberList){
            System.out.print(decimalFormat.format(number)+ " ");
        }
    }
}
