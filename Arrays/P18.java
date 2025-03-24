import java.util.Scanner;

public class P18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows may be equal to number of columns for both matrices.");
    System.out.println("The number of columns of first matrix must be equal to number of rows of second matrix.");
    System.out.println("The new matrix must have n1 as the number of rows and m2 as the number of columns.");
    System.out.println("The values must be greater than 0.");
    System.out.println("\nMatrix 1: ");
    System.out.println("Enter the number of rows: ");
    int n1 = sc.nextInt();
    System.out.println("Enter the number of columns: ");
    int m1 = sc.nextInt();
    System.out.println("\nMatrix 2: ");
    System.out.println("Enter the number of rows: ");
    int n2 = sc.nextInt();
    System.out.println("Enter the number of columns: ");
    int m2 = sc.nextInt();
    if((n1 < 1) || (m1 < 1) || (n2 < 1) || (m2 < 1) || (m1 != n2)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar1[][] = new int[n1][m1];
    int ar2[][] = new int[n2][m2];

    System.out.println("\nEnter elements for Matrix 1: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.print("Enter the element at location ar1["+i+"]["+j+"]: ");
        ar1[i][j] = sc.nextInt();
        System.out.println();
      }
    }

    System.out.println("\nMatrix 1: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.print(ar1[i][j]+"\t");
      }
      System.out.println();
    }

    System.out.println("\nEnter elements for Matrix 2: ");
    for(int i=0;i<ar2.length;i++){
      for(int j=0;j<ar2[i].length;j++){
        System.out.print("Enter the element at location ar2["+i+"]["+j+"]: ");
        ar2[i][j] = sc.nextInt();
        System.out.println();
      }
    }

    System.out.println("\nMatrix 2: ");
    for(int i=0;i<ar2.length;i++){
      for(int j=0;j<ar2[i].length;j++){
        System.out.print(ar2[i][j]+"\t");
      }
      System.out.println();
    }

    int ar3[][] = new int[n1][m2];
    for(int i=0;i<n1;i++){
      for(int j=0;j<m2;j++){
        /*for(int k=0;k<m1;k++){
          ar3[i][j] = ar3[i][j]+(ar1[i][k]*ar2[k][j]);
        }*/
        for(int k=0;k<n2;k++){
          ar3[i][j] = ar3[i][j]+(ar1[i][k]*ar2[k][j]);
        }
      }
    }

    System.out.println("\nMatrix 3: ");
    for(int i=0;i<ar3.length;i++){
      for(int j=0;j<ar3[i].length;j++){
        System.out.print(ar3[i][j]+"\t");
      }
      System.out.println();
    }
    sc.close();
  }
}
