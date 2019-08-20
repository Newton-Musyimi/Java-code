/**This java program calculates the factorial of a number */
import java.util.Scanner;

public class Factorial{
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to find: ");
        int a = input.nextInt();
        input.close();
        System.out.printf("The factorial of %d is %d",a,factorial(a));
    }
    public static int factorial(int a){
        int num = 1;
        if (a==0){
            System.out.println("The factorial of zero(0) is 1");
        }
        for(int i=1;i<=a;i++){
            num = num*i;
        }
        return num;
    }
}