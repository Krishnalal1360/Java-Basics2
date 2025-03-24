import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.lang.StringBuffer;

public class P10{

  static public char newChar(char c){
    int a = (int)(c);
    a = a+2;
    if(a == 89){
      a = 65;
    }
    if(a == 90){
      a = 66;
    }
    c = (char)(a);
    return c;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a string: ");
    String st = sc.nextLine();
    System.out.println("\nString: \n"+st);
    st = st.toUpperCase();
    System.out.println("\nString in UpperCase: \n"+st);
    st = st.concat(" ");
    char c='\u0000';
    StringBuffer sb = new StringBuffer(st);
    for(int i=0;i<sb.length();i++){
      c = sb.charAt(i);
      if(Character.isLetter(c) == true){
        c = newChar(c);
        sb.setCharAt(i, c);
      }else{
        continue;
      }
    }
    st = sb.toString();
    System.out.println("\nNew String after replacing each letter with second next character: \n"+st);
    sc.close();
  }
}