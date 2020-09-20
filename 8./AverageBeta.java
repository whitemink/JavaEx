import javax.swing.*;

public class AverageBeta {
    // Antal män
    static int a1 = 0;
    // Antal kvinnor
    static int a2 = 0;

    // sammanlagda ålder för män
    static int g1 = 0;

    // sammanlagda ålder för kvinnor
    static int g2 = 0;

    public static String averageMale() {
        if (a1 == 0) {
            return "0";
        } else {
            Integer avgMale = g1 / a1;
            return avgMale.toString();
        }

    }

    public static String averageFemale() {
        if (a2 == 0) {
            return "0";
        } else {
            Integer avgFemale = g2 / a2;
            return avgFemale.toString();
        }
    }

    public static int totalParticipants() {
        return a1 + a2;
    }

    static void addPerson() {

        Object[] options = { "Man", "Kvinna", "Vill ej ange" };
        Object selectionObject = JOptionPane.showInputDialog(null, "Vänligen ange kön", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if (selectionObject == null) {
            int userConf = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill avbryta?");
            if (userConf == 0) {
                JOptionPane.showMessageDialog(null, "Stänger av");
                System.exit(0);
            }

        } else {
            String gender = selectionObject.toString();

            if ("Man".equals(gender)) {
                addMale();
            } else if ("Kvinna".equals(gender)) {
                addFemale();
            } else if ("Vill ej ange".equals(gender)) {
                addNoGen();

            }

        }

    }

    static void addFemale() {
        // då är vi

        String tempAge = JOptionPane.showInputDialog(null, "Vilken ålder är kvinnan?");
        try {
            Integer.parseInt(tempAge);
            int age = Integer.parseInt(tempAge);
            g2 = g2 + age;
            a2 = a2 + 1;

        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Vänligen ange bara siffror");

        }

    }

    static void addMale() {
        String tempAge = JOptionPane.showInputDialog(null, "Vilken ålder är mannen?");
        try {
            Integer.parseInt(tempAge);
            int age = Integer.parseInt(tempAge);
            g1 = g1 + age;
            a1 = a1 + 1;

        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Vänligen ange bara siffror");

        }

    }

    static void addNoGen() {

        // usr vill inte ange.
        JOptionPane.showMessageDialog(null, "Du behöver tyvärr ange ditt kön för att detta program ska fungera");

    }

    public static void main(String[] arg) {

        int addMore;

        JOptionPane.showMessageDialog(null,
                "Välkommen, \nI detta program kommer vi räkna ut medelåldern på angivna kvinnor och män");

        do {

            addPerson();

            addMore = JOptionPane.showConfirmDialog(null,
                    "Du har lagt till " + totalParticipants() + "st deltagare"
                            + "\nVill du lägga till ytterligare deltagare för analys?",
                    "Message", JOptionPane.YES_NO_OPTION);

            if (addMore == 1) {
                // Här ska slutresultat vara

                JOptionPane.showMessageDialog(null, "Medelåldern för kvinnor är:  " + averageFemale() + "\n"
                        + "Medelåldern för män är: " + averageMale());
                System.exit(0);
            }
        } while (addMore == 0);

    }
}
