import java.util.Scanner;
public class  Fibonacci{
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sequences: ");
        int a = input.nextInput();
        int n = 1;
        int m = 1;
        int o;
        for(i=0, i<a, i++){
            o = m + n;
            System.out.println(o);
            n = m;
            m = o;

        }
        
    }
}
