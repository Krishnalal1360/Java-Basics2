import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.util.StringTokenizer;

public class P9{

  static public int vowelString(String st){
    String v="AEIOU";
    st = st.toUpperCase();
    char c='\u0000';
    int f1=0, f2=0;
    for(int i=0;i<v.length();i++){
      c = v.charAt(i);
      if(st.startsWith(Character.toString(c))){
        f1 = 1;
      }
      if(st.endsWith(Character.toString(c))){
        f2 = 1;
      }
    }
    if(f1 == 1 && f2 == 1){
      return 1;
    }else{
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a string: ");
    String st = sc.nextLine();
    System.out.println("\nString: \n"+st);
    st = st.concat(" ");
    st = st.toUpperCase();
    System.out.println("\nString in UpperCase: \n"+st);
    char c='\u0000';
    String st1="";
    StringTokenizer stt = new StringTokenizer(st, " ");
    int ct = stt.countTokens();
    String ar[] = new String[ct];
    int flag=0, index=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == false){
        st1 = st1.concat(Character.toString(c));
      }else{
        flag = 0;
        flag = vowelString(st1);
        if(flag == 1){
          ar[index] = st1;
          index = index+1;
        }
        st1 = "";
      }
    }
    System.out.println("\nWords starting and ending with a vowel: ");
    for(int i=0;i<index;i++){
      System.out.println(ar[i]);
    }
    sc.close();
  }
}