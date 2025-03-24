import java.util.Scanner;

public class Combinations {

  static public int[] combinations(int j, int dup, int n){
    int ar[] = new int[dup];
    int ar1[] = new int[dup];
    int s=0, index=0;
    for(int i=j;i<=dup;i++){
      s = s+i;
      ar[index] = i;
      index = index+1;
      if(s == n){
        return ar;
      }
    }
    return ar1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Enter a natural number.");
    int n = sc.nextInt();
    if(n < 1){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int dup=n;
    if(dup%2 == 0){
      dup = dup/2;
    }else{
      dup = (dup/2)+1;
    }

    int i=1;
    int ar[] = new int[dup];
    while(i <= dup){
      ar = combinations(i, dup, n);
      if(ar[0] != 0){
        System.out.println("\nCombination is: ");
        for(int j=0;j<ar.length;j++){
          if(ar[j] != 0){
            System.out.print(ar[j]+"\t");
          }else{
            break;
          }
        }
      }
      i = i+1;
    }
    sc.close();
  }
}