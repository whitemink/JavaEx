import javax.swing.*;
import java.util.*;

public class Zone {
    public static void main (String[] arg) {
        String a = Calendar.getInstance().getTime().toString();
        int i = a.indexOf(':');
        JOptionPane.showMessageDialog(null, "Klockan är: " + a.substring(i-2, i+6));
    }
    
}
