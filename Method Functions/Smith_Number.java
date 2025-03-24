import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;
import java.lang.Character;

public class Smith_Number{

  static public int sumOfDigits(int n){
    int sum=0;
    String st = String.valueOf(n);
    for(int i=0;i<st.length();i++){
      sum = sum+Integer.parseInt(Character.toString(st.charAt(i)));
    }
    return sum;
  }

  static public int primeFactorsOfPrime(int n){
    int sum=0;
    String st="";
    int flag=0, dup=0, count=0;
    for(int i=2;i<=n;i++){
      flag = 0;
      inner:
      for(int j=2;j<=i/2;j++){
        if(i%j == 0){
          flag = 1;
          break inner;
        }else{
          flag = 0;
        }
      }
      if(n%i == 0){
        flag = 0;
      }else{
        flag = 1;
      }
      if(flag == 0){
        dup=n;
        count=0;
        while(dup != 1){
          if(dup%i == 0){
            count = count+1;
          }else{
            break;
          }
          dup=dup/i;
        }
        if(count == 1){
          st = Integer.toString(i);
          if(st.length() == 1){
            sum = sum+Integer.valueOf(st);
          }else if(st.length() > 1){
            for(int j=0;j<st.length();j++){
              sum = sum+Integer.valueOf(Character.toString(st.charAt(j)));
            }
          }
        }else if(count > 1){
          for(int j=1;j<=count;j++){
            st = Integer.toString(i);
            if(st.length() == 1){
              sum = sum+Integer.valueOf(st);
            }else if(st.length() > 1){
              for(int k=0;k<st.length();k++){
                sum = sum+Integer.valueOf(Character.toString(st.charAt(k)));
              }
            }
          }
        }
      }
    }
    return sum;
  }

  static public int primeFactorsOfNonPrime(int n){
    int sum=0;
    String st="";
    int flag=0, dup=0, count=0;
    for(int i=2;i<n;i++){
      flag = 0;
      if(n%i == 0){
        flag = 0;
      }else{
        flag = 1;
      }
      if(flag == 0){
        for(int j=2;j<=i/2;j++){
          if(i%j == 0){
            flag = 1;
            break;
          }else{
            flag = 0;
          }
        }
        if(flag == 0){
          dup=n;
          count=0;
          while(dup != 1){
            if(dup%i == 0){
              count = count+1;
            }else{
              break;
            }
            dup=dup/i;
          }
          if(count == 1){
            st = Integer.toString(i);
            if(st.length() == 1){
              sum = sum+Integer.valueOf(st);
            }else if(st.length() > 1){
              for(int j=0;j<st.length();j++){
                sum = sum+Integer.valueOf(Character.toString(st.charAt(j)));
              }
            }
          }else if(count > 1){
            for(int j=1;j<=count;j++){
              st = Integer.toString(i);
              if(st.length() == 1){
                sum = sum+Integer.valueOf(st);
              }else if(st.length() > 1){
                for(int k=0;k<st.length();k++){
                  sum = sum+Integer.valueOf(Character.toString(st.charAt(k)));
                }
              }
            }
          }
        }
      }
    }
    return sum;
  }

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("\nNote: The lower limit must be less than upper limit.");
  System.out.println("Their values must be greater than 1.");
  System.out.println("\nEnter the lower limit: ");
  int n = sc.nextInt();
  System.out.println("\nEnter the upper limit: ");
  int m = sc.nextInt();

  if((n >= m) || (n < 2) || (m < 2)){
   System.out.println("\nInvalid Input!");
   System.exit(0);
  }

  int sum1=0, sum2=0, sum3=0, flag=0, freq=0;
  System.out.println("\nSmith Numbers between "+n+" and "+m+" are: ");
  for(int i=n;i<=m;i++){
    flag = 0;
    sum1 = sumOfDigits(i);
    for(int j=2;j<=i/2;j++){
      if(i%j == 0){
        flag = 1;
        break;
      }
    }
    if(flag == 0){
      sum2 = primeFactorsOfPrime(i);
      if(sum1 == sum2){
        System.out.print(i+" ");
        freq = freq+1;
      }
    }else{
      sum3 = primeFactorsOfNonPrime(i);
      if(sum1 == sum3){
        System.out.print(i+" ");
        freq = freq+1;
      }
    }
  }
  System.out.println("\nFrequency: "+freq);
  sc.close();
 } 
}