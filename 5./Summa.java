import javax.swing.*;

public class Summa {
    public static void main (String[] arg) {
        String s = JOptionPane.showInputDialog("n?", "T.ex: 8");
        int n = Integer.parseInt(s);
        int summa, k;
        for (k=1, summa=0; k <= n; k+=1);
        summa += k;
        JOptionPane.showMessageDialog(null, "Summa blir " + summa);




    }
    
}
