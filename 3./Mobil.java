import javax.swing.*;

public class Mobil {
    public static void main (String[] arg) {
        
         String s = JOptionPane.showInputDialog("Hur mycket ringer du?", 
        "Svara i antal minuter per månad");
        int min = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Pris per minuter", "Ex. 12");
        double minutpris = Double.parseDouble(s);
        double kostnad = min * minutpris;
        if (kostnad >= 1000) {
        double rabatt = kostnad * 0.10;
        double newCost = kostnad - rabatt;
        JOptionPane.showMessageDialog(null, "Månadskostnad: " + newCost + "Kr" + "\n Du fick: "
         + rabatt + "Kr rabatt!");
        }
         else {
         JOptionPane.showMessageDialog(null, "Månadskostnad: " + kostnad + "Kr" + 
         "\n Du fick ingen rabatt!");
         }
    }
    
}
