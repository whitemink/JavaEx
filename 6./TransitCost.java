import javax.swing.*;

public class TransitCost {
    public static void main(String[] args) {
        int cost = 0;
        int ticket = 0;
        
        int choice = JOptionPane.showConfirmDialog(null, "Är du 20-65år?");

        if (choice == 1) {
         cost = 620;
         ticket = 25;
        }


        else if (choice == 0) {
         cost = 930;
         ticket = 37;
        }
         

        else {
            JOptionPane.showMessageDialog(null, "Beräkningen avbruten \nKöp en cykel!");
            System.exit(0);
        }

    String sRides = JOptionPane.showInputDialog(null, "Hur många gånger åker du med\nSL varje månad?");
    int intRides = Integer.parseInt(sRides);
    int newCost = ticket * intRides;
    JOptionPane.showMessageDialog(null, "Ditt månadspris för biljetter skulle vara " + newCost + "Kr");
    
    if ( newCost > cost )
    JOptionPane.showMessageDialog(null, "Månadskort är billigast");

    else
    JOptionPane.showMessageDialog(null, "Biljetter är billigast");





    }
    
}
