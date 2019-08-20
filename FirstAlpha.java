import java.util.Arrays;

public class FirstAlpha{
    public static void main(String[] args){
        String words = args;
        String arr = "";
        for(int i=0;i<words.length();i++){
            arr += (words[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println(words[0]);
    }
}