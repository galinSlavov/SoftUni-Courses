package exercise04;
import java.util.Scanner;
public class E01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(number1, number2, number3);
    }
    public static void printSmallestNumber(int number1, int number2, int number3) {
            //dali first is smallest
        if (number1 <= number2 && number1 <= number3) {
            System.out.println(number1);
            //dali second is smallest
        } else if (number2 <= number1 && number2 <= number3) {
            System.out.println(number2);
            //dali third is smallest
        } else {
            System.out.println(number3);
        }
    }
    //public, static, тип на метода(void или тип данни), име, параметри
    //public static тип ->void име ->printNumber(int number, int number1 -> parameter)
}
