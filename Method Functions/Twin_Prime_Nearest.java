import java.util.Scanner;
import java.lang.Integer;
 
public class Twin_Prime_Nearest {

  static public int prime(int n){
    int flag=0;
    for(int i=2;i<=n/2;i++){
      if(n%i == 0){
        flag = 1;
        break;
      }
    }
    if(flag == 0){
      return 1;
    }else{
      return 0;
    }
  }

  static public int[] forwardPrime(int n){
    int ar1[] = new int[2];
    int flag=0, flag1=0;
    for(int i=n+1;i<=Integer.MAX_VALUE;i++){
      flag=0;
      inner:
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          flag = 1;
          break inner;
        }
      }
      if(flag == 0){
        flag1 = prime(i+2);
        if(flag1 == 1){
          ar1[0] = i;
          ar1[1] = i+2;
          return ar1;
        }else{
          continue;
        }
      }
    }
    return ar1;
  }

  static public int[] backwardPrime(int n){
    int ar2[] = new int[2];
    int flag=0, flag1=0;
    for(int i=n-1;i>=2;i--){
      flag=0;
      inner:
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          flag = 1;
          break inner;
        }
      }
      if(flag == 0){
        flag1 = prime(i-2);
        if(flag1 == 1){
          ar2[0] = i-2;
          ar2[1] = i;
          return ar2;
        }else{
          continue;
        }
      }
    }
    return ar2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number must be non-prime.");
    System.out.println("The value must be greater than 5.");
    System.out.println("\nEnter a number: ");
    int n = sc.nextInt();
    int flag=0;
    for(int i=2;i<=n/2;i++){
      if(n%i == 0){
        flag = 1;
        break;
      }
    }
    if(flag == 0){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int ar1[] = forwardPrime(n);
    int ar2[] = backwardPrime(n);
    System.out.println("\nTwin primes after "+n+" are:");
    System.out.println(ar1[0]+"\t"+ar1[1]);
    System.out.println("\nTwin primes before "+n+" are:");
    System.out.println(ar2[0]+"\t"+ar2[1]);
    if((n-ar2[0]) < (ar1[0]-n)){
      System.out.println("\nNearest Twin Prime: "+ar2[0]+"\t"+ar2[1]);
    }else if((n-ar2[0]) > (ar1[0]-n)){
      System.out.println("\nNearest Twin Prime: "+ar1[0]+"\t"+ar1[1]);
    }else{
      System.out.println("\nNearest Twin Prime: ");
      System.out.println(ar2[0]+"\t"+ar2[1]);
      System.out.println(ar1[0]+"\t"+ar1[1]);
    }
    sc.close();
  }
}