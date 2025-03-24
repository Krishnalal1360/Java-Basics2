import java.util.Scanner;
import java.lang.Math;

public class Search_Marks{

  static public void linear(int ar[], int ms){
    System.out.println("\nArray: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    for(int i=0;i<ar.length;i++){
      if(ar[i] == ms){
        System.out.println("\nMarks "+ms+" is found at location ar["+i+"].");
        break;
      }
      if(i == ar.length-1){
        if(ar[i] != ms){
          System.out.println("\nMarks "+ms+" is not found!");
          break;
        }
      }
    }
  }

  static public void binary(int ar[], int ms){
    bubble(ar);

    System.out.println("\nArray: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    int f, l, m;
    f = 0;
    l = ar.length-1;
    m = (f+l)/2;
    while(f <= l){
      if(ar[m] == ms){
        System.out.println("\nMarks "+ms+" is found at location ar["+m+"].");
        break;
      }
      if(f == l){
        if(ar[m] != ms){
          System.out.println("\nMarks "+ms+" is not found!");
          break;
        }
      }
      if(ms < ar[m]){
        l = m-1;
        m = (int)(Math.ceil((f+l)/2.0));
      }
      if(ms > ar[m]){
        f = m+1;
        m = (int)(Math.floor((f+l)/2.0));
      }
    }
  }

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

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Enter marks out of 100.");
    System.out.println("The marks must be greater than 0.");
    System.out.println("The size must be greater than 1.");
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();

    if(n < 2){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[] = new int[n];

    System.out.println("\nEnter marks for the array: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter marks at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      if((ar[i] < 1) || (ar[i] > 100)){
        System.out.println("\nInvalid Input!");
        System.exit(0);
      }
      System.out.println();
    }

    System.out.print("\nEnter marks you want to search: ");
    int ms = sc.nextInt();

    System.out.println("\nEnter 1 to search using Linear Search.");
    System.out.println("Enter 2 to search using Binary Search.");
    System.out.println("Enter your choice: ");
    int ch = sc.nextInt();
    switch(ch){
      case 1:
      linear(ar, ms);
      break;
      case 2:
      binary(ar, ms);
      break;
      default:
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }
    sc.close();
  }
}