import java.util.Scanner;

import static java.lang.Math.random;

public class MassiveSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 15, s;
        //Making a massive
        int[] nums = new int[n];
        System.out.println("Output array:");
        //Filling in massive and showing values of elements
        for (int k = 0; k < nums.length; k++) {
            //Values of elements - random numbers
            nums[k] = (int) (5 * n * random());
            System.out.print(nums[k] + " ");
        }
            //Array sorting
            for (int m = 1; m < nums.length; m++) {
                for (int k = 0; k < nums.length - m; k++)
                    if (nums[k] > nums[k + 1]) {
                        //Changing values of elements
                        s = nums[k];
                        nums[k] = nums[k + 1];
                        nums[k + 1] = s;
                    }
            }
        //Showing the result
        System.out.println("\nMassive after sorting:");
        for (int k = 0; k <nums.length ; k++) {
            System.out.print(nums[k] + " ");
        }
        //Switching to a new line
        System.out.println();
    }
}
