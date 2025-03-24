package E3;
import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;
import java.lang.Math;
import java.lang.Character;
import java.lang.Integer;

public class Binary_DecOctHex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a binary value: ");
    long b = sc.nextLong();
    System.out.println("\nBinary value: "+b);
    String st = String.valueOf(b);
    StringBuffer sb = new StringBuffer(st);
    st = sb.reverse().toString();
    char c='\u0000';
    int d=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      d = d+(int)(Integer.valueOf(Character.toString(c))*Math.pow(2, i));
    }
    System.out.println("\nDecimal value: "+d);

    int dup=0, rem=0;
    dup = d;
    st="";
    while(dup > 0){
      rem = dup%8;
      st = st.concat(Integer.toString(rem));
      dup = dup/8;
    }
    sb = new StringBuffer(st);
    st = sb.reverse().toString();
    int o =  Integer.valueOf(st);
    System.out.println("\nOctal value: "+o);

    dup = d;
    rem = 0;
    st = "";  
    while(dup > 0){
      rem = dup%16;
      if((rem >= 10) && (rem <= 15)){
        if(rem == 10){
          st = st.concat("A");
        }else if(rem == 11){
          st = st.concat("B");
        }else if(rem == 12){
          st = st.concat("C");
        }else if(rem == 13){
          st = st.concat("D");
        }else if(rem == 14){
          st = st.concat("E");
        }else if(rem == 15){
          st = st.concat("F");
        }
      }else{
        st = st.concat(String.valueOf(rem));
      }
      dup = dup/16;
    }
    sb = new StringBuffer(st);
    st = sb.reverse().toString();
    System.out.println("\nHexadecimal value: "+st);
    sc.close();
  }
}