import java.util.Scanner;
public class anagrams{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String str1 = in.nextLine().toLowerCase();
        System.out.print("Enter the second word: ");
        String str2 = in.nextLine().toLowerCase();
        in.close();
        char[] one = str1.toCharArray();
        int len1 = one.length;
        char[] two = str2.toCharArray();
        int len2 = two.length;
        int present = 0;
        if(len1!=len2)     {
            System.out.println("the words are not of the same length");
        }
        else{
            for(int i =0;i<len1;i++){
                char a = two[i];
                String s = Character.toString(a);
                Boolean yes = str1.contains(s);
                if(yes==true){
                    present += 1;
                }

            }
            if (len1==present){
                System.out.printf("%s and %s are anagrams\n",str1,str2);
            }else{
                System.out.printf("%s and %s are not anagrams\n",str1,str2);
            }
            
        }
    }
}