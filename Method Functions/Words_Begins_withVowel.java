import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.String;
import java.lang.Character;

public class Words_Begins_withVowel{

  static public String vowel(String st){
    char c='\u0000';
    c = st.charAt(0);
    String v="aeiouAEIOU";
    int flag=0;
    for(int i=0;i<v.length();i++){
      if(v.charAt(i) == c){
        flag = 1;
        break;
      }
    }
    if(flag == 1){
      return st;
    }else{
      return "v";
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The sentence must ends with full stop.");
    System.out.println("There must be a single whitespace between words.");
    System.out.println("\nEnter a sentence: ");
    String st = sc.nextLine();
    if(st.charAt(st.length()-1) != '.'){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    StringTokenizer stt = new StringTokenizer(st);
    int ct = stt.countTokens();
    int ws = ct-1;
    char c='\u0000';
    int cws=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == true){
        cws = cws+1;
      }
    }
    if(ws != cws){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    st = st.replace(".", " ");

    String st1="";
    String ar[] = new String[ct];
    int index = 0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == false){
        st1 = st1.concat(Character.toString(c));
      }else{
        ar[index] = vowel(st1);
        index = index+1;
        st1 = "";
      }
    }

    int freq=0;
    if(ar[0] != null){
      System.out.println("\nWords which begins with a vowel are: ");
      for(int i=0;i<ar.length;i++){
        if(ar[i] == "v"){
          continue;
        }else if(ar[i] == null){
          break;
        }else{
          System.out.println(ar[i]);
          freq = freq+1;
        }
      }
      System.out.println("\nFrequency: "+freq);
    }else{
      System.out.println("\nNo words begins with a vowel.");
      System.exit(0);
    }
    sc.close();
  }
}