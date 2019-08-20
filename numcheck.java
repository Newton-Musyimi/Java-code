public class numcheck{
    public static void main(String[] args){
        String a = args[0];
        char[] str = a.toCharArray();
        int odd = 0;
        int even = 0;
        for(int i=0;i<str.length;i++){
            char b = str[i];
            int c = Character.getNumericValue(b);
            if(c%2==0){
                even+=1;
            }else{
                odd+=1;
            }
        }
        System.out.printf("Number of odd numbers: %d\n",odd);
        System.out.printf("Number of even numbers: %d",even);
    }
}