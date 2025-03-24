import java.util.Scanner;

public class P6{

  static public int sumOfDigits(int n){
    int s=0, r=0, dup=0;
    dup=n;
    while(dup > 0){
      r = dup%10;
      s = s+r;
      dup = dup/10;
    }
    System.out.println("\nSum of digits of "+n+" is "+s);
    int flag=0;
    for(int i=2;i<=s/2;i++){
      if(s%i == 0){
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

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a number greater than 1: ");
    int n = sc.nextInt();
    if(n < 2){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int r=0;
    r = sumOfDigits(n);
    if(r == 1){
      System.out.println("\nSum of digits of "+n+" is Prime");
    }else{
      System.out.println("\nSum of digits of "+n+" is not Prime");
    }
    sc.close();
  }
}