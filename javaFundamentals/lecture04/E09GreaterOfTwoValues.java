package lecture04;

import java.util.Scanner;

public class E09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
       int input = Integer.parseInt(scanner.nextLine());
       int input2 = Integer.parseInt(scanner.nextLine());



       if (text.equals("char")){
           System.out.println(getMax(input,input2));
       }else if (text.equals("int")){
           System.out.println(getMax(input,input2));
       }else if (text.equals("string")){
           System.out.println(getMax(input,input2));
       }

    }
    public static int getMax(int firstNum, int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }
    public static char getMax(char first, char second){
        if (first > second){
            return first;
        }
        return second;
    }
    public static String getMax(String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }
}
