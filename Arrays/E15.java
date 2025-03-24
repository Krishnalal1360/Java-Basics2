import java.util.Scanner;

public class E15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("The values must be greater than 0.");
    System.out.println("\nEnter the number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    int m = sc.nextInt();
    if((n < 1) || (m < 1) || (n != m)) {
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

    int ar1[][] = new int[n][m];
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        ar1[i][j] = ar[j][i];
      }
    }

    System.out.println("\nTranspose matrix: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.print(ar1[i][j]+"\t");
      }
      System.out.println();
    }

    int ar2[][] = new int[n][m];
    int cc=0;
    for(int i=0;i<ar1.length;i++){
      cc = ar2.length-1;
      for(int j=0;j<ar1[i].length;j++){
        ar2[i][cc] = ar1[i][j];
        cc = cc-1;
      }
    }

    System.out.println("\n90 degree rotated matrix: ");
    for(int i=0;i<ar2.length;i++){
      for(int j=0;j<ar2[i].length;j++){
        System.out.print(ar2[i][j]+"\t");
      }
      System.out.println();
    }

    System.out.println("\nCorner elements are: ");
    System.out.println("1. "+ar2[0][0]);
    System.out.println("2. "+ar2[0][ar2.length-1]);
    System.out.println("3. "+ar2[ar2.length-1][0]);
    System.out.println("4. "+ar2[ar2.length-1][ar2.length-1]);

    int sum=0;
    sum = ar2[0][0]+ar2[0][ar2.length-1]+ar2[ar2.length-1][0]+ar2[ar2.length-1][ar2.length-1];
    System.out.println("\nSum of corner elements is: "+sum);
    sc.close();
  }
}