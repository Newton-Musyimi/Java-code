public class Matrix{
    public static void main(String[] args){
        String sentence = args[0];
        String split[] = sentence.split(" ");
        for(int i=0;i<split.length;i++){
            //verticalPrint((split[i])[i]);
            System.out.println();
        }
        //System.out.println(split);
        
    }
    public static void verticalPrint(String s){
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}