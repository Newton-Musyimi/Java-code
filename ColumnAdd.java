import java.util.Scanner;

public class ColumnAdd{
    public static String myAdd(int n1,int n2,int b){
        int d1, d2, sum = 0, c= 0, d3 = 0, shift = 1, ans = 0;
        while (n1 > 0 || n2>0){
            d1 = n1% b;
            n1 = n1/b;

            d2 = n2%b;
            n2 = n2/b;

            if (d1>=b || d2>=b){
                return "-1";
            }
            sum = c + d1 + d2;
            if (sum>=0){
                d3 = sum % b;
                c = sum / b;
            }
            else{
                d3 = sum;
                c = 0;
            }
        ans = ans + d3*shift;
        shift = shift * b;
        }
        String shiftstr = Integer.toString(shift+ans);
        //String firststr = Integer.toString(ans);
        return shiftstr;
    }
    public static void main(String[] args){
        int n1,n2,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n1:");
        n1 = input.nextInt();
        System.out.println("Enter n2:");
        n2 = input.nextInt();
        System.out.println("Enter the base:");
        b = input.nextInt();
        input.close();
        String sum;
        sum = myAdd(n1,n2,b);
        

        System.out.println(sum);
    }
}