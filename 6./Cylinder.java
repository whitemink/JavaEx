import javax.swing.*;
import java.util.*; 

public class Cylinder {
    public static void main (String[] arg) {
      boolean done = false;
      while (!done) {
        String input = JOptionPane.showInputDialog("Ange cylinderns radie och höjd:");
        if (input == null)
           done = true;
        else {
          Scanner sc = new Scanner(input);
          double radius = sc.nextDouble();
          double height = sc.nextDouble();
          double area = 2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius, 2);
          double volume = Math.PI * Math.pow(radius, 2) * height;
          JOptionPane.showMessageDialog(null, "Arean av cylindern är "+ area
                 + "\nVolymen av cylindern är " + volume);
    
                }
 
            }
    
        } 
    }