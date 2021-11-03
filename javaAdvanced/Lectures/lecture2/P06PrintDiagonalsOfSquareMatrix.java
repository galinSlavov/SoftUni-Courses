package lecture2;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int [][] matrix = readMatrix(size,scanner,"\\s+");

        // 4 5 6
        // 9 6 7
        // 8 4 1


        int row = 0, col =0;
        //намираме диагонала от най-горен първи ляв към най-долния последен в дясно( 4 6 1)
        while (row < size && col < size){
            int current = matrix[row][col];
            System.out.print(current + " ");
            row++;
            col++;
        }
        System.out.println();
       //намираме диагонала от най-долния първи ляв към най- горния последен в дясно ( 8 6 6)
        row = size - 1;
        col = 0;
        while (row >= 0 && col < size){
            int current = matrix[row][col];
            System.out.print(current + " ");
            row --;
            col++;
        }
    }

    public static int[][] readMatrix(int rows, Scanner scanner, String splitPattern){
        int [][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                    .split(splitPattern))
                    .mapToInt(Integer ::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
