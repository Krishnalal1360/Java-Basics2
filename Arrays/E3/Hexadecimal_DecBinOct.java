package E3;
import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Math;
import java.lang.Character;
import java.lang.Integer;

public class Hexadecimal_DecBinOct {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a hexadecimal value: ");
    String h = sc.next();
    System.out.println("\nHexadecimal value: "+h);
    StringBuffer sb = new StringBuffer(h);
    h = sb.reverse().toString();
    char c='\u0000';
    int d=0;
    for(int i=0;i<h.length();i++){
      c = h.charAt(i);
      switch(c){
        case 'A': d = d+(int)(10*Math.pow(16, i)); break;
        case 'B': d = d+(int)(11*Math.pow(16, i)); break;
        case 'C': d = d+(int)(12*Math.pow(16, i)); break;
        case 'D': d = d+(int)(13*Math.pow(16, i)); break;
        case 'E': d = d+(int)(14*Math.pow(16, i)); break;
        case 'F': d = d+(int)(15*Math.pow(16, i)); break;
        default: 
        d = d+(int)(Integer.parseInt(Character.toString(c))*Math.pow(16, i));
      }
    }
    System.out.println("\nDecimal value: "+d);

    int dup=0, rem=0;
    dup=d;
    String st="";
    while(dup > 0){
      rem = dup%2;
      st = st.concat(String.valueOf(rem));
      dup = dup/2;
    }
    sb = new StringBuffer(st);
    st = sb.reverse().toString();
    long b = Integer.valueOf(st);
    System.out.println("\nBinary value: "+b);

    dup=d;
    rem=0;
    st="";
    while(dup > 0){
      rem = dup%8;
      st = st.concat(Integer.toString(rem));
      dup = dup/8;
    }
    sb = new StringBuffer(st);
    st = sb.reverse().toString();
    int o = Integer.valueOf(st);
    System.out.println("\nOctal value: "+o);
    sc.close();
  }
}