import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class E6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The first 1 or 2 or 3 number is for number of days in a year.");
    System.out.println("The last 4 numbers is must for a year.");
    System.out.println("You can enter year inclusive between 1900 and 3000.");
    System.out.println("You must enter inclusive 5-digit to 7-digit number.");
    System.out.println("\nEnter a value: ");
    int n = sc.nextInt();
    String st = Integer.toString(n);
    if((st.length() < 5) || (st.length() > 7)){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The value must be inclusive between 5-digit to 7-digit.");
      System.exit(0);
    }

    String st1="", st2="";
    if(st.length() == 5){
      st1 = st.substring(1, st.length());
      st2 = st.substring(0, 1);
    }else if(st.length() == 6){
      st1 = st.substring(2, st.length());
      st2 = st.substring(0, 2);
    }else if(st.length() == 7){
      st1 = st.substring(3, st.length());
      st2 = st.substring(0, 3);
    }
    int y = Integer.parseInt(st1);
    if((y < 1900) || (y > 3000)){
      System.out.println("\nInvalid Input!");
      System.out.println("Reason: The value must be inclusive between 1900 and 3000.");
      System.exit(0);
    }
    int d = Integer.valueOf(st2);

    String m[][] = new String[12][2];
    System.out.println("\nFor Year: ");
    System.out.println("Enter month name and number of days: ");
    for(int i=0;i<12;i++){
      System.out.println("Enter data for month "+(i+1)+":");
      for(int j=0;j<2;j++){
        m[i][j] = sc.next();
      }
    }
    System.out.println("\nMonth number of days and name for Year: ");
    for(int i=0;i<12;i++){
      System.out.println("Month "+(i+1)+":");
      for(int j=0;j<2;j++){
        System.out.println(m[i][j]);
      }
    }

    int flag=0;
    if(y%100 == 0){
      if(y%400 == 0){
        flag = 1;
      }
    }else if(y%4 == 0){
      flag = 1;
    }
    if(flag == 1){
      System.out.println("\n"+y+" is a Leap Year.");
    }else{
      System.out.println("\n"+y+" is a Non-Leap Year.");
    }

    int d1=0, index=0;
    if(flag == 0){
      for(int i=0;i<m.length;i++){
        d1 = Integer.parseInt(m[i][1]);
        if(d > d1){
          d = d-d1;
        }else if(d < d1){
          index = i;
          break;
        }
      }
    }else if(flag == 1){
      m[1][1] = "29";
      for(int i=0;i<m.length;i++){
        d1 = Integer.parseInt(m[i][1]);
        if(d > d1){
          d = d-d1;
        }else if(d < d1){
          index = i;
          break;
        }
      }
    }
    for(int i=0;i<m.length;i++){
      if(i == index){
        System.out.println("\nDate: "+d+" "+m[i][0]+" "+y);
        System.exit(0);
      }
    }
    sc.close();
  }
}