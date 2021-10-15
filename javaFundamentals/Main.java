import javax.swing.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.random;
import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {

        int num,ans,icon;
        String txt;

        num =(int) (5*random()) + 1;
        ans = parseInt(showInputDialog(null,"Познай числото (от 1 до 5):",
                "Число", JOptionPane.QUESTION_MESSAGE));
        if (ans==num){
            txt = "Познахте това е числото "+num+"!";
            icon = INFORMATION_MESSAGE;
        }else {
            txt = "Не познахте! Това е числото "+num+"!";
            icon = ERROR_MESSAGE;
        }
        showMessageDialog(null,txt,"Резултат",icon);
    }
}

