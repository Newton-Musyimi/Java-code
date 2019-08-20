import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
      System.out.println("Hello Newton");
      Scanner input = new Scanner(System.in);
      int a;
      int b;
      System.out.println("Enter number a: ");
      a = input.nextInt();
      System.out.println("Enter number b: ");
      b = input.nextInt();
      if(input != null) {
        input.close();
      }
      if (a>b){
          System.out.println(a-b);
      }
      else{
          System.out.println(b-a);
      }
     System.out.println("This line was added using the nano command on bash");
 
    }
}
