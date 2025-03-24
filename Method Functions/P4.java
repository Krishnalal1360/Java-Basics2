import java.util.Scanner;
import java.lang.String;

public class P4{

  static public void merge(String ar1[], String ar2[], String ar3[]){
    int i, j, k;
    i=j=k=0;
    while((i < ar1.length) && (j < ar2.length)){
      if(ar1[i].compareTo(ar2[j]) < 0){
        ar3[k] = ar1[i];
        k = k+1;
        i = i+1;
      }else if(ar2[j].compareTo(ar1[i]) < 0){
        ar3[k] = ar2[j];
        k = k+1;
        j = j+1;
      }else{
        ar3[k] = ar1[i];
        k = k+1;
        i = i+1;
        j = j+1;
      }
    }
    while(i < ar1.length){
      ar3[k] = ar1[i];
      k = k+1;
      i = i+1;
    }
    while(j < ar2.length){
      ar3[k] = ar2[j];
      k = k+1;
      j = j+1;
    }     
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for first array: ");
    int n = sc.nextInt();
    System.out.println("\nEnter size for second array: ");
    int m = sc.nextInt();
    String ar1[] = new String[n];
    String ar2[] = new String[m];

    System.out.println("\nEnter names for first array: ");
    for(int i=0;i<ar1.length;i++){
      System.out.print("Enter name at location ar1["+i+"]: ");
      ar1[i] = sc.next();
      System.out.println();
    }

    System.out.println("\nEnter names for second array: ");
    for(int i=0;i<ar2.length;i++){
      System.out.print("Enter name at location ar2["+i+"]: ");
      ar2[i] = sc.next();
      System.out.println();
    }

    System.out.println("\nFirst Array: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }

    System.out.println("\nSecond Array: ");
    for(int i=0;i<ar2.length;i++){
      System.out.println("ar2["+i+"]="+ar2[i]);
    }

    String temp="";
    for(int i=0;i<ar1.length-1;i++){
      temp = ar1[i];
      for(int j=i+1;j<ar1.length;j++){
        if(ar1[j].compareTo(ar1[i]) < 0){
          ar1[i] = ar1[j];
          ar1[j] = temp;
          temp = ar1[i];
        }
      }
    }

    temp="";
    for(int i=0;i<ar2.length-1;i++){
      temp = ar2[i];
      for(int j=i+1;j<ar2.length;j++){
        if(ar2[j].compareTo(ar2[i]) < 0){
          ar2[i] = ar2[j];
          ar2[j] = temp;
          temp = ar2[i];
        }
      }
    }

    System.out.println("\nFirst Array after sorting in alphabetical order: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }

    System.out.println("\nSecond Array after sorting in alphabetical order: ");
    for(int i=0;i<ar2.length;i++){
      System.out.println("ar2["+i+"]="+ar2[i]);
    }

    String ar3[] = new String[n+m];

    merge(ar1, ar2, ar3);

    System.out.println("\nMerged Array: ");
    for(int i=0;i<ar3.length;i++){
      System.out.println("ar3["+i+"]="+ar3[i]);
    }
    sc.close();
  }
}