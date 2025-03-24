import java.util.Scanner;
import java.lang.Math;

public class BinarySearch_1D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Binary Search, array must be sorted.");
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();
    int ar[] = new int[n];
    System.out.println("\nEnter elements in ascending order:");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
    for(int i=0;i<ar.length-1;i++){
      if(ar[i] > ar[i+1]){
        System.out.println("\nArray is not sorted in ascending order.");
        System.exit(0);
      }
    }
    System.out.println("\nArray 1-D: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    System.out.println("\nEnter element to be searched: ");
    int ele = sc.nextInt();
    int f, l, m;
    f = 0;
    l = ar.length-1;
    m = (f+l)/2;
    while(f <= l){
      if(f == l){
        if(ele == ar[f]){
          System.out.println("\nElement "+ele+" is found at location ar["+f+"].");
          break;
        }else{
          System.out.println("\nElement "+ele+" is not found in the array.");
          break;
        }
      }
      if(ele == ar[m]){
        System.out.println("\nElement "+ele+" is found at location ar["+m+"].");
        break;
      }else if(ele < ar[m]){
        l = m-1;
        m = (int)(Math.ceil((f+l)/2.0));
      }else{
        f = m+1;
        m = (int)(Math.floor((f+l)/2.0));
      }
    }
    sc.close();
  }
}