import java.util.Scanner;

public class P16{

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
    System.out.println("\nArray after sorting: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
  }

  static public int[] removeDuplicate(int ar[], int dc){
    int ar1[] = new int[ar.length-dc];
    int index=0;
    for(int i=0;i<ar.length-1;i++){
      if(ar[i] != ar[i+1]){
        ar1[index] = ar[i];
        index = index+1;
      }
    }
    ar1[index] = ar[ar.length-1];
    return ar1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Must enter duplicate numbers.");
    System.out.println("The number must be greater than 0.");
    System.out.println("The size must be greater than 1.");
    System.out.println("\nEnter size for the array: ");
    int n = sc.nextInt();
    if(n <= 1){
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

    System.out.println("\nArray: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    sort(ar);

    int dc=0;
    for(int i=0;i<ar.length-1;i++){
      if(ar[i] == ar[i+1]){
        dc = dc+1;
      }
    }

    if(dc == 0){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    System.out.println("\nNumber of duplicate elements: "+dc);

    int ar1[] = new int[ar.length-dc];

    ar1=removeDuplicate(ar, dc);

    System.out.println("\nArray after removing "+dc+" elements: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar["+i+"]="+ar1[i]);
    }
    sc.close();
  }
}