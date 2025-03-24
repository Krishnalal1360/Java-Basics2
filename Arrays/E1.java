import java.util.Scanner;

public class E1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();
    int ar[] = new int[n];
    System.out.println("\nEnter unique or duplicate elements: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
    System.out.println("\nArray 1-D: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    int temp=0;
    for(int i=0;i<ar.length-1;i++){
      temp = ar[i];
      for(int j=i+1;j<ar.length;j++){
        if(ar[j] < ar[i]){
          ar[i] = ar[j];
          ar[j] = temp;
          temp = ar[i];
        }
      }
    }
    System.out.println("\nArray 1-D after sorting: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    int cd=0;
    for(int i=0;i<ar.length-1;i++){
      if(ar[i] == ar[i+1]){
        cd = cd+1;
      }
    }
    System.out.println("\nNumber of duplicate elements: "+cd);

    int ar1[] = new int[n-cd];
    int index=0;
    for(int i=0;i<ar.length-1;i++){
      if(ar[i] == ar[i+1]){
        continue;
      }else if(ar[i] != ar[i+1]){
        ar1[index] = ar[i];
        index = index+1;
      }
    }
    ar1[index] = ar[ar.length-1];

    System.out.println("\nArray 1-D after removing duplicates: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }
    sc.close();
  }
}
