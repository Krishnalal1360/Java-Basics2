import java.util.Scanner;

public class P11{

  static public void merge(int ar1[], int ar2[], int ar[]){
    for(int i=0;i<ar1.length;i++){
      ar[i] = ar1[i];
    }
    for(int j=0;j<ar2.length;j++){
      ar[ar1.length+j] = ar2[j];
    }
  }

  static public void sort(int ar[]){
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
  }

  static public void sortOddEven(int ar[], int oc, int ec){
    int ar1[] = new int[oc];
    int ar2[] = new int[ec];
    int index1=0, index2=0;
    for(int i=0;i<ar.length;i++){
      if(ar[i]%2 == 0){
        ar2[index2] = ar[i];
        index2 = index2+1;
      }else{
        ar1[index1] = ar[i];
        index1 = index1+1;
      }
    }
    sort(ar1);
    sort(ar2);
    merge(ar1, ar2, ar);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Must enter both odd and even numbers.");
    System.out.println("\nEnter size for the array: ");
    int n = sc.nextInt();

    int ar[] = new int[n];

    int oc=0, ec=0;
    System.out.println("\nEnter elements for the array: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      if(ar[i]%2 == 0){
        ec = ec+1;
      }else{
        oc = oc+1;
      }
      System.out.println();
    }
    if((ec == 0) || (oc == 0)){
      System.out.println("\nInvalid Input!");
      System.out.println("Must enter both odd and even numbers.");
      System.exit(0);
    }

    System.out.println("\nArray: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    sortOddEven(ar, oc, ec);

    System.out.println("\nArray after sorting odd and even numbers: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    sc.close();
  }
}