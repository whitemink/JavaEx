import javax.swing.*;

public class DobBeta {
    public static void main (String [] args) {
        String nameAgeInp, stringYear, stringMonth;
        int iYear, iMonth;
        nameAgeInp = JOptionPane.showInputDialog("Namn och personnummer"," Ex. Erik Andersson YYYY-MM-DD ");
        nameAgeInp = nameAgeInp.trim();
        // YYYY
        //int yStart = nameAgeInp.lastIndexOf(' ') +1;
       // int yEnd = nameAgeInp.indexOf('-');
        //stringYear = nameAgeInp.substring(yStart, yEnd);
       // iYear = Integer.parseInt(stringYear);
        // MM
        int mStart = nameAgeInp.lastIndexOf(' '+1);
        int mEnd = nameAgeInp.indexOf('-');
        stringMonth = nameAgeInp.substring(mStart, mEnd);
        //iMonth = Integer.parseInt(stringMonth);

        JOptionPane.showMessageDialog(null, stringMonth);


    }
    
}
