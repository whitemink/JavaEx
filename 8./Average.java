import javax.swing.*;

public class Average {
    // amount men
    static int a1 = 0;
    // amount females
    static int a2 = 0;

    // total male age
    static int g1 = 0;

    // total female age
    static int g2 = 0;

    static void addPerson() {
        Object[] options = {"Man", "Kvinna", "Vill ej ange"};
        Object selectionObject = JOptionPane.showInputDialog(null, "Vänligen ange kön", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String gender = selectionObject.toString();
        //int choice = JOptionPane.showConfirmDialog(null, "Är du kvinna?");
        if (gender == "Man") {
            addMale();
        } else if (gender == "Kvinna") {
            addFemale();
        } else if (gender == "Vill ej ange") {
            JOptionPane.showMessageDialog(null, "Du behöver tyvärr ange ditt kön för att detta program ska fungera");
            
        }
    }

    static void addFemale() {
        // då är vi kvinna
        a2 = a2 + 1;
        String tempAge = JOptionPane.showInputDialog(null, "Ok, du är en kvinna, hur gammal är du?");
        int age = Integer.parseInt(tempAge);
        g2 = g2 + age;
    }

    static void addMale() {
         a1 = a1 + 1;
        // då är vi man, detta är ett test
        String tempAge = JOptionPane.showInputDialog(null, "Ok, du är en man, hur gammal är du?");
        int age = Integer.parseInt(tempAge);
        g1 = g1 + age;
    }
  public static void main(String[] arg) {
      addPerson();
      addPerson();
      addPerson();
      addPerson();
    
      System.out.println("Antal män " + a1);
      System.out.println("Antal kvinnor " + a2);
      System.out.println("Total ålder män " + g1);
      System.out.println("Total ålder kvinnor " + g2);
  }
}
