import java.util.Scanner;
public class  Fibonacci{
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sequences: ");
        int a = input.nextInt();
        System.out.println("");
        int n = 1;
        System.out.println(n);
        int m = 1;
        System.out.println(m);
        for(int i=1; i<a-1; i++){
            int o = m + n;
            System.out.println(o);
            n = m;
            m = o;
        input.close();

        }
        
    }
}
