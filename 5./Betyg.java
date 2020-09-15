import javax.swing.*;

public class Betyg {
    public static void main (String[] args) {
        String s = JOptionPane.showInputDialog("Hur många poäng fick du på provet?", "0-100");
        int points = Integer.parseInt(s);
        char betyg;

        if (points >= 90)
         betyg = 'A';

        else if (points >= 75)
         betyg = 'B';

        else if (points >= 65)
         betyg = 'c';

        else if (points >= 55)
         betyg = 'D';

        else 
         betyg = 'F';

        JOptionPane.showMessageDialog(null, betyg);


    }
    
}
