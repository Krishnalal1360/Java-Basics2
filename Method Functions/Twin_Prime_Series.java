import java.util.Scanner;

public class Twin_Prime_Series {

  static public int prime(int n){
    int flag=0;
    for(int i=2;i<=n/2;i++){
      if(n%i == 0){
        flag = 1;
        break;
      }else{
        flag = 0;
      }
    }
    if(flag == 0){
      return 1;
    }else{
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The lower limit must be less than upper limit.");
    System.out.println("Their values must be greater than 1.");
    System.out.println("\nEnter lower limit: ");
    int l = sc.nextInt();
    System.out.println("\nEnter upper limit: ");
    int u = sc.nextInt();

    if((l >= u) || (l < 2) || (u < 2)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int flag1=0, flag2=0, n=0;
    double s=0;
    System.out.println("\nTwin Primes between "+l+" and "+u);
    for(int i=l;i<=u;i++){
      flag1 = prime(i);
      if(flag1 == 1){
        n = i+2;
        if(n > u){
          break;
        }else{
          flag2 = prime(n);
          if(flag2 == 1){
            System.out.println(i+" "+n);
            s = s+(i*1.0/n*1.0);
          }
        }
      }
    }

    System.out.println("\nSum: "+s);
    sc.close();
  }
}