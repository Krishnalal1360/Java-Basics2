import java.util.Scanner;

public class P14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows may be equal to number of columns.");
    System.out.println("The values must be greater than 1.");
    System.out.println("\nEnter the number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter the number of columns: ");
    int m = sc.nextInt();
    if((n < 2) || (m < 2)) {
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[][] = new int[n][m];

    System.out.println("\nEnter elements for the matrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print("Enter element at location ar["+i+"]["+j+"]: ");
        ar[i][j] = sc.nextInt();
        System.out.println();
      }
    }

    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }

    int temp=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<=(m-1)/2;j++){
        temp = ar[i][j];
        ar[i][j] = ar[i][(m-1)-j];
        ar[i][(m-1)-j] = temp;
      }
    }

    System.out.println("\nMatrix after inter-changing columns: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
    sc.close();
  }
}