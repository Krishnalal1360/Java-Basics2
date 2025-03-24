import java.util.Scanner;
import java.lang.Integer;

public class P25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: Enter 2-digit day, 2-digit month, and 4-digit year.");
    System.out.println("The limit for year is 1900-3000.");
    System.out.println("The first date must be either less or equal to second date.");
    System.out.println("The format is dd/mm/yyyy.");
    System.out.println("Enter the first date: ");
    String fd = sc.next();
    System.out.println("Enter the second date: ");
    String sd = sc.next();
    int d1 = Integer.parseInt(fd.substring(0, 2));
    int m1 = Integer.parseInt(fd.substring(3,5));
    int y1 = Integer.parseInt(fd.substring(6, 10));
    int d2 = Integer.parseInt(sd.substring(0, 2));
    int m2 = Integer.parseInt(sd.substring(3, 5));
    int y2 = Integer.parseInt(sd.substring(6, 10));
    if((d1 < 1) || (d1 > 31) || (m1 < 1) || (m1 > 12) || (y1 < 1900) || (y1 > 3000) || (fd.charAt(2) != '/') || (fd.charAt(5) != '/')){
      System.out.println("Invalid first date.");
      System.exit(0);
    }
    if((d2 < 1) || (d2 > 31) || (m2 < 1) || (m2 > 12) || (y2 < 1900) || (y2 > 3000) || (sd.charAt(2) != '/') || (sd.charAt(5) != '/')){
      System.out.println("Invalid second date.");
      System.exit(0);
    }
    if((y1 > y2) || (m1 > m2) || (m1 == m2 && d1 > d2)){
      System.out.println("Invalid first date.");
      System.exit(0);
    }

    int ar[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int day=0;
    for(int i=y1;i<=y2;i++){
      if(i == y1){
        if((y1%100 == 0 && y1%400 == 0) || (y1%4 == 0)){
          ar[1] = 29;
          for(int j=1;j<=12;j++){
            if(j == m1){
              day = day+d1;
              break;
            }else{
              day = day+ar[j-1];
            }
          }
          
        }else{

        }
      }else if(i == y2){
        if((y2%100 == 0 && y2%400 == 0) || (y2%4 == 0)){
          ar[1] = 29;
        }else{
          
        }
      }else{
        if((i%100 == 0 && i%400 == 0) || (i%4 == 0)){
          ar[1] = 29;
        }else{

        }
      }
    }
    sc.close();
  }
}