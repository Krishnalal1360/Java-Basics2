import java.util.Scanner;
import java.lang.Math;

public class Quadratic{

  static public double a=0.0d, b=0.0d, c=0.0d;

  public void discriminant(){
    double d = Math.pow(b, 2)-4*a*c;
    if(d>0){
      System.out.println("\nRoots are real and distinct.");
      roots(d);
    }
    else if(d<0){
      System.out.println("\nRoots are imaginary.");
    }
    else{
      System.out.println("\nRoots are real and equal.");
      roots(d);
    }
  }

  public void roots(double d){
    double r1 = (-b+Math.sqrt(d))/(2*a);
    double r2 = (-b-Math.sqrt(d))/(2*a);
    System.out.println("\nRoots are: "+r1+" and "+r2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter value of a: ");
    a = sc.nextDouble();
    System.out.println("\nEnter value of b: ");
    b = sc.nextDouble();
    System.out.println("\nEnter value of c: ");
    c = sc.nextDouble();
    Quadratic ob = new Quadratic();
    ob.discriminant();
    sc.close();
  }
}