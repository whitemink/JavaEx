import javax.swing.*;

public class TestAverage {
    public static void main(String[] args) {

     //int a = JOptionPane.showConfirmDialog(null,"Välkommen!"+
//
//"\nVill du räkna medelåldern?", "Fråga", JOptionPane.YES_NO_OPTION);

int option;
String userName;

int i=0; // create a counter
do {
    option = JOptionPane.showConfirmDialog(null,"Vill du lägga till ytterligare deltagare för analys?");
    i++; // increment the counter
} while (option == JOptionPane.YES_OPTION);
JOptionPane.showMessageDialog(null, "you have entered " + i + " names"); // use it
    





Object[] options = {"Man", "Kvinna", "Vill ej ange"};
        Object selectionObject = JOptionPane.showInputDialog(null, "Vänligen ange kön", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String a = selectionObject.toString();
        JOptionPane.showMessageDialog(null, a);
        
        
  }

  
}
