import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;

public class P18{

  static public String longestWord(String st){
    StringTokenizer stt = new StringTokenizer(st, " ");
    int lw=0;
    String st1="", w="";
    while(stt.hasMoreTokens()){
      st1 = stt.nextToken();
      if(st1.length() > lw){
        lw = st1.length();
        w = st1;
      }
    }
    return w;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a string: ");
    String st = sc.nextLine();

    String lw="";
    lw = longestWord(st);

    System.out.println("\nLongest word in the string is: "+lw);

    char c='\u0000';
    System.out.println();
    for(int i=0;i<lw.length();i++){
      c = lw.charAt(i);
      System.out.println("ASCII of "+c+" : "+(int)(c));
    }
    sc.close();
  }
}