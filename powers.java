/**This is a java program that calculates the exponential of a number */
import java.util.Scanner;

public class powers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = input.nextInt();
        input.close();
        System.out.printf("%d to the power %d is %d",num,exponent,pow(num, exponent));
    }
    //the method that works out exponentials
    public static int pow(int base, int exponent){
        int result = 1;
        for (int i=0;i<exponent;i++){
            result *= base;
        }
        return result;
    }
}