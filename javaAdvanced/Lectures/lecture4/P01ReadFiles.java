package lecture4;

import java.io.FileInputStream;
import java.io.IOException;

public class P01ReadFiles {
    public static void main(String[] args) throws IOException {


        //get data from file
        String path = "C:\\Users\\BOSS\\Desktop\\java-Advanced\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int value = inputStream.read();

        while (value != -1){
            System.out.print(Integer.toBinaryString(value) + " ");
            value = inputStream.read();


//        try {
//            FileInputStream inputStream = new FileInputStream(path);
//
//            int value = inputStream.read();
//
//            while (value != -1) {
//                System.out.print((char) value);
//                value = inputStream.read();
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//
//        }finally {
//            //Винаги изпълнява блока от код независимо дали try and catch  са гръмнали
//
        }
    }
}
