import java.lang.Character;
import java.lang.String;

public class stringArray {
  public static void main(String[] args){
    String ar[] = new String[5];
    for(int i=0;i<ar.length;i++){
      System.out.println("ar["+i+"]="+ar[i]);
    }
    if(null == Character.toString('\u0000')){
      System.out.println("\nnull and null character are same!");
    }else{
      System.out.println("\nnull and null character are not same!");
    }
  }
}
