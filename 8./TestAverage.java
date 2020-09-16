import javax.swing.*;

public class TestAverage {
    public static void main(String[] args) {

     //int a = JOptionPane.showConfirmDialog(null,"Välkommen!"+
//
//"\nVill du räkna medelåldern?", "Fråga", JOptionPane.YES_NO_OPTION);





Object[] options = {"Man", "Kvinna", "Vill ej ange"};
        Object selectionObject = JOptionPane.showInputDialog(null, "Vänligen ange kön", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String a = selectionObject.toString();
        JOptionPane.showMessageDialog(null, a);
        
        
  }
}