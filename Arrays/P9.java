import java.util.Scanner;

public class P9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("The values must be greater than 1.");
    System.out.println("In Scalar Matrix the elements on the left diagonal must be same and non-zero.");
    System.out.println("The other elements must be 0.");
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

    if(ar[0][0] == 0){
      System.out.println("\nIt is not a Scalar Matrix.");
      System.exit(0);
    }

    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(i == j){
          if(ar[i][j] != ar[0][0]){
            System.out.println("\nIt is not a Scalar Matrix.");
            System.exit(0);
          }else{
            continue;
          }
        }else if(i != j){
          if(ar[i][j] != 0){
            System.out.println("\nIt is not a Scalar Matrix.");
            System.exit(0);
          }else{
            continue;
          }
        }
      }
    }

    System.out.println("\nIt is a Scalar Matrix.");
    sc.close();
  }
}
