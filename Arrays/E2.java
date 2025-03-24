import java.util.Scanner;

public class E2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The size of array must be odd.");
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();
    if(n%2 == 0){
      System.out.println("\nSize of array must be odd.");
      System.exit(0);
    }
    int ar[] = new int[n];
    System.out.println("\nEnter unique elements: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
    for(int i=0;i<ar.length-1;i++){
      if(ar[i] == ar[i+1]){
        System.out.println("\nDuplicate elements are not allowed.");
        System.exit(0);
      }
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

    int ar1[] = new int[n];
    ar1[n/2] = ar[ar.length-1];
    int flag=0, index1=(n/2)+1, index2=(n/2)-1;
    for(int i=ar.length-2;i>=0;i--){
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
    System.out.println("\nModified Array 1-D: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }
    sc.close();
  }
}