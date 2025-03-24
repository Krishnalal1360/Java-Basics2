import java.util.Scanner;
import java.lang.Character;
import java.lang.String;

public class RoundRobin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Enter a word.");
    System.out.println("The word does not contain any punctuation.");
    String st = sc.nextLine();
    char c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLetter(c) == true){
        continue;
      }else{
      System.out.println("\nInvalid Input!");
        System.exit(0);
      }
    }

    c='\u0000';
    int a=0;
    String st1="";
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isUpperCase(c) == true){
        a = (int)(c+1);
        a = a+32;
        if(a > 122){
          a = 97;
        }
        c = (char)(a);
        st1 = st1.concat(String.valueOf(c));
      }else{
        a = (int)(c+1);
        a = a-32;
        if(a > 90){
          a = 65;
        }
        c = (char)(a);
        st1 = st1.concat(Character.toString(c));
      }
    }

    System.out.println("\nOriginal word: "+st);
    System.out.println("\nNew word using Round Robin System: "+st1);
    sc.close();
  }
}