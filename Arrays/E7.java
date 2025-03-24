import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class E7 {

  static public int d=0;

  static public String one_digit(String st1){
    d = Integer.parseInt(st1);
    if(d == 1){
      return "ONE";
    }else if(d == 2){
      return "TWO";
    }else if(d == 3){
      return "THREE";
    }else if(d == 4){
      return "FOUR";
    }else if(d == 5){
      return "FIVE";
    }else if(d == 6){
      return "SIX";
    }else if(d == 7){
      return "SEVEN";
    }else if(d == 8){
      return "EIGHT";
    }else if(d == 9){
      return "NINE";
    }else{
      return "";
    }
  }

  static public String two_digit(String st1){
    d = Integer.parseInt(st1);
    if(d == 10){
      return "TEN";
    }else if(d == 11){
      return "ELEVEN";
    }else if(d == 12){
      return "TWELEVE";
    }else if(d == 13){
      return "THIRTEEN";
    }else if(d == 14){
      return "FOURTEEN";
    }else if(d == 15){
      return "FIFTEEN";
    }else if(d == 16){
      return "SIXTEEN";
    }else if(d == 17){
      return "SEVENTEEN";
    }else if(d == 18){
      return "EIGHTEEN";
    }else if(d == 19){
      return "NINETEEN";
    }else{
      return "";
    }
  }

  static public String two_digit1(String st1){
    d = Integer.parseInt(st1);
    if(d == 2){
      return "TWENTY";
    }else if(d == 3){
      return "THIRTY";
    }else if(d == 4){
      return "FORTY";
    }else if(d == 5){
      return "FIFTY";
    }else if(d == 6){
      return "SIXTY";
    }else if(d == 7){
      return "SEVENTY";
    }else if(d == 8){
      return "EIGHTY";
    }else if(d == 9){
      return "NINETY";
    }else{
      return "";
    }
  }

  static public String three_digit(String st1){
    d = Integer.valueOf(st1);
    if(d == 1){
      return "ONE HUNDRED";
    }else if(d == 2){
      return "TWO HUNDRED";
    }else if(d == 3){
      return "THREE HUNDRED";
    }else if(d == 4){
      return "FOUR HUNDRED";
    }else if(d == 5){
      return "FIVE HUNDRED";
    }else if(d == 6){
      return "SIX HUNDRED";
    }else if(d == 7){
      return "SEVEN HUNDRED";
    }else if(d == 8){
      return "EIGHT HUNDRED";
    }else if(d == 9){
      return "NINE HUNDRED";
    }else{
      return "";
    }
  }

  static public String four_digit(String st1){
    d = Integer.valueOf(st1);
    if(d == 1){
      return "ONE THOUSAND";
    }else if(d == 2){
      return "TWO THOUSAND";
    }else if(d == 3){
      return "THREE THOUSAND";
    }else if(d == 4){
      return "FOUR THOUSAND";
    }else if(d == 5){
      return "FIVE THOUSAND";
    }else if(d == 6){
      return "SIX THOUSAND";
    }else if(d == 7){
      return "SEVEN THOUSAND";
    }else if(d == 8){
      return "EIGHT THOUSAND";
    }else if(d == 9){
      return "NINE THOUSAND";
    }else{
      return "";
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number must be inclusive between 1 and 9999.");
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    if((n < 1) || (n > 9999)){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The number must be inclusive between 1 and 9999.");
      System.exit(0);
    }
    System.out.println("\nNumber: "+n);
    String st = Integer.toString(n);
    char c1='\u0000', c2='\u0000', c3='\u0000', c4='\u0000';
    String st1="";
    if(st.length() == 1){
      System.out.println("\nNumber "+n+" in words: "+one_digit(st));
    }else if(st.length() == 2){
      if(two_digit(st).equals("")){
        c1 = st.charAt(0);
        c2 = st.charAt(1);
        System.out.println("\nNumber "+n+" in words: "+two_digit1(Character.toString(c1))+" "+one_digit(Character.toString(c2)));
      }else{
        System.out.println("\nNumber "+n+" in words: "+two_digit(st));
      }
    }else if(st.length() == 3){
      c3 = st.charAt(0);
      st1 = st.substring(1);
      if(two_digit(st1).equals("")){
        c1 = st.charAt(1);
        c2 = st.charAt(2);
        System.out.println("\nNumber "+n+" in words: "+three_digit(Character.toString(c3))+" "+two_digit1(Character.toString(c1))+" "+one_digit(Character.toString(c2)));
      }else{
        System.out.println("\nNumber "+n+" in words: "+three_digit(Character.toString(c3))+" "+two_digit(st1));
      }
    }else if(st.length() == 4){
      c4 = st.charAt(0);
      c3 = st.charAt(1);
      st1 = st.substring(2);
      if(two_digit(st1).equals("")){
        c1 = st.charAt(2);
        c2 = st.charAt(3);
        System.out.println("\nNumber "+n+" in words: "+four_digit(Character.toString(c4))+" "+three_digit(Character.toString(c3))+" "+two_digit1(Character.toString(c1))+" "+one_digit(Character.toString(c2)));
      }else{
        System.out.println("\nNumber "+n+" in words: "+four_digit(Character.toString(c4))+" "+three_digit(Character.toString(c3))+" "+two_digit(st1));
      }
    }
    sc.close();
  }
}