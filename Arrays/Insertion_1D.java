import java.util.Scanner;

public class Insertion_1D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();
    System.out.println("\nEnter number of insertions: ");
    int m = sc.nextInt();
    int ar[] = new int[n+m];
    System.out.println("\nEnter elements: ");
    for(int i=0;i<(ar.length-m);i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
    System.out.println("\nArray 1-D: ");
    for(int i=0;i<n;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    int index=0, ele=0;
    for(int i=1;i<=m;i++){
      System.out.println("\nEnter index to insert: ");
      index = sc.nextInt();
      System.out.println("\nEnter element at index "+index+": ");
      ele = sc.nextInt();
      for(int j=(n-1)+(i-1);j>=index;j--){
        ar[j+1] = ar[j];
      }
      ar[index] = ele;
      System.out.println("\nArray 1-D after insertion: ");
      for(int j=0;j<n+i;j++){
        System.out.println("ar["+j+"]="+ar[j]);
      }
    }
    sc.close();
  }
}