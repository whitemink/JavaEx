import javax.swing.*;

public class Os {
public static void main (String[] arg) {
    JOptionPane.showMessageDialog(null, "Du kör " +
     System.getProperty("os.name") + " idag");
}
}
