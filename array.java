import java.util.Arrays;
import java.util.Random;

public class array{
    public static void main(String[] args){
        //int[] count = new int[3];
        int[] counts = {1,2,3,4};
        String pri = "";
        //double[] a = new double[3]; //creates a double array and allocates 3 memory slots for values
        System.out.println(counts);
        System.out.println(Arrays.toString(counts));
        for (int i=0;i<counts.length;i++){
            String b = Integer.toString(counts[i]);
            pri += b+", ";
        }
        System.out.print(pri);

    }
    public static int randomarray(int x){
        Random random = new Random();
        return result;
    }
}