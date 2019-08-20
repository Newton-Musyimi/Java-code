import java.util.Scanner;
public class badcase{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String str = in.nextLine();
        System.out.print("Which word would you like to change: ");
        String sub = in.next();
        in.close();
        String lower = str.toLowerCase();
        Boolean check = lower.contains(sub);
        if(check==false){
            System.out.println(check);
            System.out.println("Your sentence does not contain the specified word");
        }else{
            String split[] = lower.split(" ");
            System.out.println(split);
            String newStr = "";
            for(int i=0;i<split.length;i++){
                //verticalPrint((split[i])[i]);
                newStr += split[i];
                System.out.println(newStr);
            }
        }
    }
    public static String[] stringArray(String s){
        return {"a","b"};
    }
}