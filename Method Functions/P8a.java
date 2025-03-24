import java.util.Scanner;
import java.lang.Math;

public class P8a {

  static public int expo(int a, int i){
    return (int)(Math.pow(a, i));
  }

  static public int facto(int f){
    int fact=1;
    for(int i=f;i>1;i--){
      fact = fact*i;
    }
    return fact;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter number of terms: ");
    int n = sc.nextInt();
    System.out.println("\nEnter value of a: ");
    int a = sc.nextInt();
    double s=0.0d;
    int e=0, f=0;
    s = s+1.0;
    int pow=1, fact=2;
    for(int i=2;i<=n;i++){
      e = expo(a, pow);
      pow = pow+2;
      f = facto(fact);
      fact = fact+2;
      s = s+(double)e/(double)f;
    }
    System.out.println("\nSum of "+n+" terms: "+s);
    sc.close();
  }
}