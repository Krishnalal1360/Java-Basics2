package E3;
import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Integer;
import java.lang.Math;

public class Octal_DecBinHex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a octal value: ");
    int o = sc.nextInt();
    System.out.println("\nOctal value: "+o);
    String st = Integer.toString(o);
    StringBuffer sb = new StringBuffer(st);
    st = sb.reverse().toString();
    char c='\u0000';
    int d=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      d = d+(int)(Integer.parseInt(Character.toString(c))*Math.pow(8, i));
    }
    System.out.println("\nDecimal value: "+d);

    int dup=d, rem=0;
    st="";
    while(dup > 0){
      rem = dup%2;
      st = st.concat(String.valueOf(rem));
      dup = dup/2;
    }
    sb = new StringBuffer(st);
    st = sb.reverse().toString();
    int b = Integer.valueOf(st);
    System.out.println("\nBinary value: "+b);

    dup=d;
    rem=0;
    st="";
    while(dup > 0){
      rem = dup%16;
      switch(rem){
        case 10: st = st.concat("A"); break;
        case 11: st = st.concat("B"); break;
        case 12: st = st.concat("C"); break;
        case 13: st = st.concat("D"); break;
        case 14: st = st.concat("E"); break;
        case 15: st = st.concat("F"); break;
        default: st = st.concat(String.valueOf(rem));
      }
      dup = dup/16;
    }
    sb = new StringBuffer(st);
    st = sb.reverse().toString();
    System.out.println("\nHexadecimal value: "+st);
    sc.close();
  }
}