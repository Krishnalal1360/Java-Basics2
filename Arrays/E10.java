import java.util.Scanner;

public class E10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The day value is inclusive between 1 and 31.");
    System.out.println("The month value is inclusive between 1 and 12.");
    System.out.println("The year value is inclusive between 1900 and 3000.");
    System.out.println("\nEnter day: ");
    int d = sc.nextInt();
    System.out.println("\nEnter month: ");
    int m = sc.nextInt();
    System.out.println("\nEnter year: ");
    int y = sc.nextInt();
    if((d < 1) || (d > 31)){
      System.out.println("\nInvalid day!");
      System.exit(0);
    }
    if((m < 1) || (m > 12)){
      System.out.println("\nInvalid month!");
      System.exit(0);
    }
    if((y < 1900) || (y > 3000)){
      System.out.println("\nInvalid year!");
      System.exit(0);
    }

    System.out.println("\nValid date: "+d+"/"+m+"/"+y);

    int dn=0;
    int ar[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,};
    for(int i=0;i<ar.length;i++){
      if(m == (i+1)){
        dn = dn+d;
        break;
      }else{
        dn = dn+ar[i];
      }
    }
    System.out.println("\nThe day number of the year: "+dn);
    sc.close();
  }
}