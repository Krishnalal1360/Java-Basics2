import java.util.Scanner;
import java.lang.Integer;

public class P19{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("The values must be greater than 0.");
    System.out.println("The saddle point is an element which is minimum in a row and as well as maximum in a column.");
    System.out.println("It must be unique.");
    System.out.println("The number of saddle points is equal to number of rows in a matrix.");
    System.out.println("\nEnter the number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter the number of columns: ");
    int m = sc.nextInt();
    if((n < 1) || (m < 1) || (n != m)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[][] = new int[n][m];

    System.out.println("\nEnter positive elements for the matrix.");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print("Enter element at location ar["+i+"]["+j+"]: ");
        ar[i][j] = sc.nextInt();
        if((ar[i][j] > 0) == false){
          System.out.println("\nInvalid Input!");
          System.exit(0);
        }
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

    int ar1[] = new int[n];

    int min, col_index=0, index=0, flag=0;
    min = Integer.MAX_VALUE;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(ar[i][j] < min){
          min = ar[i][j];
          col_index = j;
        }
      }
      inner:
      for(int k=0;k<n;k++){
        if(k != col_index){
          if(min > ar[k][i]){
            continue;
          }else{
            flag = 1;
            break inner;
          }
        }
      }
      if(flag == 0){
        ar1[index] = min;
        index = index+1;
      }
      flag = 0;
    }

    int freq=0;
    System.out.println("\nSaddle point/s in the matrix is/are: ");
    for(int i=0;i<ar1.length;i++){
      if(ar1[i] == 0){
        continue;
      }else{
        freq = freq+1;
        System.out.println(ar1[i]);
      }
    }
    if(freq == 0){
      System.out.println("No saddle point in the matrix.");
    }
    sc.close();
  }
}