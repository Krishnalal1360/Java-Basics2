import java.util.Scanner;
import java.lang.Integer;

public class P23 {

  static public String ar1[], ar2[];

  static public void date(String st){
    String st1="", st2="", st3="";
    int d=0, m=0, y=0;
    st1 = st.substring(0,2);
    st2 = st.substring(3, 5);
    st3 = st.substring(6, 10);
    d = Integer.valueOf(st1);
    m = Integer.valueOf(st2);
    y = Integer.parseInt(st3);
    if((d < 1) || (d > 31)){
      System.out.println("Invalid day.");
      System.exit(0);
    }
    if((m < 1) || (m > 12)){
      System.out.println("Invalid month.");
      System.exit(0);
    }
    if((y < 2021) || (y > 2025)){
      System.out.println("Invalid year.");
      System.exit(0);
    }
    if((st.charAt(2) != '/') || (st.charAt(5) != '/')){
      System.out.println("Invalid format.");
      System.exit(0);
    }
  }

  static public void day(String st, String st1){
    String st2="";
    st2 = st1.substring(6, 10);
    if(st2.equals("2021")){
      if(ar1[0].equals(st)){

      }else{
        System.out.println("Invalid day of year "+st2);
        System.out.println("Valid day would be "+ar1[0]);
        System.exit(0);
      }
    }else if(st2.equals("2022")){
      if(ar1[1].equals(st)){

      }else{
        System.out.println("Invalid day of year "+st2);
        System.out.println("Valid day would be "+ar1[1]);
        System.exit(0);
      }
    }else if(st2.equals("2023")){
      if(ar1[2].equals(st)){

      }else{
        System.out.println("Invalid day of year "+st2);
        System.out.println("Valid day would be "+ar1[2]);
        System.exit(0);
      }
    }else if(st2.equals("2024")){
      if(ar1[3].equals(st)){

      }else{
        System.out.println("Invalid day of year "+st2);
        System.out.println("Valid day would be "+ar1[3]);
        System.exit(0);
      }
    }else if(st2.equals("2025")){
      if(ar1[4].equals(st)){

      }else{
        System.out.println("Invalid day of year "+st2);
        System.out.println("Valid day would be "+ar1[4]);
        System.exit(0);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of dates must be atleast 1 but less than 11.");
    System.out.println("The day limit is 1-31.");
    System.out.println("The month limit is 1-12.");
    System.out.println("The year limit is 2021-2025.");
    System.out.println("The format is dd/mm/yyyy.");
    System.out.println("Must enter the first day of the year.");
    System.out.println("The format is Sunday, Monday, ..., Saturday.");
    System.out.println("\nEnter number of dates: ");
    int n = sc.nextInt();
    if((n < 1) || (n > 10)){
      System.out.println("Invalid number of dates.");
      System.exit(0);
    }

    String ar[][] = new String[n][2];

    ar1 = new String[5];
    ar1[0] = "Friday";
    ar1[1] = "Monday";
    ar1[2] = "Sunday";
    ar1[3] = "Monday";
    ar1[4] = "Wednesday";

    String temp="", temp1="";
    System.out.println("\nEnter the date - first day: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("Date "+(i+1)+": ");
      for(int j=0;j<ar[i].length;j++){
        if(j == 0){
          System.out.print("Enter date: ");
          ar[i][j] = sc.next();
          temp = ar[i][j];
          temp1 = temp;
          date(temp);
          System.out.println();
        }else if(j == 1){
          System.out.print("Enter first day: ");
          ar[i][j] = sc.next();
          temp = ar[i][j];
          day(temp, temp1);
          System.out.println();
        }
      }
    }

    System.out.println("\nMatrix: ");
    for(int i=0;i<ar.length;i++){
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }

    System.out.println("");
    sc.close();
  }
}