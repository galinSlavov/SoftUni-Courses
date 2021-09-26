package exercise01;

import java.util.Scanner;

public class E05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String username = scanner.nextLine();

       String password = "";
        for (int position = username.length() - 1; position >= 0 ; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }

        int failedPassed = 0;
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)){
            failedPassed++;
            if (failedPassed > 3){
                System.out.printf("User %s blocked!",username);
                 return;
            }

            System.out.println("Incorrect password. Try again.");

            enteredPassword = scanner.nextLine();

        }
        System.out.printf("User %s logged in.",username);
    }
}
