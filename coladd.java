import java.util.Scanner;

public class coladd{
    public static String myAdd(String s1,String s2,int b){
        String result = "";
        int carry,d1,d2,col,rem,ite;
        String o = "0";
        System.out.println(s1.length());
        System.out.println(s2.length());
        while(s2.length()!=s1.length()){
            o += s2; 
            s2 = o;
        }
        ite = s1.length()-1;
        while(ite!=0){
            d1 = Character.getNumericValue(s1.charAt(ite-i));
            d2 = Character.getNumericValue(s2.charAt(ite-i));
            col = d1+ d2;
            if (col>10){
                carry = col%b;
                rem = col/b;
                result += Integer.toString(rem);
            }else{
                carry = 0;
                rem = col;
                result += Integer.toString(col);
            }
            ite-=1;
            

        }
        return result;
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
        String s1;
        String s2;
        String d1 = Integer.toString(n1);
        String d2 = Integer.toString(n2);
        if (d1.length()>d2.length()){
            s1 = d1;
            s2 = d2;
        }else{
            s1 = d2;
            s2 = d1;
        }
        sum = myAdd(s1,s2,b);
        System.out.println(sum);
    }
}