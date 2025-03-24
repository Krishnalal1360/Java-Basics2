import java.util.Scanner;

public class InsertionSort_1D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();
    int ar[] = new int[n+1];
    ar[0] = Integer.MIN_VALUE;
    System.out.println("\nEnter elements: ");
    for(int i=1;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
    System.out.println("\nArray 1-D: ");
    for(int i=1;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    int temp=0, ptr=0;
    for(int i=1;i<ar.length;i++){
      temp = ar[i];
      ptr = i-1;
      while(ar[ptr] > temp){
        ar[ptr+1] = ar[ptr];
        ptr = ptr-1;
      }
      ar[ptr+1] = temp;
    }
    System.out.println("\nArray 1-D after sorting: ");
    for(int i=1;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    sc.close();
  }
}