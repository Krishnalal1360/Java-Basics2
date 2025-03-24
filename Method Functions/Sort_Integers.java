import java.util.Scanner;

public class Sort_Integers{

  static public void bubble(int ar[]){
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

  static public void selection(int ar[]){
    int temp=0, min=0;
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
  }

  static public void insertion(int ar[], int n){
    int ar1[] = new int[n+1];
    ar1[0] = Integer.MIN_VALUE;
    for(int i=1;i<ar1.length;i++){
      ar1[i] = ar[i-1];
    }
    int temp=0, ptr=0;
    for(int i=1;i<ar1.length;i++){
      temp = ar1[i];
      ptr = i-1;
      while(ar1[ptr] > temp){
        ar1[ptr+1] = ar1[ptr];
        ptr = ptr-1;
      }
      ar1[ptr+1] = temp;
    }
    for(int i=0;i<ar.length;i++){
      ar[i] = ar1[i+1];
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The size must be greater than 1.");
    System.out.println("The elements can be positive or negative or both.");
    System.out.println("\nEnter size for the array: ");
    int n = sc.nextInt();
    if(n < 2){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[] = new int[n];

    System.out.println("\nEnter elements for the array: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      System.out.println();
    }

    System.out.println("\nArray before sorting: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    System.out.println("\nEnter 1 to sort array using Bubble sort.");
    System.out.println("Enter 2 to sort array using Selection sort.");
    System.out.println("Enter 3 to sort array using Insertion sort.");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();  
    switch(ch){
      case 1:
      bubble(ar);
      break;
      case 2:
      selection(ar);
      break;
      case 3:
      insertion(ar, n);
      break;
      default: 
      System.out.println("\nInvalid Choice!");
      System.exit(0);
    }

    System.out.println("\nArray after sorting: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    sc.close();
  }
}