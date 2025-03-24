import java.util.Scanner;

public class P17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows may be equal to number of columns.");
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

    System.out.println("\nNote: The first index must be smaller than second index.");
    System.out.println("\nEnter first row index (0 to n-1) to swap it's elements with second row: ");
    int index1 = sc.nextInt();
    System.out.println("\nEnter second row index (0 to n-1) to swap it's elements with first row: ");
    int index2 = sc.nextInt();
    if((index1 >= index2) || (index1 < 0) || (index1 > (n-1)) || (index2 < 0) || (index2 > (n-1))){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int temp = 0;
    for(int i=0;i<ar.length;i++){
      if(i == index1){
        for(int j=0;j<ar[i].length;j++){
          temp = ar[i][j];
          ar[i][j] = ar[index2][j];
          ar[index2][j] = temp;
        }
      }
    }

    System.out.println("\nMatrix after inter-changing row "+index1+" with "+index2+": ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
    sc.close();
  }
}