import java.util.Scanner;

public class P15 {

  static public void boundarySum(int ar[][]){
    int bs=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if((i == 0) || (j == 0) || (i == ar.length-1) || (j == ar.length-1)){
          bs = bs+ar[i][j];
        }else{
          continue;
        }
      }
    }
    System.out.println("\nBoundary elements sum: "+bs);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("\nEnter number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    int m = sc.nextInt();

    if(n != m){
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

    boundarySum(ar);
    sc.close();
  }
}