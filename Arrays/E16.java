import java.util.Scanner;

public class E16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("The values must be greater than 1.");
    System.out.println("\nEnter number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
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

    int temp=0;
    for(int i=0;i<ar.length;i++){
      if((i == 0) || (i == ar.length-1)){
        continue;
      }
      for(int j=1;j<ar[i].length-2;j++){
        temp = ar[i][j];
        for(int k=j+1;k<ar[i].length-1;k++){
          if(ar[i][k] < ar[i][j]){
            ar[i][j] = ar[i][k];
            ar[i][k] = temp;
            temp = ar[i][j];
          }
        }
      }
    }

    System.out.println("\nMatrix after non-boundary elements sorted in ascending order: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }

    System.out.println("\nMatrix with only diagonal elements: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if((i == j) || (i+j == ar.length-1)){
          System.out.print(ar[i][j]+"\t");
        }else{
          System.out.print("\t");
        }
      }
      System.out.println();
    }

    int lds=0, rds=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(i == j){
          lds = lds+ar[i][j];
        }
        if(i+j == ar.length-1){
          rds = rds+ar[i][j]; 
        }
      }
    }
    System.out.println("\nSum of left diagonal elements: "+lds);
    System.out.println("\nSum of right diagonal elements: "+rds);
    sc.close();
  }
}
