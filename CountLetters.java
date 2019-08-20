import java.util.Scanner;

public class CountLetters{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some text: ");
        String str = input.next().toLowerCase();
        input.close();
        str.replaceAll(" ", "");
        char[] sentence = str.toCharArray();
        int len = sentence.length;
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<26;j++){
                if (sentence[i]==alphabet[j]){
                    count++;
                }
                else{

                }
                System.out.printf("%d -> %d",alphabet[j],count);
            }
            
        }
    }
}