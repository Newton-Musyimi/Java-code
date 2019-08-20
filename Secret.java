import java.util.Scanner;

public class Secret{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentece: ");
        String sentence = input.next();
        System.out.print("Enter a substring: ");
        String substring = input.next();
        System.out.println(subEdit(sentence,substring));
        input.close();

    }
    public static String subEdit(String a,String b){
        return a.replaceAll(b, " ");
    }
}