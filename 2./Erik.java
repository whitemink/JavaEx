import javax.swing.*;

public class Erik {
    public static void main (String [] arg) {
        String nameInp, b;
        nameInp = JOptionPane.showInputDialog("Namn och personnummer"," Ex. Erik Andersson 860314-2714 ");
        int i = nameInp.lastIndexOf(' ') + 1;
        int j = nameInp.indexOf('-');
        b = nameInp.substring(i+4, j) + '/' + nameInp.substring(i+2, j-2); // Går från orginal positionen av i 
        JOptionPane.showMessageDialog(null, b);


    }
    
}
