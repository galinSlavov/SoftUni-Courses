package lecture04;

import java.util.Scanner;

public class E11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        double calculations = calculate(a,operator,b);

        System.out.printf("%.0f",calculations);
    }
    public static double calculate(int a, String operator, int b){
        double result = 0.0;
        if (operator.equals("/")){
            result = a / b;
        }else if (operator.equals("*")){
            result = a * b;
        }else if (operator.equals("+")){
            result = a + b;
        }else if (operator.equals("-")){
            result = a - b;
        }
        return result;
    }

}
