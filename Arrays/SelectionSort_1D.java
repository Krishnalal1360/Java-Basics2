import java.util.Scanner;

public class SelectionSort_1D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();
    int ar[] = new int[n];
    System.out.println("\nEnter elements: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }
    System.out.println("\nArray 1-D: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    int min=0, temp=0;
    for(int i=0;i<ar.length-1;i++){
      min = i;
      for(int j=i+1;j<ar.length;j++){
        if(ar[j] < ar[min]){
          min = j;
        }
      }
      temp = ar[i];
      ar[i] = ar[min];
      ar[min] = temp;
    }
    System.out.println("\nArray 1-D after sorting: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    sc.close();
  }
}