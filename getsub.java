public class getsub{
    public static void main(String[] args){
        String s = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        System.out.print(mySubstr(s,a,b));
    
    }
    public static String mySubstr(String s, int start, int len){
        if(start<0||len<0||start>len){
            return "";
        }
        String result = "";
        char[] str = s.toCharArray();
        for (int i=start;i<start+len;i++){
            String add= Character.toString(str[i]);
            result+=add;
        }
        return result;
        
    }
}