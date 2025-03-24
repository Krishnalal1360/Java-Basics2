import java.util.Scanner;

public class E14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("The values must be greater than 0.");
    System.out.println("\nEnter number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    int m = sc.nextInt();
    if((n < 0) || (m < 0) || (n != m)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[][] = new int[n][m];

    System.out.println("\nEnter elements for the matrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print("\nEnter element at location ar["+i+"]["+j+"]: ");
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
        if(i != j){
          if(ar[i][j] != ar[j][i]){
            flag = 1;
            break outer;
          }
        }
      }
    }
    if(flag == 0)
      System.out.println("\nIt's a symmetric matrix.");
    else if(flag == 1)
      System.out.println("\nIt's not a symmetric matrix.");
  
    int lds=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(i == j){
          lds = lds+ar[i][j];
        }
      }
    }
    System.out.println("\nLeft Diagonal Sum: "+lds);

    int rds=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if((i+j) == (ar.length-1)){
          rds = rds+ar[i][j];
        }
      }
    }
    System.out.println("\nRight Diagonal Sum: "+rds);
    sc.close();
  }
}