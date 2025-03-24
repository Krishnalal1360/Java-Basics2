import java.util.Scanner;

public class P16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows may be equal to number of columns.");
    System.out.println("The values must be greater than 1.");
    System.out.println("The last each row cell is for sum.");
    System.out.println("The last each column cell is for sum.");
    System.out.println("The last row is for column's sum.");
    System.out.println("The last column is for row's sum.");
    System.out.println("\nEnter the number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter the number of columns: ");
    int m = sc.nextInt();

    int ar[][] = new int[n][m];

    System.out.println("\nEnter the elements for the matrix: ");
    int rs=0;
    for(int i=0;i<ar.length-1;i++){
      for(int j=0;j<ar[i].length-1;j++){
        System.out.print("Enter element at location ar["+i+"]["+j+"]: ");
        ar[i][j] = sc.nextInt();
        rs = rs+ar[i][j];
      }
      ar[i][m-1] = rs;
      rs = 0;
    }

    int cs=0;
    for(int i=0;i<ar.length-1;i++){
      for(int j=0;j<ar[i].length-1;j++){
        cs = cs+ar[j][i];
      }
      ar[n-1][i] = cs;
      cs = 0;
    }

    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
    sc.close();
  }
}