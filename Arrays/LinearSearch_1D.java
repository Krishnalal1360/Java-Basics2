import java.util.Scanner;

public class LinearSearch_1D{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Linear Search, array may be sorted or unsorted.");
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();
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
    System.out.println("\nEnter element to be searched: ");
    int ele = sc.nextInt();
    for(int i=0;i<ar.length;i++){
      if(ar[i] == ele){
        System.out.println("\nElement "+ele+" is found at location ar["+i+"].");
        break;
      }
      if(i == ar.length-1){
        System.out.println("\nElement "+ele+" is not found in the array.");
      }
    }
    sc.close();
  }
}