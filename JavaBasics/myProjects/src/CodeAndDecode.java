import java.util.Scanner;

public class CodeAndDecode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Text for coding:");
        //Read text
        String text = scanner.nextLine();
        //Make text into symbol massive
        char[] symbs = text.toCharArray();
        //Coding symbols
        for (int k = 0; k < symbs.length; k++) {
            symbs[k] = (char) (symbs[k] + k + 1);
        }
        //Making text basis to massive
        text = new String(symbs);
        System.out.println("After coding:");
        //The encoded text
        System.out.println(text);
        //Making massive into basis of coding text
        symbs = text.toCharArray();
        //Decoding symbols
        for (int k = 0; k <symbs.length ; k++) {
            symbs [k] =(char) (symbs[k]-k-1);
        }
        //Making text into basis of massive
        text = new String(symbs);
        System.out.println("After decoding:");
        //Decoding text
        System.out.println(text);
    }
}
