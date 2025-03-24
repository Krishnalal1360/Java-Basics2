import java.util.Scanner;

public class E18 {

  static public void bubble_sort(int ar[][], int n){
    int ar1[][] = new int[n][n];

    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        ar1[i][j] = ar[j][i];
      }
    }

    System.out.println("\nTranspose Matrix: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.print(ar1[i][j]+"\t");
      }
      System.out.println();
    }

    int temp = 0;
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length-1;j++){
        temp = ar1[i][j];
        for(int k=j+1;k<ar1[i].length;k++){
          if(ar1[i][k] < ar1[i][j]){
            ar1[i][j] = ar1[i][k];
            ar1[i][k] = temp;
            temp = ar1[i][j];
          }
        }
      }
    }

    System.out.println("\nTranspose Matrix sorted row-wise using bubble sort: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.print(ar1[i][j]+"\t");
      }
      System.out.println();
    }

    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        ar[i][j] = ar1[j][i];
      }
    }

    System.out.println("\nMatrix sorted column-wise in ascending order using bubble sort: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  static public void selection_sort(int ar[][], int n){
    int ar1[][] = new int[n][n];

    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        ar1[i][j] = ar[j][i];
      }
    }

    System.out.println("\nTranspose Matrix: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.print(ar1[i][j]+"\t");
      }
      System.out.println();
    }

    int temp=0, min=0;
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length-1;j++){
        min = j;
        for(int k=j+1;k<ar1[i].length;k++){
          if(ar1[i][k] < ar1[i][min]){
            min = k;
          }
        }
        temp = ar1[i][j];
        ar1[i][j] = ar1[i][min];
        ar1[i][min] = temp;
      }
    }

    System.out.println("\nTranspose Matrix sorted row-wise using selection sort: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.print(ar1[i][j]+"\t");
      }
      System.out.println();
    }

    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        ar[i][j] = ar1[j][i];
      }
    }

    System.out.println("\nMatrix sorted column-wise in ascending order using selection sort: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("The values must be greater than 1.");
    System.out.println("\nEnter the number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter the number of columns: ");
    int m = sc.nextInt();
    if((n < 2) || (m < 2) || (n != m)){
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

    System.out.println("\nSorting column-wise matrix: ");
    System.out.println("Enter 1 to sort using Bubble sort.");
    System.out.println("Enter 2 to sort using Selection sort.");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    switch(ch){
      case 1: bubble_sort(ar, n); break;
      case 2: selection_sort(ar, n); break;
      default: System.out.println("\nInvalid Input!");
    }
    sc.close();
  }
}