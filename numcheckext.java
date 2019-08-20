public class numcheckext{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int odd = 0;
        int even = 0;
        for(int i=1;i<a;i++){
            if(i%2==0){
                even+=1;
            }else{
                odd+=1;
            }
        }
        System.out.printf("Number of odd numbers: %d\n",odd);
        System.out.printf("Number of even numbers: %d",even);
    }
}