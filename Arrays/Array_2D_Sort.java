import java.util.Scanner;

public class Array_2D_Sort {

  static public void row_bubble(int ar[][]){
    int temp = 0;
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

    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  static public void column_selection(int ar[][]){
    int min=0, temp=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length-1;j++){
        min = j;
        for(int k=j+1;k<ar[i].length;k++){
          if(ar[k][i] < ar[min][i]){
            min = k;
          }
        }
        temp = ar[j][i];
        ar[j][i] = ar[min][i];
        ar[min][i] = temp;
      }
    }

    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  static public void left_diagonal_insertion(int ar[][], int n){
    int ar1[] = new int[n+1];
    ar1[0] = -9999;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(i == j){
          ar1[i+1] = ar[i][j];  
        }
      }
    }

    int temp=0, ptr=0;
    for(int i=1;i<ar1.length;i++){
      temp=ar1[i];
      ptr=i-1;
      while(ar1[ptr] > temp){
        ar1[ptr+1] = ar1[ptr];
        ptr = ptr-1;
      }
      ar1[ptr+1] = temp;
    }

    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(i == j){
          ar[i][j] = ar1[i+1];
        }
      }
    }

    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  static public void right_diagonal_insertion(int ar[][], int n){
    int ar1[] = new int[n+1];
    ar1[0] = -9999;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(i+j == ar.length-1){
          ar1[i+1] = ar[i][j];  
        }
      }
    }

    int temp=0, ptr=0;
    for(int i=1;i<ar1.length;i++){
      temp=ar1[i];
      ptr=i-1;
      while(ar1[ptr] > temp){
        ar1[ptr+1] = ar1[ptr];
        ptr = ptr-1;
      }
      ar1[ptr+1] = temp;
    }

    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(i+j == ar.length-1){
          ar[i][j] = ar1[i+1];
        }
      }
    }

    System.out.println("\nMatrix: ");
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
        System.out.print("Enter the element at location ar["+i+"]["+j+"]: ");
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

    System.out.println("\nEnter 1 to sort row-wise using Bubble sort.");
    System.out.println("Enter 2 to sort column-wise using Selection sort.");
    System.out.println("Enter 3 to sort left-diagonal using Insertion sort.");
    System.out.println("Enter 4 to sort right-diagonal using Insertion sort.");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    switch(ch){
      case 1: row_bubble(ar); break;
      case 2: column_selection(ar); break;
      case 3: left_diagonal_insertion(ar, n); break;
      case 4: right_diagonal_insertion(ar, n); break;
      default: System.out.println("\nInvalid Input!");
    }
    sc.close();
  }
}