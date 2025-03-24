import java.util.Scanner;

public class E17 {

  static public void bubble_sort(int ar[][]){
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

    System.out.println("\nMatrix sorted in ascending order using bubble sort: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  static public void selection_sort(int ar[][]){
    int temp=0, min=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length-1;j++){
        min = j;
        for(int k=j+1;k<ar[i].length;k++){
          if(ar[i][k] < ar[i][min]){
            min = k;
          }
        }
        temp = ar[i][j];
        ar[i][j] = ar[i][min];
        ar[i][min] = temp;
      }
    }

    System.out.println("\nMatrix sorted in ascending order using selection sort: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows may be equal to number of columns: ");
    System.out.println("The values must be greater than 1.");
    System.out.println("\nEnter the number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter the number of columns: ");
    int m = sc.nextInt();
    if((n < 2) || (m < 2)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[][] = new int[n][m];

    System.out.println("\nEnter the elements of the matrix: ");
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

    System.out.println("\nSorting row-wise matrix: ");
    System.out.println("Enter 1 to sort using Bubble sort.");
    System.out.println("Enter 2 to sort using Selection sort.");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    switch(ch){
      case 1: bubble_sort(ar); break;
      case 2: selection_sort(ar); break;
      default: System.out.println("\nInvalid Input!");
    }
    sc.close();
  }
}