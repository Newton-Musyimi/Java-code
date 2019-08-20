/**This java program calculates the factorial of a number */
import java.util.Scanner;

public class Factorial2{
    //The main method
    public static void main(String[] argv){
        //a Scanner variable that will take in users' input through the keyboard
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to find: ");
        int a = input.nextInt();
        //closing the Scanner
        input.close();
        System.out.printf("The factorial of %d is %d",a,factorial(a));
    }
    //the recursive factorial function
    public static int factorial(int a){
        //the base case
        if(a == 0){
            return 1;
        }
        //the recursive case
        return a * factorial(a-1);
    }
}