import java.util.Scanner;
import java.lang.String;
import java.lang.Integer; 

public class E8 {

  static public void check(int flag, int d, String m[][], int y){
    int d1=0;
    int index=0;
    if(flag == 0){
      for(int i=0;i<12;i++){
        d1 = Integer.parseInt(m[i][1]);
        if(d > d1){
          d = d-d1;
        }else{
          index = i;
          break;
        }
      }
    }else if(flag == 1){
      m[1][1] = "29";
      for(int i=0;i<12;i++){
        d1 = Integer.parseInt(m[i][1]);
        if(d > d1){
          d = d-d1;
        }else{
          index = i;
          break;
        }
      }
    }
    for(int i=0;i<12;i++){
      if(i == index){
        System.out.println("\nDate: "+d+" "+m[i][0]+" "+y);
        break;
      }
    }
    //System.out.println("\nIn check, d="+d);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The day number must be inclusive between 1 and 366.");
    System.out.println("The year must be 4-digit.");
    System.out.println("The year must be inclusive between 1900 and 3000.");
    System.out.println("The number of days after which new date will be generated must be inclusive between 1 and 365.");
    System.out.println("\nEnter a day number: ");
    int d = sc.nextInt();
    if((d < 1) || (d > 366)) {
      System.out.println("\nInvalid Input!.");
      System.out.println("Reason: The day number must be inclusive between 1 and 366.");
      System.exit(0);
    }
    System.out.println("\nEnter a year: ");
    int y = sc.nextInt();
    String st = Integer.toString(y);
    if(st.length() != 4) {
      System.out.println("\nInvalid Input!.");
      System.out.println("Reason: The year must be 4-digit.");
      System.exit(0);
    }
    if((y < 1900) || (y > 3000)) {
      System.out.println("\nInvalid Input!.");
      System.out.println("Reason: The year must be inclusive between 1900 and 3000.");
      System.exit(0);
    }
    System.out.println("\nEnter the number of days after which new date will be generated: ");
    int n = sc.nextInt();
    if((n < 1) || (n > 365)) {
      System.out.println("\nInvalid Input!.");
      System.out.println("Reason: The number of days after which new date will be generated must be inclusive between 1 and 100.");
      System.exit(0);
    }

    String m[][] = new String[12][2];
    System.out.println("\nEnter month name and total number of days in that month: ");
    for(int i=0;i<12;i++){
      System.out.println("Enter data for month "+(i+1));
      for(int j=0;j<2;j++){
        m[i][j] = sc.next();
      }
    }
    System.out.println("\nMonth name and total days: ");
    for(int i=0;i<12;i++){
      for(int j=0;j<2;j++){
        System.out.print(m[i][j]+" ");
      }
      System.out.println();
    }

    int flag=0;
    if(y%100 == 0){
      if(y%400 == 0){
        flag = 1;
      }
    }else if(y%4 == 0){
      flag = 1;
    }
    if(flag == 0){
      System.out.println("\n"+y+" is a non-leap year.");
    }else if(flag == 1){
      System.out.println("\n"+y+" is a leap year.");
    }
    check(flag, d, m, y);
    //System.out.println("\nIn main, d="+d);

    d = d+n;
    System.out.println("\nDate after "+n+" days");
    if(flag == 0){
      if(d > 365){
        d = d-365;
        y = y+1;
        if(y%100 == 0){
          if(y%400 == 0){
            flag = 1;
          }
        }else if(y%4 == 0){
          flag = 1;
        }
        if(flag == 0){
          System.out.println("\n"+y+" is a non-leap year.");
        }else if(flag == 1){
          System.out.println("\n"+y+" is a leap year.");
        }          
        check(flag, d, m, y);
      }else{
        check(flag, d, m, y);
      }
    }else if(flag == 1){
      if(d > 366){
        d = d-366;
        y = y+1;
        flag = 0;
        System.out.println("\n"+y+" is a non-leap year.");
        check(flag, d, m, y);
      }else{
        check(flag, d, m, y);
      }
    }
    sc.close();
  }
}