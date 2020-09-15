


import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;



public class DobConversion {
 public static void main(String[] args) {
  String nameInp = JOptionPane.showInputDialog("När föddes du?", "YYYY MM DD");
  Integer.parseInt(nameInp);
  JOptionPane.showMessageDialog(null, nameInp);

  //LocalDate l = LocalDate.of(nameInp); //specify year, month, date directly
  //LocalDate now = LocalDate.now(); //gets localDate
  //Period diff = Period.between(l, now); //difference between the dates is calculated
  //System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");

 }
}