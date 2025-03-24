import java.util.Scanner;

public class E19 {

  static public String p1="", p2="";

  static public void tic_tac_toe(int ar[][], int index1, int index2, int m){
    int flag1=0, flag2=0;
    for(int i=0;i<ar.length;i++){
      if(index1 == i){
        flag1 = 1;
      }
      if(index2 == i){
        flag2 = 1;
      }
    }
    if((flag1 == 0) || (flag2 == 0)){
      System.out.println("\nInvalid move!");
      System.exit(0);
    }
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if((i == index1) && (j == index2)){
          if(ar[i][j] != 0){
            System.out.println("\nInvalid move!");
            System.exit(0);
          }else{
            ar[i][j] = m;
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
    int flag=0;

    if(m == 9){
      for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[i].length;j++){
          if((ar[i][j] == m) && (ar[i][j+1] == m) && (ar[i][j+2] == m)){
            System.out.println("\nPlayer 1 "+p1+" wins!");
            System.exit(0);
          }else{
            break;
          }
        }
      }
      for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[i].length;j++){
          if((ar[j][i] == m) && (ar[j+1][i] == m) && (ar[j+2][i] == m)){
            System.out.println("\nPlayer 1 "+p1+" wins!");
            System.exit(0);
          }else{
            break;
          }
        }
      }
      flag=0;
      for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[i].length;j++){
          if(i == j){
            if(ar[i][j] == m){
              flag = flag+1;
            }
          }
        }
      }
      if(flag == 3){
        System.out.println("\nPlayer 1 "+p1+" wins!");
        System.exit(0);
      }
      flag=0;
      for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[i].length;j++){
          if(i+j == ar.length-1){
            if(ar[i][j] == m){
              flag = flag+1;
            }
          }
        }
      }
      if(flag == 3){
        System.out.println("\nPlayer 1 "+p1+" wins!");
        System.exit(0);
      }
    }else if(m == 6){
      for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[i].length;j++){
          if((ar[i][j] == m) && (ar[i][j+1] == m) && (ar[i][j+2] == m)){
            System.out.println("\nPlayer 2 "+p2+" wins!");
            System.exit(0);
          }else{
            break;
          }
        }
      }
      for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[i].length;j++){
          if((ar[j][i] == m) && (ar[j+1][i] == m) && (ar[j+2][i] == m)){
            System.out.println("\nPlayer 2 "+p2+" wins!");
            System.exit(0);
          }else{
            break;
          }
        }
      }
      flag=0;
      for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[i].length;j++){
          if(i == j){
            if(ar[i][j] == m){
              flag = flag+1;
            }
          }
        }
      }
      if(flag == 3){
        System.out.println("\nPlayer 2 "+p2+" wins!");
        System.exit(0);
      }
      flag=0;
      for(int i=0;i<ar.length;i++){
        for(int j=0;j<ar[i].length;j++){
          if(i+j == ar.length-1){
            if(ar[i][j] == m){
              flag = flag+1;
            }
          }
        }
      }
      if(flag == 3){
        System.out.println("\nPlayer 2 "+p2+" wins!");
        System.exit(0);
      }
    }
    flag=0;
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        if(ar[i][j] == 0){
          flag = 1;
          break;
        }
      }
    }
    if(flag == 0){
      System.out.println("\nMatch Draw!");
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of rows must be equal to number of columns.");
    System.out.println("Their value must be 3.");
    System.out.println("\nEnter number of rows: ");
    int n = sc.nextInt();
    System.out.println("\nEnter number of columns: ");
    int m = sc.nextInt();
    if((n != 3) || (m != 3) || (n != m)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[][] = new int[n][m];

    System.out.println("\n*****Welcome to the Tick-Tack-Toe game show for 3x3 Matrix*****");

    System.out.println("\nMatrix is initialized with 0 only.");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        ar[i][j] = 0;
      }
    }

    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }

    System.out.println("\nEnter Player 1 name: ");
    p1 = sc.next();
    System.out.println("\nEnter Player 2 name: ");
    p2 = sc.next();

    System.out.println("\nRule: The Player 1 will go first.");
    System.out.println("The Player 1 must use marker as 9.");
    System.out.println("The Player 2 must use marker as 6.");

    int flag=0, index1=0, index2=0;
    for(int i=1;i<=9;i++){
      System.out.println("\nIndexes are:\n(0,0), (0,1), (0,2)\n(1,0), (1,1), (1,2)\n(2,0), (2,1), (2,2)");
      if(flag == 0){
        System.out.println("\nPlayer 1 "+p1+" your turn!");
        System.out.println("Enter row index: ");
        index1 = sc.nextInt();
        System.out.println("Enter column index: ");
        index2 = sc.nextInt();
        tic_tac_toe(ar, index1, index2, 9);
        flag = 1;
      }else if(flag == 1){
        System.out.println("\nPlayer 2 "+p2+" your turn!");
        System.out.println("Enter row index: ");
        index1 = sc.nextInt();
        System.out.println("Enter column index: ");
        index2 = sc.nextInt();
        tic_tac_toe(ar, index1, index2, 6);
        flag = 0;
      }
    }
    sc.close();
  }
}