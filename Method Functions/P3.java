import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class P3 {

  static public void vowelFreq(String ar[], int index){
    String st="AEIOU", v="";
    int freq=0, max_freq=0;
    char c='\u0000';
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      for(int j=0;j<index;j++){
        if(Character.toString(c).equals(ar[j]) == true){
          freq = freq+1;
        }
      }
      if(freq > max_freq){
        max_freq = freq;
        v = Character.toString(c);
      }
      freq = 0;
    }
    System.out.println("\nProminent vowel is: "+v);
    System.out.println("Frequency: "+max_freq);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter a sentence: ");
    String st = sc.nextLine();
    System.out.println("\nSentence: \n"+st);
    st = st.toUpperCase();
    System.out.println("\nSentence in UpperCase: \n"+st);

    char c='\u0000';
    String ar[] = new String[100];
    int index=0;
    for(int i=0;i<st.length();i++){
      c = st.charAt(i);
      if(Character.isLetter(c) == true){
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
          ar[index] = Character.toString(c);
          index = index+1;
        }
      }else{
        continue;
      }
    }

    index=0;
    if(ar[0] != null){
      System.out.println("\nVowels: ");
      for(int i=0;i<ar.length;i++){
        if(ar[i] == null){
          index = i;
          break;
        }else{
          System.out.print(ar[i]+" ");
        }
      }

      String temp="";
      for(int i=0;i<index-1;i++){
        temp = ar[i];
        for(int j=i+1;j<index;j++){
          if(ar[j].compareTo(ar[i]) < 0){
            ar[i] = ar[j];
            ar[j] = temp;
            temp = ar[i];
          }
        }
      }

      System.out.println("\n\nSorted Vowels: ");
      for(int i=0;i<index;i++){
        System.out.println("ar["+i+"]="+ar[i]);
      }

      vowelFreq(ar, index);
    }else{
      System.out.println("\nNo vowels found!");
      System.exit(0);
    }
    sc.close();
  }
}