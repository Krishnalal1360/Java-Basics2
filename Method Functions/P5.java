import java.util.Scanner;
import java.lang.String;

public class P5{

  static public void sort(String ar1[]){
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
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter size for array: ");
    int n = sc.nextInt();

    String ar[] = new String[n];

    System.out.println("\nEnter names for array: ");
    for(int i=0;i<ar.length;i++){
      System.out.print("Enter name at location ar["+i+"]: ");
      ar[i] = sc.next();
      System.out.println();
    }

    System.out.println("\nArray: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }

    for(int i=0;i<ar.length-1;i++){
      for(int j=i+1;j<ar.length;j++){
        if(ar[j].equals("0") == true){
          continue;
        }
        if(ar[i].equals(ar[j]) == true){
          ar[j] = "0";
        }
      }
    }

    int count=0;
    for(int i=0;i<ar.length;i++){
      if(ar[i].equals("0") == false){
        count = count+1;
      }
    }

    String ar1[] = new String[count];
    int index=0;
    for(int i=0;i<ar.length;i++){
      if(ar[i].equals("0") == true){
        continue;
      }else{
        ar1[index] = ar[i];
        index = index+1;
      }
    }

    System.out.println("\nArray after removing duplicate names: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }

    sort(ar1);

    System.out.println("\nArray after sorting in alphabetical order: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }
    sc.close();
  }
}