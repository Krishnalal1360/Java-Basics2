import java.util.Scanner;

public class Array2D_Array1D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the number of rows: ");
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

    int ar1[] = new int[n*m];
    int index=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        ar1[index] = ar[i][j];
        index = index+1;
      }
    }
    System.out.println("\nArray 1-D: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }
    sc.close();
  }
}