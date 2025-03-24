import java.util.Scanner;

public class P5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of boxes must be atleat 1.");
    System.out.println("The limit is 1000.");
    System.out.println("Carton 1 can contain 6 boxes.");
    System.out.println("Carton 2 can contain 12 boxes.");
    System.out.println("Carton 3 can contain 24 boxes.");
    System.out.println("Carton 4 can contain 48 boxes.");
    System.out.println("Enter number of boxes: ");
    int n = sc.nextInt();
    if((n < 1) || (n > 1000)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    System.out.println("\nNumber of boxes = "+n);
    int c=0, tc=0;
    if(n >= 48){
      c = n/48;
      tc = tc+c;
      System.out.println("48 * "+c+" = "+(48*c));
      n = n%48;
      if(n >= 24){
        c = n/24;
        tc = tc+c;
        System.out.println("24 * "+c+" = "+(24*c));
        n = n%24;
      }
      if(n >= 12){
        c = n/12;
        tc = tc+c;
        System.out.println("12 * "+c+" = "+(12*c));
        n = n%12;
      }
      if(n >= 6){
        c = n/6;
        tc = tc+c;
        System.out.println("6 * "+c+" = "+(6*c));
        n = n%6;
      }
      if((n >= 1) && (n <= 5)){
        System.out.println("Number of left boxes: "+n);
        tc = tc+1;
      }
      System.out.println("Total number of cartons: "+tc);
    }else if(n >= 24){
      c = n/24;
      tc = tc+c;
      System.out.println("24 * "+c+" = "+(24*c));
      n = n%24;
      if(n >= 12){
        c = n/12;
        tc = tc+c;
        System.out.println("12 * "+c+" = "+(12*c));
        n = n%12;
      }
      if(n >= 6){
        c = n/6;
        tc = tc+c;
        System.out.println("6 * "+c+" = "+(6*c));
        n = n%6;
      }
      if((n >= 1) && (n <= 5)){
        System.out.println("Number of left boxes: "+n);
        tc = tc+1;
      }
      System.out.println("Total number of cartons: "+tc);
    }else if(n >= 12){
      c = n/12;
      tc = tc+c;
      System.out.println("12 * "+c+" = "+(12*c));
      n = n%12;
      if(n >= 6){
        c = n/6;
        tc = tc+c;
        System.out.println("6 * "+c+" = "+(6*c));
        n = n%6;
      }
      if((n >= 1) && (n <= 5)){
        System.out.println("Number of left boxes: "+n);
        tc = tc+1;
      }
      System.out.println("Total number of cartons: "+tc);
    }else if(n >= 6){
      c = n/6;
      tc = tc+c;
      System.out.println("6 * "+c+" = "+(6*c));
      n = n%6;
      if((n >= 1) && (n <= 5)){
        System.out.println("Number of left boxes: "+n);
        tc = tc+1;
      }
      System.out.println("Total number of cartons: "+tc);
    }else if((n >= 1) && (n <= 5)){
      tc = tc+1;
      System.out.println("Total number of cartons: "+tc);
    }
    sc.close();
  }
}