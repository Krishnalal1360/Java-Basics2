import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.lang.StringBuffer;

public class P17{

  static public void mixedCase(String st){
    int uc=0, lc=0;
    char c='\u0000';

    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLetter(c)){
        if(Character.isUpperCase(c)){
          uc = uc+1;
        }
        if(Character.isLowerCase(c)){
          lc = lc+1;
        }
      }
    }

    if((uc == 0) || (lc == 0)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

  }

  static public void newString(String st){
    char c='\u0000';
    int a=0;
    StringBuffer sb = new StringBuffer(st);

    for(int i=0;i<sb.length();i++){
      c = sb.charAt(i);
      if(Character.isLetter(c)){
        if(Character.isUpperCase(c)){
          a = (int)(c);
          a = a+2;
          if(a == 91){
            a = 65;
          }
          if(a == 92){
            a = 66;
          }
          c = (char)(a);
          sb.setCharAt(i, c);
        }
        if(Character.isLowerCase(c)){
          a = (int)(c);
          a = a+2;
          if(a == 123){
            a = 97;
          }
          if(a == 124){
            a = 98;
          }
          c = (char)(a);
          sb.setCharAt(i, c);
        }
      }
    }

    st = sb.toString();

    System.out.println("\nNew String: \n"+st);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: String must contain mixed case letters.");
    System.out.println("\nEnter a string: ");
    String st = sc.nextLine();

    mixedCase(st);

    System.out.println("\nString: \n"+st);

    newString(st);
    
    sc.close();
  }
}