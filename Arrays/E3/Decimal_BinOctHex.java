package E3;
import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;
import java.lang.StringBuffer;
import java.lang.Character;
import java.lang.Long;

public class Decimal_BinOctHex {

  static public char decHex(int rem){
    if(rem == 10){
      return 'A';
    }else if(rem == 11){
      return 'B';
    }else if(rem == 12){
      return 'C';
    }else if(rem == 13){
      return 'D';
    }else if(rem == 14){
      return 'E';
    }else if(rem == 15){
      return 'F';
    }else{
      return '0';
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The decimal value must be greater than 0.");
    System.out.println("\nEnter a decimal value: ");
    int d = sc.nextInt();
    while(d < 1){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The decimal value must be greater than 0.");
      System.exit(0);
    }
    System.out.println("\nDecimal value: "+d);
    int dup=0;
    dup = d;
    int rem=0;
    String st="";
    while(dup > 0){
      rem = dup%2;
      st = st.concat(Integer.toString(rem));
      dup = dup/2;
    }
    StringBuffer sb = new StringBuffer(st);
    st = sb.reverse().toString();
    long b = Long.valueOf(st);
    System.out.println("\nBinary value: "+b);

    dup = d;
    rem = 0;
    st = "";
    while(dup > 0){
      rem = dup%8;
      st = st.concat(String.valueOf(rem));
      dup = dup/8;
    }
    sb = new StringBuffer(st);
    st = sb.reverse().toString();
    int o = Integer.valueOf(st);
    System.out.println("\nOctal value: "+o);

    dup = d;
    rem = 0;
    st = "";
    String st1="";
    while(dup > 0){
      rem = dup%16;
      if((rem >= 10) && (rem <=15)){
        st1 = Character.toString(decHex(rem));
        st = st.concat(st1);
      }else{
        st = st.concat(Integer.toString(rem));
      }
      dup = dup/16;
    }
    sb = new StringBuffer(st);
    st = sb.reverse().toString();
    System.out.println("\nHexadecimal value: "+st);
    sc.close();
  }
}