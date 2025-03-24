import java.util.Scanner;
import java.lang.Math;

public class Math_ceil_floor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a double value: ");
    double n = sc.nextDouble();
    double c = Math.ceil(n);
    double f = Math.floor(n);
    System.out.println("\nCeil of "+n+" is "+c+".");
    System.out.println("\nFloor of "+n+" is "+f+".");
    sc.close();
  }
}