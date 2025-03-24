import java.util.Scanner;

public class P2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The size of the array must be greater than 0.");
    System.out.println("The size must be odd.");
    System.out.println("\nEnter the size of the array: ");
    int n = sc.nextInt();
    if((n < 1) || (n%2 == 0)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[] = new int[n];

    System.out.println("\nEnter elements for the array.");
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
    for(int i=0;i<ar.length;i++){
      temp = ar[i];
      for(int j=i+1;j<ar.length;j++){
        if(ar[j] < ar[i]){
          ar[i] = ar[j];
          ar[j] = temp;
          temp = ar[i];
        }
      }
    }

    System.out.println("\nArray 1-D after sorting in ascending order using Bubble sort: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    int ar1[] = new int[n];
    ar1[n/2] = ar[0];

    int flag=0, index1=(n/2)+1, index2=(n/2)-1;
    for(int i=1;i<ar.length;i++){
      if(flag == 0){
        ar1[index1] = ar[i];
        index1 = index1+1;
        flag = 1;
      }else if(flag == 1){
        ar1[index2] = ar[i];
        index2 = index2-1;
        flag = 0;
      }
    }

    System.out.println("\nNew 1-D array: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }
    sc.close();
  }
}