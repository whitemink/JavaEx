import javax.swing.*;

public class Datortid {
    public static void main (String[] arg) {
        String s = JOptionPane.showInputDialog("Tid (i sekunder)?");
        int tid = Integer.parseInt(s);
        int tim, min, sek;
        tim = tid / 3600;
        tid = tid % 3600;
        min = tid / 60;
        tid = tid % 60;
        sek = tid;
        JOptionPane.showMessageDialog(null, tim + ":" + min + ":" + sek);
      }
    
}
