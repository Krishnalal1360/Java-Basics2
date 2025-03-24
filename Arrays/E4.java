import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;

public class E4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter starting point: ");
    int n = sc.nextInt();
    System.out.println("\nEnter ending point: ");
    int m = sc.nextInt();
    if(n > m){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    int ar[] = new int[(m-n)+1];
    int index=0;
    for(int i=n;i<=m;i++){
      ar[index] = i;
      index = index+1;
    }
    System.out.println("\nArray 1-D: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    int num=0, flag=0, freq=0;
    char c1='\u0000', c2='\u0000';
    String st="";
    System.out.println("\nUnique elements inclusive between "+n+" and "+m+" are:");
    for(int i=0;i<ar.length;i++){
      num = ar[i];
      st = Integer.toString(num);
      flag = 0;
      outer:
      for(int j=0;j<st.length()-1;j++){
        c1 = st.charAt(j);
        for(int k=j+1;k<st.length();k++){
          c2 = st.charAt(k);
          if(c1 == c2){
            flag = 1;
            break outer;
          }
        }
      }
      if(flag == 0){
        freq = freq+1;
        System.out.println(num);
      }
    }
    System.out.println("\nFrequency of unique elements: "+freq);
    sc.close();
  }
}
