import java.util.Scanner;
import java.lang.Integer;

public class Merging_1D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for first array: ");
    int n = sc.nextInt();
    int ar1[] = new int[n];
    System.out.println("\nEnter elements for first array: ");
    for(int i=0;i<ar1.length;i++){
      System.out.print("Enter element at location ar1["+i+"]: ");
      ar1[i] = sc.nextInt();
      System.out.println();
    }
    System.out.println("\nFirst 1-D Array: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }
    System.out.println("\nEnter size for second array: ");
    int m = sc.nextInt();
    int ar2[] = new int[m+1];
    ar2[0] = Integer.MIN_VALUE;
    System.out.println("\nEnter elements for second array: ");
    for(int i=1;i<ar2.length;i++){
      System.out.print("Enter element at location ar2["+i+"]: ");
      ar2[i] = sc.nextInt();
      System.out.println();
    }
    System.out.println("\nSecond 1-D Array: ");
    for(int i=1;i<ar2.length;i++){
      System.out.println("ar2["+i+"]="+ar2[i]);
    }
    int min=0, temp=0;
    for(int i=0;i<ar1.length-1;i++){
      min = i;
      for(int j=i+1;j<ar1.length;j++){
        if(ar1[j] < ar1[min]){
          min = j;
        }
      }
      temp = ar1[i];
      ar1[i] = ar1[min];
      ar1[min] = temp;
    }
    System.out.println("\nFirst 1-D Array sorted using Selection Sort: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }
    int ptr=0;
    temp=0;
    for(int i=1;i<ar2.length;i++){
      temp = ar2[i];
      ptr = i-1;
      while(ar2[ptr] > temp){
        ar2[ptr+1] = ar2[ptr];
        ptr = ptr-1;
      }
      ar2[ptr+1] = temp;
    }
    System.out.println("\nSecond 1-D Array sorted using Insertion Sort: ");
    for(int i=1;i<ar2.length;i++){
      System.out.println("ar2["+i+"]="+ar2[i]);
    }
    int ar3[] = new int[n+m];
    int i=0, j=1, k=0;
    while((i < n) && (j < m+1)){
      if(ar1[i] < ar2[j]){
        ar3[k] = ar1[i];
        k = k+1;
        i = i+1;
      }else if(ar1[i] > ar2[j]){
        ar3[k] = ar2[j];
        k = k+1;
        j = j+1;
      }else if(ar1[i] == ar2[j]){
        ar3[k] = ar1[i];
        k = k+1;
        i = i+1;
        ar3[k] = ar2[j];
        k = k+1;
        j = j+1;
      }
    }

    if(i == ar1.length){
      while(j < m+1){
        ar3[k] = ar2[j];
        k = k+1;
        j = j+1;
      }
    }else if(j == ar2.length){
      while(i < n){
        ar3[k] = ar1[i];
        k = k+1;
        i = i+1;
      }
    }
    System.out.println("\nThird 1-D Array after merging first and second array in sorted order: ");
    for(int l=0;l<ar3.length;l++){
      System.out.println("ar3["+l+"]="+ar3[l]);
    }
    sc.close();
  }
}