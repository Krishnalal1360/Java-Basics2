import java.util.Scanner;

public class P2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The size must be greater than 1.");
    System.out.println("\nEnter size for the array: ");
    int n = sc.nextInt();
    if(n < 2){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    String ar[] = new String[n];

    System.out.println("\nEnter words for the array: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.next();
      System.out.println();
    }

    System.out.println("\nArray: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    String temp="";
    for(int i=0;i<ar.length-1;i++){
      temp = ar[i];
      for(int j=i+1;j<ar.length;j++){
        if(ar[j].compareTo(ar[i]) < 0){
          ar[i] = ar[j];
          ar[j] =  temp;
          temp = ar[i];
        }
      }
    }

    System.out.println("\nArray after sorting in alphabetical order: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    sc.close();
  }
}