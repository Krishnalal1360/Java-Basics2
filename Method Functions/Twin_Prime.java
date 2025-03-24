import java.util.Scanner;

public class Twin_Prime{
  public static void main(String[] args){
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

    System.out.println("\nTwin Primes between "+l+" and "+u+" are: ");
    int flag1=0, flag2=0, n=0, freq=0;
    outer:
    for(int i=l;i<=u;i++){
      flag1=0;
      inner1:
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          flag1 = 1;
          break inner1;
        }else{
          flag1 = 0;
        }
      }
      if(flag1 == 0){
        flag2=0;
        n=i+2;
        if(n > u){
          break outer;
        }else{
          inner2:
          for(int j=2;j<=n/2;j++){
            if(n%j == 0){
              flag2 = 1;
              break inner2;
            }else{
              flag2 = 0;
            }
          }
          if(flag2 == 0){
            System.out.println(i+"\t"+n);
            freq = freq+1;
          }
        }
      }
    }
    System.out.println("\nFrequency: "+freq);
    sc.close();
  }
}