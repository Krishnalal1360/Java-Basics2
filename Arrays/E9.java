import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;
import java.lang.Character;

public class E9 {

  static public int flag = 1;

  static public String hour(int h){
    if(h == 1){
      return "One";
    }else if(h == 2){
      return "Two";
    }else if(h == 3){
      return "Three";
    }else if(h == 4){
      return "Four";
    }else if(h == 5){
      return "Five";
    }else if(h == 6){
      return "Six";
    }else if(h == 7){
      return "Seven";
    }else if(h == 8){
      return "Eight";
    }else if(h == 9){
      return "Nine";
    }else if(h == 10){
      return "Ten";
    }else if(h == 11){
      return "Eleven";
    }else if(h == 12){
      return "Twelve";
    }else{
      return "";
    }
  }

  static public String minute(int m){
    String st="";
    char c1='\u0000', c2='\u0000';
    if(m == 0){
      flag = 0;
      return "O'clock";
    }else if(m == 15){
      return "Quarter past";
    }else if(m == 30){
      return "Half past";
    }else if(m == 45){
      return "Quarter to";
    }else{
      st = String.valueOf(m);
      if(st.length() == 1){
        return one_digit(st);
      }else if(st.length() == 2){
        if(two_digit(st).equals("")){
          st = Integer.toString(m);
          c1 = st.charAt(0);
          c2 = st.charAt(1);
          //two_digit1(Character.toString(c1));
          //one_digit(Character.toString(c2));
          if(one_digit(Character.toString(c1)).equals("")){
            return one_digit(Character.toString(c2));
          }else{
            if(one_digit(Character.toString(c2)).equals("")){
              return two_digit1(Character.toString(c1))+" minutes past";
            }else{
              return two_digit1(Character.toString(c1))+" "+one_digit(Character.toString(c2));
            }
          }
        }else{
          return two_digit(st);
        }
      }
    }
    return "";
  }

  static public String two_digit(String st){
    int n = Integer.parseInt(st);
    if(n == 10){
      return "Ten minutes past";
    }else if(n == 11){
      return "Eleven minutes past";
    }else if(n == 12){
      return "Twelve minutes past";
    }else if(n == 13){
      return "Thirteen minutes past";
    }else if(n == 14){
      return "Fourteen minutes past";
    }else if(n == 16){
      return "Sixteen minutes past";
    }else if(n == 17){
      return "Seventeen minutes past";
    }else if(n == 18){
      return "Eighteen minutes past";
    }else if(n == 19){
      return "Nineteen minutes past";
    }else{
      return "";
    }
  }

  static public String two_digit1(String st){
    int n = Integer.valueOf(st);
    if(n == 2){
      return "Twenty";
    }else if(n == 3){
      return "Thirty";
    }else if(n == 4){
      return "Forty";
    }else if(n == 5){
      return "Fifty";
    }else if(n == 6){
      return "Sixty";
    }else if(n == 7){
      return "Seventy";
    }else if(n == 8){
      return "Eighty";
    }else if(n == 9){
      return "Ninety";
    }else{
      return "";
    }
  }

  static public String one_digit(String st){
    int n = Integer.valueOf(st);
    if(n == 1){
      return "One minutes past";
    }else if(n == 2){
      return "Two minutes past";
    }else if(n == 3){
      return "Three minutes past";
    }else if(n == 4){
      return "Four minutes past";
    }else if(n == 5){
      return "Five minutes past";
    }else if(n == 6){
      return "Six minutes past";
    }else if(n == 7){
      return "Seven minutes past";
    }else if(n == 8){
      return "Eight minutes past";
    }else if(n == 9){
      return "Nine minutes past";
    }else{
      return "";
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The Hour value must be inclusive between 1 and 12.");
    System.out.println("The Minute value must be inclusive between 0 and 59.");
    System.out.println("\nEnter hour: ");
    int h = sc.nextInt();
    System.out.println("\nEnter minute: ");
    int m = sc.nextInt();
    if((h < 1) || (h > 12)){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The hour must be inclusive between 1 and 12.");
      System.exit(0);
    }
    if((m < 0) || (m > 59)){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The minute must be inclusive between 0 and 59.");
      System.exit(0);
    }
    String st1="", st2="", st3="";
    st1 = hour(h);
    st2 = minute(m);
    if(flag == 0){
      st3 = "0".concat(Integer.toString(m));
      System.out.print(h+":"+st3+" "+st1+" "+st2);
    }else if(flag == 1){
      st3 = "0".concat(Integer.toString(m));
      if((m >= 0) && (m <= 9)){
        System.out.print(h+":"+st3+" "+st2+" "+st1);
      }else{
        System.out.print(h+":"+m+" "+st2+" "+st1);
      }
    }
    sc.close();
  }
}
