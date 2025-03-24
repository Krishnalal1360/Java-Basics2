import java.util.Scanner;

public class P19{

  static public int freq=0;

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

  static public void rule1(int n){
    int p1, p2, p3, f1=0, f2=0, f3=0;
    p1 = n;
    p2 = n+2;
    p3 = n+6;
    f1 = prime(p1);
    f2 = prime(p2);
    f3 = prime(p3);
    if((f1 == 1) && (f2 == 1) && (f3 == 1)){
      System.out.println(p1+", "+p2+", "+p3);
      freq = freq+1;
    }
  }

  static public void rule2(int n){
    int p1, p2, p3, f1=0, f2=0, f3=0;
    p1 = n;
    p2 = n+4;
    p3 = n+6;
    f1 = prime(p1);
    f2 = prime(p2);
    f3 = prime(p3);
    if((f1 == 1) && (f2 == 1) && (f3 == 1)){
      System.out.println(p1+", "+p2+", "+p3);
      freq = freq+1;
    }
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

    System.out.println("\nEnter 1 to use rule (n, n+2, n+6).");
    System.out.println("Enter 2 to use rule (n, n+4, n+6).");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    System.out.println("\nPrime Triplets between "+n+" and "+m+" are: ");
    switch(ch){
      case 1:
      for(int i=n;i<=m;i++){
        rule1(i);
      }
      break;
      case 2:
      for(int i=n;i<=m;i++){
        rule2(i);
      }
      break;
      default: 
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    System.out.println("\nFrequency: "+freq);
    sc.close();
  }
}