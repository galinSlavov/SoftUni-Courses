package lecture2;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaxSumOfTwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split(", ")[0]);

        int [][] matrix = readMatrix(rows,scanner,", ");

        int maxSum = 0;
        int [][] maxMatrix = new int[2][2];

        //TODO reduced the loop interceptions by 1
        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {
                int current = matrix[r][c];
                int inRight = matrix[r][c+1];
                int inBottom = matrix[r + 1][c];
                int leftRight = matrix[r + 1][c + 1];

                int currentSum = current + inRight + inBottom + leftRight;
                if (maxSum < currentSum){
                    maxSum = currentSum;
                    maxMatrix = new int [][]{
                        {current,inRight},
                        {inBottom,leftRight}
                    };
                }
            }
        }
        printMatrix(maxMatrix);
        System.out.println(maxSum);
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

    public static void printMatrix(int[][]matrix){
        for(int [] arr : matrix){
            for(int c : arr){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }


}
