import java.util.Scanner;

public class P8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("The values must be greater than 1.");
    System.out.println("In Lower Triangular Matrix the elements on left diagonal and below it should be non-zero.");
    System.out.println("The elements above it should be zero.");
    System.out.println("\nEnter the number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter the number of columns: ");
    int m = sc.nextInt();
    if((n < 2) || (m < 2) || (n != m)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[][] = new int[n][m];

    System.out.println("\nEnter the elements for the matrix: ");
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

    int flag=0;
    outer:
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if((i == j) || (i > j)){
          if(ar[i][j] != 0){
            continue;
          }else{
            flag = 1;
            break outer;
          }
        }else if(i < j){
          if(ar[i][j] == 0){
            continue;
          }else{
            flag = 1;
            break outer;
          }
        }
      }
    }

    if(flag == 0){
      System.out.println("\nIt is a Lower Triangular Matrix.");
    }else if(flag == 1){
      System.out.println("\nIt is not a Lower Triangular Matrix.");
    }
    sc.close();
  }
}