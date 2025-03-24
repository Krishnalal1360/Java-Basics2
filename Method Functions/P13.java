import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class P13{

  static public int prime(int n){
    int flag=0;
    for(int i=2;i<=n/2;i++){
      if(n%i == 0){
        flag = 1;
        break;
      }
    }
    if(flag == 0){
      return 1;
    }else{
      return 0;
    }
  }

  static public int palindrome(int n){
    String st = Integer.toString(n);
    int l=0, m=0;
    m = st.length()-1;
    l = ((m+1)/2)-1;
    char c1='\u0000', c2='\u0000';
    int flag=0;
    for(int i=0;i<=l;i++){
      c1 = st.charAt(i);
      c2 = st.charAt(m-i);
      if(c1 == c2){
        continue;
      }else{
        flag = 1;
        break;
      }
    }
    if(flag == 0){
      return 1;
    }else{
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a number greater than 1: ");
    int n = sc.nextInt();
    if(n <= 1){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int flag1=0, flag2=0;
    flag1 = prime(n);
    flag2 = palindrome(n);
    if((flag1 == 1) && (flag2 == 1)){
      System.out.println("\nNumber "+n+" is prime palindrome!");
    }else if((flag1 == 0) && (flag2 == 1)){
      System.out.println("\nNumber "+n+" is palindrome but not prime!");
    }else if((flag1 == 1) && (flag2 == 0)){
      System.out.println("\nNumber "+n+" is prime but not palindrome!");
    }else{
      System.out.println("\nNumber "+n+" is neither prime nor palindrome!");
    }
    sc.close();
  }
}