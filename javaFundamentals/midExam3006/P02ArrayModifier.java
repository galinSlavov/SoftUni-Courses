package midExam3006;

import java.util.Scanner;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineNumbers = scanner.nextLine();
        int[] array = parseArray(lineNumbers);

        String line = scanner.nextLine();
        while (!line.equals("end")){
            String[] commandAndParameters = line.split(" ");
            switch (commandAndParameters[0]){
                case "swap":
                    swap(array,Integer.parseInt(commandAndParameters[1]), Integer.parseInt(commandAndParameters[2]));
                    break;
                case "multiply":
                    multiply(array,Integer.parseInt(commandAndParameters[1]), Integer.parseInt(commandAndParameters[2]));
                    break;
                case "decrease":
                    decrease(array);
                    break;
            }
        }

        printArray(", ", array);
    }

    private static void decrease(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]--;
        }
    }

    private static void multiply(int[] array, int indexA, int indexB) {
        array[indexA] = array[indexA] * array[indexB];
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int oldA = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = oldA;
    }

    private static void printArray(String separator, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();

    }

    private static int[] parseArray(String numbersString) {
        String[] numbersAsString = numbersString.split(" ");
        int[] array = new int[numbersAsString.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbersAsString[i]);
        }

        return array;
    }
}
