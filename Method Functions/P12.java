import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class P12{

  static public void merge(char ar1[], char ar2[]){
    String st="";
    char c='\u0000';
    for(int i=0;i<ar1.length;i++){
      c = ar1[i];
      st = st.concat(Character.toString(c));
    }
    for(int i=0;i<ar2.length;i++){
      c = ar2[i];
      st = st.concat(Character.toString(c));
    }
    System.out.println("\nMerged string: \n"+st);
  }

  static public void string(String st){
    int uc=0, lc=0;
    char c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLetter(c) == true){
        if(Character.isUpperCase(c)){
          uc = uc+1;
        }
        if(Character.isLowerCase(c)){
          lc = lc+1;
        }
      }else{
        continue;
      }
    }
    char ar1[] = new char[uc];
    char ar2[] = new char[lc];
    int index1=0, index2=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isUpperCase(c)){
        ar1[index1] = c;
        index1 = index1+1;
      }
      if(Character.isLowerCase(c)){
        ar2[index2] = c;
        index2 = index2+1;
      }
    }
    merge(ar1, ar2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a string: ");
    String st = sc.nextLine();
    System.out.println("\nString: \n"+st);
    string(st);
    sc.close();
  }
}