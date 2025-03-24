public class Array_defaultValue {
  public static void main(String[] args) {
    int ar[] = new int[5];
    System.out.println("Array 1-D: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    int ar1[][] = new int[3][3];
    System.out.println("\nArray 2-D: ");
    for(int i=0;i<ar1.length;i++){
      for(int j=0;j<ar1[i].length;j++){
        System.out.println("ar1["+i+"]["+j+"]="+ar1[i][j]);
      }
    }
  }
}
