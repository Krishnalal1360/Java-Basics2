import java.util.Scanner;

public class P1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: You can enter same element more than once.");
    System.out.println("The size of the array must be greater than 0.");
    System.out.print("\nEnter the size for the array: ");
    int n = sc.nextInt();
    if(n < 1){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    int ar[] = new int[n];

    System.out.println("\nYou can enter only positive elements.\n");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter element at location ar["+i+"]: ");
      ar[i] = sc.nextInt();
      if(ar[i] < 0){
        System.out.println("\nInvalid Input!");
        System.exit(0);
      }
      System.out.println();
    }

    System.out.println("\nArray 1-D:");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    /*int freq=0;
    for(int i=0;i<ar.length;i++){
      if(ar[i] == -1){
        continue;
      }
      freq = 0;
      for(int j=0;j<ar.length;j++){
        if(ar[i] == ar[j]){
          freq = freq+1;
          ar[j] = -1;
        }
      }
      System.out.println("Frequency of "+ar[i]+" is "+freq);
    }*/

    int freq=1;
    for(int i=0;i<ar.length-1;i++){
      for(int j=i+1;j<ar.length;j++){
        if((ar[i] == ar[j]) && (ar[j] != -1)){
          freq = freq+1;
          ar[j] = -1;
        }
      }
      if(ar[i] == -1){
        continue;
      }else{
        System.out.println("Frequency of "+ar[i]+" is "+freq);
        freq = 1;
      }
    }
    sc.close();
  }
}