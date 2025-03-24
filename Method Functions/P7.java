import java.util.Scanner;

public class P7{

  static public void magicString(String st){
    char c1='\u0000', c2='\u0000';
    int flag=0;
    for(int i=0;i<st.length()-1;i++){
      c1 = st.charAt(i);
      c2 = st.charAt(i+1);
      if(c1 == c2){
        flag = 1;
        break;
      }
    }
    if(flag == 1){
      System.out.println("\nWord "+st+" is a Magic String");
    }else{
      System.out.println("\nWord "+st+" is not a Magic String");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a word: ");
    String st = sc.next();
    System.out.println("\nWord: "+st);
    magicString(st);
    sc.close();
  }
}