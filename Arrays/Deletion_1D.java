import java.util.Scanner;

public class Deletion_1D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();
    System.out.println("\nEnter number of deletions: ");
    int m = sc.nextInt();
    int ar[] = new int[n];
    System.out.println("\nEnter elements: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
    System.out.println("\nArray 1-D: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    int index=0;
    for(int i=1;i<=m;i++){
      System.out.println("\nEnter index to delete: ");
      index = sc.nextInt();
      for(int j=index+1;j<n-(i-1);j++){
        ar[j-1] = ar[j];
      }
      System.out.println("\nArray 1-D after deletion: ");
      for(int j=0;j<n-i;j++){
        System.out.println("ar["+j+"]="+ar[j]);
      }
    }
    sc.close();
  }
}