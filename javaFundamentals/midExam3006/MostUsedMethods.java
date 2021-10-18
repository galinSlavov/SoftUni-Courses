package midExam3006;

import java.util.Scanner;

public class MostUsedMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Създава текста в масив от символи
        String text = "Anastasiq";
        String text2 = "Galin";
        char [] symbols = text.toCharArray();
        System.out.println();
        System.out.println(text.length()); // дава ни дължината на текста(Число)
        System.out.println(text.replace('e', 'r'));// заменя буквата или символа с другия зададен
        System.out.println(text.equals(""));// сравнява текст, има значение от буквите, малки или големи
        System.out.println(text.equalsIgnoreCase(""));// Сравнява текст без значение от малки, големи букви
        System.out.println(text.trim());// отрязва празните места в текста
        System.out.println(text.split(" "));//отделя текста по зададен символ в скобите
        System.out.println(text.compareTo(text2));//сравнява стойностите на двата текста(числови)


    }
}
