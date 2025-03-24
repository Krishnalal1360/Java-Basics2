import java.util.Scanner;

public class E13 {
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

    System.out.println("\nEnter the elements for the matrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print("Enter element at location ar["+i+"]["+j+"]: ");
        ar[i][j] = sc.nextInt();
        System.out.println();
      }
    }

    System.out.println("\nThe matrix is: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }

    int lds=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(i == j){
          lds = lds+ar[i][j];
        }
      }
    }

    int rds=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if((i+j) == (ar.length-1)){
          rds = rds+ar[i][j];
        }
      }
    }

    if(lds != rds){
      System.out.println("\nIt's not a magic matrix.");
      System.exit(0);
    }

    int rs=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        rs = rs+ar[i][j];
      }
      if(rs != lds){
        System.out.println("\nIt's not a magic matrix.");
        System.exit(0);
      }
      rs = 0;
    }

    int cs=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        cs = cs+ar[j][i];
      }
      if(cs != lds){
        System.out.println("\nIt's not a magic matrix.");
        System.exit(0);
      }
      cs = 0;
    }

    System.out.println("\nIt's a magic matrix.");
    sc.close();
  }
}