package lecture5;

import java.util.Scanner;

public class E01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String searchBook = scanner.nextLine();
        String currentBook = scanner.nextLine();

        int bookCounter = 0;
        boolean isFound = false;
        while(!currentBook.equals("No More Books")){

            if(searchBook.equals(currentBook)){
                System.out.printf("You checked %d books and found it.",bookCounter);
                isFound = true;
                break;
            }
            bookCounter++;

            currentBook = scanner.nextLine();

        }
        if(!isFound){
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.\n",bookCounter);
        }

    }
}
