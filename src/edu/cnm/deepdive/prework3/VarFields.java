package edu.cnm.deepdive.prework3;

public class VarFields {
 // Class Variables in Static fields
  /** static String cv = "by Class Static Fields";
  static private int chairqty =4;
  static private int tableqty = 1;
  static private int sidetableqty = 1;
  static private int trashqty = 1;
  static String gd = "Good Day";
  */

  //Prework 3 Fields
  
  public static void main(String[] args) {
    //Local Variables to method main
    String cv = "by method Local Variables ";
    int chairqty =4;
    int tableqty = 1;
    int sidetableqty = 1;
    int trashqty = 1;
    String gd = "Good Day";


    System.out.println ("Room Content " + cv);
    System.out.println("Chairs: " + chairqty);
    System.out.println("Tables: " + tableqty);
    System.out.println("Side Table: " + sidetableqty);
    System.out.println("Trash Cans: " + trashqty);
    System.out.println("All Done " + gd);

  }
}
