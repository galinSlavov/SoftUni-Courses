package finalExam1406;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E202FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "@#+(?<productName>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
        String barcode = scanner.nextLine();
        // proverka dali e validen
            Matcher matcher = pattern.matcher(barcode);
            //validen -> tyrsim produktowata grupa -> pechatame
            //nevaliden -> pechatame
          if (matcher.find()){
              //validen
              String productName = matcher.group("productName");
              StringBuilder productNumber = new StringBuilder(); // vsichki cifri ot imeto na producta
              for (int index = 0; index < productName.length(); index++) {
                  char currentSymbol = productName.charAt(index);

                  if (Character.isDigit(currentSymbol)){
                      productNumber.append(currentSymbol);
                  }
              }
              if (productNumber.toString().equals("")){
                  System.out.println("Product group: 00");
              }else {
                  System.out.printf("Product group: %s%n",productNumber);
              }
          }else{
              //nevaliden
              System.out.println("Invalid barcode");
          }

        }
    }
}
