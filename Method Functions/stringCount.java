import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;
import java.lang.Character;

public class stringCount{

  static public void wordsCount(String st){
    StringTokenizer stt = new StringTokenizer(st, " ");
    int ct = stt.countTokens();
    System.out.println("\nNumber of words: "+ct);
  }

  static public void lowerUpperCaseCount(String st){
    int clc=0, cuc=0;
    char c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLetter(c) == true){
        if(Character.isUpperCase(c) == true){
          cuc = cuc+1;
        }else if(Character.isLowerCase(c) == true){
          clc = clc+1;
        }
      }else{
        continue;
      }
    }
    System.out.println("\nUpperCase characters frequency: "+cuc);
    System.out.println("\nLowerCase characters frequency: "+clc);
  }

  static public void vowelsCount(String st){
    char c='\u0000', c1='\u0000';
    String st1="aeiouAEIOU";
    int vc=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLetter(c) == true){
        inner:
        for(int j=0;j<st1.length();j++){
          c1 = st1.charAt(j);
          if(c == c1){
            vc = vc+1;
            break inner;
          }
        }
      }else{
        continue;
      }
    }
    System.out.println("\nVowels frequency: "+vc);
  }

  static public void consonantsCount(String st){
    char c='\u0000', c1='\u0000';
    int cc=0;
    String st1="aeiouAEIOU";
    outer:
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c == ' '){
        continue;
      }else if(c == ','){
        continue;
      }else if((c == '?') || (c == '!') || (c == '.')){
        break;
      }else{
        if(Character.isLetter(c) == true){
          for(int j=0;j<st1.length();j++){
            c1 = st1.charAt(j);
            if(c == c1){
              continue outer;
            }
          }
          cc = cc+1;
        }
      }
    }
    System.out.println("\nConsonants frequency: "+cc);
  }

  static public void freqOfEachCharacter(String st){
    st = st.toUpperCase();
    System.out.println("\nSentence in Uppercase: \n"+st);
    String st1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char c1='\u0000', c2='\u0000';
    int freq=0;
    System.out.println();
    for(int i=0;i<st1.length();i++){
      c1 = st1.charAt(i);
      for(int j=0;j<st.length();j++){
        c2 = st.charAt(j);
        if(Character.toString(c1).equalsIgnoreCase(Character.toString(c2)) == true){
          freq = freq+1;
        }
      }
      if(freq > 0){
        System.out.println("Frequency of "+c1+" is: "+freq);
      }
      freq = 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The sentence must ends with either ? or ! or .");
    System.out.println("You can use comma between words as punctuation.");
    System.out.println("You must use only a single whitespace between words.");
    System.out.println("\nEnter a sentence: ");
    String st = sc.nextLine();
    char c='\u0000';
    c = st.charAt(st.length()-1);
    if((c != '?') && (c != '!') && (c != '.')){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    StringTokenizer stt = new StringTokenizer(st, " ");
    int ct = stt.countTokens();
    int ws = ct-1;
    int cws = 0;
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

    System.out.println("\nSentence: \n"+st);
    wordsCount(st);
    lowerUpperCaseCount(st);
    vowelsCount(st);
    consonantsCount(st);
    freqOfEachCharacter(st);
    sc.close();
  }
}