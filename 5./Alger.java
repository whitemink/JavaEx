import javax.swing.*;


public class Alger {
    public static void main (String[] arg) {
        double  totalArea = 10000;
        double  area = 0.01;
        int dygn = 1;
        while (area < totalArea) {
            area *=  2;
            dygn += 1;
        }
        JOptionPane.showMessageDialog(null,
        "Sjön blir täckt efter " + dygn + " dygn");

    }
    
}
