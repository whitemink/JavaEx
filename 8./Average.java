import javax.swing.*;

public class Average {
    // amount men
    static int a1 = 0;
    // amount females
    static int a2 = 0;
    // no answer
    static int a3 = 0;

    // total male age
    static int g1 = 0;

    // total female age
    static int g2 = 0;

    static int genSum = 0 + a1 + a2;

    static void addPerson() {
        // Med drop-down meny, minimerar vi utrymme för användare anger fel värde

        Object[] options = { "Man", "Kvinna", "Vill ej ange" };
        Object selectionObject = JOptionPane.showInputDialog(null, "Vänligen ange kön", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        String gender = selectionObject.toString();

        if (gender == "Man") {
            addMale();
        } else if (gender == "Kvinna") {
            addFemale();
        } else if (gender == "Vill ej ange") {
            JOptionPane.showMessageDialog(null, "Du behöver tyvärr ange ditt kön för att detta program ska fungera");
            addNoGen();
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

    static void addNoGen() {

        // usr vill inte ange.
        JOptionPane.showMessageDialog(null, "Ok, du är en man, hur gammal är du?");
        a3 = a3 + 1;
    }

    public static void main(String[] arg) {

        int addMore;

        JOptionPane.showMessageDialog(null,
                "Välkommen, \nDetta program redogör och analyserar demografisk data av utvalda målgrupper");

        do {

            addPerson();

            JOptionPane.showMessageDialog(null, "Du har lagt till " + genSum + "st deltagare."); // genSum fungerar ej..
                                                                                                 // varför?

            addMore = JOptionPane.showConfirmDialog(null, "Vill du lägga till ytterligare deltagare för analys?",
                    "Message", JOptionPane.YES_NO_OPTION);
            if (addMore == 0) {
                JOptionPane.showMessageDialog(null, addMore);
                System.out.println("Antal män " + a1);
                System.out.println("Antal kvinnor " + a2);
                System.out.println("Total ålder män " + g1);
                System.out.println("Total ålder kvinnor " + g2);
                System.out.println(a3 + "st ville inte ange kön, Deras ålder kommer inte att räknas med");
            } else
                JOptionPane.showConfirmDialog(null, "Är du säker?", "WARNING", JOptionPane.YES_NO_OPTION);
            {
                System.exit(0);

            }

        } while (addMore == 0);
        /*
         * if (addMore == 1) { // ska till utträkning }
         * 
         * 
         * else if (addMore == 0) { addPerson(); }
         * 
         * 
         * else { if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
         * JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { System.exit(0); }
         * else { addPerson(); }
         */

    }
}
