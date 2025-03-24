import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;
import java.lang.Character;
import java.lang.Integer;

public class P4 {

  static public int char_int(char c){
    if(c == 'A'){
      return 1;
    }else if(c == 'B'){
      return 2;
    }else if(c == 'C'){
      return 3;
    }else if(c == 'D'){
      return 4;
    }else if(c == 'E'){
      return 5;
    }else if(c == 'F'){
      return 6;
    }else if(c == 'G'){
      return 7;
    }else if(c == 'H'){
      return 8;
    }else if(c == 'I'){
      return 9;
    }else if(c == 'J'){
      return 10;
    }else if(c == 'K'){
      return 11;
    }else if(c == 'L'){
      return 12;
    }else if(c == 'M'){
      return 13;
    }else if(c == 'N'){
      return 14;
    }else if(c == 'O'){
      return 15;
    }else if(c == 'P'){
      return 16;
    }else if(c == 'Q'){
      return 17;
    }else if(c == 'R'){
      return 18;
    }else if(c == 'S'){
      return 19;
    }else if(c == 'T'){
      return 20;
    }else if(c == 'U'){
      return 21;
    }else if(c == 'V'){
      return 22;
    }else if(c == 'W'){
      return 23;
    }else if(c == 'X'){
      return 24;
    }else if(c == 'Y'){
      return 25;
    }else if(c == 'Z'){
      return 26;
    }else{
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The sentence must be terminated by . or ? or !");
    System.out.println("The sentence must have only single whitespace between words.");
    System.out.println("The sentence must be in Uppercase.");
    System.out.println("Special characters or digits are not allowed.");
    System.out.println("\nEnter a sentence: ");
    String st = sc.nextLine();
    if((st.endsWith(".") == false) && (st.endsWith("?") == false) && (st.endsWith("!") == false)){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence must be terminated by . or ? or !");
      System.exit(0);
    }

    StringTokenizer stt = new StringTokenizer(st, " ");
    int ct = stt.countTokens();
    int ws = ct-1;
    char c='\u0000';
    int cws=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c == ' '){
        cws = cws+1;
      }
    }
    if(ws != cws){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence must have only single whitespace between words.");
      System.exit(0);
    }

    c='\u0000';
    int flag = 0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLetter(c) == true){
        if(Character.isUpperCase(c) == true){
          continue;
        }else{
          flag = 1;
          break;
        }
      }
    }
    if(flag == 1){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The sentence must be in Uppercase.");
      System.exit(0);
    }

    c='\u0000';
    flag=0;
    for(int i=0;i<st.length()-1;i++){
      c = st.charAt(i);
      if(Character.isUpperCase(c) == true){
        continue;
      }else if(Character.isWhitespace(c) == true){
        continue;
      }else{
        flag = 1;
      }
    }
    if(flag == 1){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: Special characters or digits are not allowed.");
      System.exit(0);
    }

    String ar[][] = new String[ct][2];

    st = st.replace(Character.toString(st.charAt(st.length()-1)), "");

    st = st.concat(" ");

    c='\u0000';
    char c1='\u0000';
    String st1="";
    int index=0, cv=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        st1 = st1.concat(String.valueOf(c));
      }else{
        ar[index][0] = st1;
        for(int j=0;j<st1.length();j++){
          c1 = st1.charAt(j);
          cv = cv+char_int(c1);
        }
        ar[index][1] = Integer.toString(cv);
        index = index+1;
        st1="";
        cv=0;
      }
    }

    System.out.println("\nPotential: ");
    for(int i=0;i<ar.length;i++){
      System.out.println(ar[i][0]+" = "+ar[i][1]);
    }

    String temp1="", temp2="";
    for(int i=0;i<ct-1;i++){
      temp1 = ar[i][1];
      temp2 = ar[i][0];
      for(int j=i+1;j<ct;j++){
        if(Integer.valueOf(ar[j][1]) < Integer.valueOf(ar[i][1])){
          ar[i][1] = ar[j][1];
          ar[j][1] = temp1;
          temp1 = ar[i][1];
          ar[i][0] = ar[j][0];
          ar[j][0] = temp2;
          temp2 = ar[i][0];
        }
      }
    }

    System.out.println("\nWords sorted in ascending order based on their potential: ");
    for(int i=0;i<ar.length;i++){
      System.out.print(ar[i][0]+" ");
    }
    sc.close();
  }
}