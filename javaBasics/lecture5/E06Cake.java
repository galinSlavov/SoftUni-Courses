package lecture5;

import java.util.Scanner;

public class E06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int allPeaces = lenght * width;
        String input = scanner.nextLine();
        boolean isFinished = false;
        while (!input.equals("STOP")) {
            int currentPeaces = Integer.parseInt(input);
            allPeaces -= currentPeaces;
            if (allPeaces <= 0) {
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }
        if(isFinished){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allPeaces));
        }else {
            System.out.printf("%d pieces are left.", allPeaces);
        }
    }
}
