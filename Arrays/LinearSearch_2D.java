import java.util.Scanner;

public class LinearSearch_2D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nFor Linear Search, array may be sorted or unsorted.");
    System.out.println("\nEnter number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    int m = sc.nextInt();
    int ar[][] = new int[n][m];
    System.out.println("\nEnter elements: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print("Enter element at location ar["+i+"]["+j+"]: ");
        ar[i][j] = sc.nextInt();
        System.out.println();
      }
    }
    System.out.println("\nArray 2-D: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.println("ar["+i+"]["+j+"]="+ar[i][j]);
      }
    }
    System.out.println("\nEnter element to be searched: ");
    int ele = sc.nextInt();
    outer:
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(ar[i][j] == ele){
          System.out.println("\nElement "+ele+" is found at location ar["+i+"]["+j+"].");
          break outer;
        }
        if((i == ar.length-1) && (j == ar[i].length-1)){
          System.out.println("\nElement "+ele+" is not found in the array.");
        }
      }
    }
    sc.close();
  }
}