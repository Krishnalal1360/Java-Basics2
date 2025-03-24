import java.util.Scanner;

public class P20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The size must be greater than 0 but less than 11.");
    System.out.println("Only First name is allowed.");
    System.out.println("Duplicate names are not allowed inside both array and as well as each single array.");
    System.out.println("\nEnter size for the first array to store first names: ");
    int n = sc.nextInt();
    System.out.println("\nEnter size for the second array to store first names: ");
    int m = sc.nextInt();
    if((n < 1) || (m < 1) || (n > 10) || (m > 10)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    String ar1[] = new String[n];
    String ar2[] = new String[m];

    System.out.println("\nEnter the names for the first array: ");
    for(int i=0;i<ar1.length;i++){
      System.out.print("Enter name "+(i+1)+" : ");
      ar1[i] = sc.next();
      System.out.println();
    }

    System.out.println("\nEnter the names for the second array: ");
    for(int i=0;i<ar2.length;i++){
      System.out.print("Enter name "+(i+1)+" : ");
      ar2[i] = sc.next();
      System.out.println();
    }

    System.out.println("\nFirst array: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }

    System.out.println("\nSecond array: ");
    for(int i=0;i<ar2.length;i++){
      System.out.println("ar2["+i+"]="+ar2[i]);
    }

    for(int i=0;i<ar1.length-1;i++){
      for(int j=i+1;j<ar1.length;j++){
        if(ar1[i].equals(ar1[j])){
          System.out.println("\nDuplicate name "+ar1[i]+" is found in first array!");
          System.exit(0);
        }
      }
    }

    for(int i=0;i<ar2.length-1;i++){
      for(int j=i+1;j<ar2.length;j++){
        if(ar2[i].equals(ar2[j])){
          System.out.println("\nDuplicate name "+ar2[i]+" is found in second array!");
          System.exit(0);
        }
      }
    }

    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar2.length;j++){
        if(ar1[i].equals(ar2[j])){
          System.out.println("\nDuplicate name "+ar1[i]+" is found in both arrays!");
          System.exit(0);
        }
      }
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

    System.out.println("\nFirst array sorted in alphabetical order: ");
    for(int i=0;i<ar1.length;i++){
      System.out.println("ar1["+i+"]="+ar1[i]);
    }

    System.out.println("\nSecond array sorted in alphabetical order: ");
    for(int i=0;i<ar2.length;i++){
      System.out.println("ar2["+i+"]="+ar2[i]);
    }

    String ar3[] = new String[n+m];
    int i=0, j=0, k=0;
    while((i <= ar1.length-1) && (j <= ar2.length-1)){
      if(ar1[i].compareTo(ar2[j]) < 0){
        ar3[k] = ar1[i];
        k = k+1;
        i = i+1;
      }else if(ar2[j].compareTo(ar1[i]) < 0){
        ar3[k] = ar2[j];
        k = k+1;
        j = j+1;
      }
    }
    if(i <= ar1.length-1){
      while(i <= ar1.length-1){
        ar3[k] = ar1[i];
        k = k+1;
        i = i+1;
      }
    }else if(j <= ar2.length-1){
      while(j <= ar2.length-1){
        ar3[k] = ar2[j];
        k = k+1;
        j = j+1;
      }
    }

    System.out.println("\nThird array stores the first array and second array based on alphabetical order: ");
    for(i=0;i<ar3.length;i++){
      System.out.println("ar3["+i+"]="+ar3[i]);
    }
    sc.close();
  }
}