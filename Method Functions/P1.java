import java.util.Scanner;

public class P1{

  static public int[] primeFactors(int n){
    int ar[] = new int[n];
    int flag=0, dup=0, index=0;
    for(int i=2;i<=n;i++){
      flag=0;
      inner:
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          flag = 1;
          break inner;
        }
      }
      if(flag == 0){
        dup=n;
        while(dup > 0){
          if(dup%i == 0){
            ar[index] = i;
            index = index+1;
            dup = dup/i;
          }else{
            break;
          }
        }
      }
    }
    return ar;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number must be greater than 3.");
    System.out.println("\nEnter a number: ");
    int n = sc.nextInt();
    if(n < 4){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    System.out.println("\nNumber: "+n);

    int ar[] = primeFactors(n);

    if(ar[0] == 0){
      System.out.println("\nNo prime factors of "+n);
    }else{
      System.out.println("\nPrime factors of "+n+" are: ");
      for(int i=0;i<ar.length;i++){
        if(ar[i] == 0){
          break;
        }else{
          System.out.println(ar[i]);
        }
      }
    }
    sc.close();
  }
}