import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.lang.StringBuffer; 

public class E5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The limit of characters in string is 80.");
    System.out.println("The string must be end with a full stop.");
    System.out.println("You can use one or more whitespaces between two words.");
    System.out.println("\nEnter a string: ");
    String st = sc.nextLine();
    //char c[] = st.toCharArray();
    /*for(char i: c){
      System.out.println(i);
    }
    System.out.println();
    for(int i=0;i<c.length;i++){
      System.out.println("c["+i+"]="+c[i]);
    }*/
    /*if(c.length > 80){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The number of characters must not exceed 80.");
      System.exit(0);
    }*/
    if(st.length() > 80){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The number of characters must not exceed 80.");
      System.exit(0);
    }
    if(st.charAt(st.length()-1) != '.'){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The string must end with a full stop.");
      System.exit(0);
    }
    System.out.println("\nOriginal String: \n"+st);

    int cws=0;
    char c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isWhitespace(c) == true){
        cws = cws+1;
      }
    }

    st = st.replace('.',' ');
    String st1="";
    String ar[] = new String[cws+1];
    int index=0;
    char c1='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c != ' '){
        st1 = st1.concat(Character.toString(c));
      }else{
        c1 = st1.charAt(0);
        c1 = Character.toUpperCase(c1);
        StringBuffer sb = new StringBuffer(st1);
        sb.setCharAt(0, c1);
        st1 = sb.toString();
        if(st1.charAt(st1.length()-1) == ','){
          st1 = st1.replace(Character.toString(st1.charAt(st1.length()-1)), "");
        }
        ar[index] = st1;
        index = index+1;
        st1 = "";
      }
    }

    System.out.println("\nWords Array: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    String temp="";
    for(int i=0;i<ar.length-1;i++){
      temp = ar[i];
      for(int j=i+1;j<ar.length;j++){
        if(ar[j].length() > ar[i].length()){
          ar[i] = ar[j];
          ar[j] = temp;
          temp = ar[i];
        }else if(ar[j].length() == ar[i].length()){
          if(ar[j].compareTo(ar[i]) < 0){
            ar[i] = ar[j];
            ar[j] = temp;
            temp = ar[i];
          }
        }else{
          continue;
        }
      }
    }

    st1="";
    for(int i=0;i<ar.length;i++){
      st1 = st1.concat(ar[i]);
      st1 = st1.concat(" "); 
    }
    st1 = st1.trim();
    st1 = st1.concat(".");
    System.out.println("\nWords are sorted in descending order: ");
    System.out.println(st1);
    sc.close();
  }
}