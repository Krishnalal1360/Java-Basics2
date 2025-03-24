import java.util.Scanner;

public class Sphenic_Number{

  static public int freq=0;

  static public void sphenic(int ar[], int n){
    int prod=1;
    for(int i=0;i<ar.length;i++){
      prod = prod*ar[i];
    }
    if(prod == n){
      System.out.print(n+"\t");
      freq = freq+1;
    }
  }

  static public void primeFactors(int n){
    int ar[] = new int[3];
    int flag=0, index=0;
    outer:
    for(int i=2;i<=n/2;i++){
      inner:
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          flag = 1;
          break inner;
        }
      }
      if(flag == 0){
        if(n%i == 0){
          ar[index] = i;
          index = index+1;
        }
      }
      if(index == ar.length){
        break outer;
      }
      flag = 0;
    }
    sphenic(ar, n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter lower limit greater than 1: ");
    int n = sc.nextInt();
    System.out.println("\nEnter upper limit: ");
    int m = sc.nextInt();
    if(n <= 1){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    System.out.println("\nSphenic Numbers between "+n+" and "+m+" are: \n");
    for(int i=n;i<=m;i++){
      primeFactors(i);
    }

    System.out.println("\n\nFrequency: "+freq);
    sc.close();
  }
}