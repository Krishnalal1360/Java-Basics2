import java.util.Scanner;

public class E11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
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

    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+" ");
      }
      System.out.println();
    }

    int temp=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length-1;j++){
        temp = ar[i][j];
        for(int k=j+1;k<ar[i].length;k++){
          if(ar[i][k] < ar[i][j]){
            ar[i][j] = ar[i][k];
            ar[i][k] = temp;
            temp = ar[i][j];
          }
        }
      }
    }

    System.out.println("\nRow-wise element sorted Matrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}