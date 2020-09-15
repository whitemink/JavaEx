import javax.swing.*;
import java.util.*;

public class Datum {
    public static void main (String[] arg) {
        JOptionPane.showMessageDialog(null, "Datum och tid:\n" +  
        Calendar.getInstance().getTime().toString());
    }
    
}
