import javax.swing.*;

public class Mening {
    public static void main (String[] arg) {
        String inData = JOptionPane.showInputDialog("Skriv en dikt", "test");
        int l = inData.length();
        int x1 = inData.indexOf(' ');
        int x2 = inData.lastIndexOf(' ');
        JOptionPane.showMessageDialog(null, 
        "Du skrev en text med " + l + " tecken" +
        "\nDet första ordet var \"" + inData.substring(0, x1) + '"' +
        "\nDet sista ordet var \""  + inData.substring(x2+1) + '"');

    }
    
}
