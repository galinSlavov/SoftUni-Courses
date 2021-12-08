package lecture5;

import java.util.Scanner;

public class P09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volumeHouse = width * length * height;

        int sum = 0;
        String  input = scanner.nextLine();
        while (!input.equals("Done")){
            int boxes = Integer.parseInt(input);

        sum += boxes;

        if (sum > volumeHouse){
            break;
        }

            input = scanner.nextLine();
        }

        int diff = Math.abs(sum - volumeHouse);
         if (sum > volumeHouse) {
             System.out.printf("No more free space! You need %d Cubic meters more.\n", diff);

         }else {
             System.out.printf("%d Cubic meters left.", diff);
         }
    }
}
