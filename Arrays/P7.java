import java.util.Scanner;

public class P7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNote: The number of participants must be atleast 1.");
    System.out.println("The limit is 10.");
    System.out.println("There will be 5 MCQs.");
    System.out.println("Each MCQ has 5 options.");
    System.out.println("The options are A, B, C, D and E.");
    System.out.println("Each correct answer will be awarded 4 marks.");
    System.out.println("There will be 1 negative marking for each wrong answer.");
    System.out.println("The highest marks is 20.");
    System.out.println("The lowest marks is -5.");
    System.out.println("\nEnter the number of participants: ");
    int n = sc.nextInt();
    if((n < 1) || (n > 10)){
      System.out.println("\nInvalid Input!");
      System.exit(0);
    }

    String ar[][] = new String[n][6];

    System.out.println("\nEnter your full name followed by your chosen options.");
    sc.nextLine();
    for(int i=0;i<ar.length;i++){
      System.out.print("Participant "+(i+1)+": ");
      for(int j=0;j<ar[i].length;j++){
        ar[i][j] = sc.nextLine();
      }
    }

    System.out.println("\nParticipants and their choosed options.");
    for(int i=0;i<ar.length;i++){
      System.out.print("Participant "+(i+1)+": ");
      for(int j=0;j<ar[i].length;j++){
        System.out.print(ar[i][j]+"\t");
      }
      System.out.println();
    }

    String ar1[] = new String[5];

    System.out.println("\nEnter key/correct options.");
    for(int i=0;i<ar1.length;i++){
      System.out.print("Option "+(i+1)+": ");
      ar1[i] = sc.nextLine();
    }

    int ar2[] = new int[n];

    int m=0;
    for(int i=0;i<ar.length;i++){
      for(int j=1;j<ar[i].length;j++){
        if(ar[i][j].equals(ar1[j-1])){
          m = m+4;
        }else{
          m = m-1;
        }
      }
      ar2[i] = m;
      m = 0;
    }

    System.out.println("\nResult of the "+n+" participants: ");
    for(int i=0;i<ar.length;i++){
      System.out.println("Participant "+(i+1)+" "+ar[i][0]+": "+ar2[i]);
    }

    int max=-6, index1=0;
    for(int i=0;i<ar2.length;i++){
      if(ar2[i] > max){
        max = ar2[i];
        index1 = i;
      }
    }
    int min=21, index2=0;
    for(int i=0;i<ar2.length;i++){
      if(ar2[i] < min){
        min = ar2[i];
        index2 = i;
      }
    }

    for(int i=0;i<ar2.length;i++){
      if(i == index1){
        System.out.println("\nParticipant "+(i+1)+" "+ar[i][0]+" has got highest marks.");
      }
      if(i == index2){
        System.out.println("\nParticipant "+(i+1)+" "+ar[i][0]+" has got lowest marks.");
      }
    }
    sc.close();
  }
}