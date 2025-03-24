import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;
import java.lang.StringBuffer;

public class P3 {

  static public void currency_words(String st){
    st = st.replace("," , "");
    char c='\u0000';
    System.out.print("\nAmount in words: ");
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(c == '0'){
        System.out.print("Zero ");
      }else if(c == '1'){
        System.out.print("One ");
      }else if(c == '2'){
        System.out.print("Two ");
      }else if(c == '3'){
        System.out.print("Three ");
      }else if(c == '4'){
        System.out.print("Four ");
      }else if(c == '5'){
        System.out.print("Five ");
      }else if(c == '6'){
        System.out.print("Six ");
      }else if(c == '7'){
        System.out.print("Seven ");
      }else if(c == '8'){
        System.out.print("Eight ");
      }else if(c == '9'){
        System.out.print("Nine ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The amount must be 5-digit.");
    System.out.println("Enter the amount: ");
    int a = sc.nextInt();
    String st = Integer.toString(a);
    if(st.length() != 5) {
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    StringBuffer sb = new StringBuffer(st);
    sb.insert(2, ",");
    st = sb.toString();
    System.out.println("\nAmount: Rs."+st);

    currency_words(st);

    System.out.println("\nCurrency denominations are: 2000, 500, 200, 100, 50, 20, 10, 1");

    int q=0;
    System.out.println("\nDenomination: ");
    q = a/2000;
    a = a%2000;
    System.out.println("2000 * "+q+" = "+(2000*q));
    if(a >= 500){
      q = a/500;
      a = a%500;
      System.out.println("500 * "+q+" = "+(500*q));
    }
    if(a >= 200){
      q = a/200;
      a = a%200;
      System.out.println("200 * "+q+" = "+(200*q));
    }
    if(a >= 100){
      q = a/100;
      a = a%100;
      System.out.println("100 * "+q+" = "+(100*q));
    }
    if(a >= 50){
      q = a/50;
      a = a%50;
      System.out.println("50 * "+q+" = "+(50*q));
    }
    if(a >= 20){
      q = a/20;
      a = a%20;
      System.out.println("20 * "+q+" = "+(20*q));
    }
    if(a >= 10){
      q = a/10;
      a = a%10;
      System.out.println("10 * "+q+" = "+(10*q));
    }
    if(a >= 1){
      q = a/1;
      a = a%1;
      System.out.println("1 * "+q+" = "+(1*q));
    }
    sc.close();
  }
}