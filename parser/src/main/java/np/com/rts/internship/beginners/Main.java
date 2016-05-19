package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  private String parseThis = "20160519150000-STX,6-3.0-CONF4";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here
    String[] tokens = parseThis.split("-");
    String s =tokens[2];
    //System.out.println(s);
    Double d = Double.parseDouble(s);
    value=d;
  }


  public static void main(String[] args) {
    new Main();

  }

}