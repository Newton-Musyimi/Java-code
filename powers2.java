/**This is a java program that calculates the exponential of a number */
import java.util.Scanner;

public class powers2{
    public static void main(String[] args){
        //the Scanner that takes in user input through the keyboard
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = input.nextInt();
        //closing the Scanner
        input.close();
        System.out.printf("%d to the power %d is %d",num,exponent,pow(num, exponent));
    }
    //the exponent method that is recursive
    public static int pow(int base, int exponent){
        //the base case
        if (exponent==1){
            return base;
        }
        //the recursive case
        return base *pow(base,exponent-1);
    }
}