import javax.swing.*;

public class Sista {
    public static void main (String[] arg) {
        String userInput = JOptionPane.showInputDialog("Skriv en text", "Roses are red..");
        int i;
        for (i=userInput.length()-1; i>=0; i-=1)
        if (userInput.charAt(i) == ' ' || userInput.charAt(i) == '\t')
        break;
        if (i>= 0)
        JOptionPane.showMessageDialog(null, "Sista vita tecknet finns på plats nr " + i);
        else
        JOptionPane.showMessageDialog(null, "inga vita tecken finns i texten");
    
    }
    
}
