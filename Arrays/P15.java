import java.util.Scanner;

public class P15 {

  static public int prime(int dup){
    int count=0;
    for(int i=dup;i<=2000;i++){
      count = 0;
      for(int j=1;j<=i;j++){
        if(i%j == 0){
          count = count+1;
        }
      }
      if(count == 2){
        return i;
      }
    }
    return 0;
  }
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

    System.out.println("\nMatrix is filling up with prime numbers: ");
    int dup=1;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        dup = prime(dup+1);
        ar[i][j] = dup;
      }
    }

    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }
    sc.close();
  }
}