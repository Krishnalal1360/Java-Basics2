import java.util.Scanner;

public class Happy{

  static public int sum(int n){
    int s=0, r=0;
    while(n > 0){
      r = n%10;
      s = s+(r*r);
      n = n/10;
    }
    return s;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Enter a natural number.");
    int n = sc.nextInt();
    if(n < 1){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int dup=n;
    while(dup > 9){
      dup = sum(dup);
    }

    if(dup == 1){
      System.out.println("\nNumber "+n+" is a Happy Number!");
    }else{
      System.out.println("\nNumber "+n+" is not a Happy Number!");
    }
    sc.close();
  }
}