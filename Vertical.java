public class Vertical{
    public static void main(String[] args){
        String sentence = args[0];
        verticalPrint(sentence);
    }
    public static void verticalPrint(String s){
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}