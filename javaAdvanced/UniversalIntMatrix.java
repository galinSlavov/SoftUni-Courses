import java.util.Arrays;
import java.util.Scanner;

public class UniversalIntMatrix {
    Scanner scanner = new Scanner(System.in);

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
    public static void printMatrix2(int [][] matrix, int rows, int cols){
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    //fill matrix
    private static void fillMatrix(Scanner scanner, int[][] matrix, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
    public static void fillMatrixType1(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
    }

    public static boolean isInBounds(int row, int col, int[][] matrix){
        return row < matrix.length && row >= 0
                && col < matrix[row].length && col >=0;
    }
    public static boolean isOutOfBounds(int row, int col, int[][] matrix){
         return !isInBounds(row,col,matrix);
    }
}
