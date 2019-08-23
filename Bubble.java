import java.util.Random;
import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		int length =Integer.parseInt(args[0]);
		int upper_limit = Integer.parseInt(args[1]);
		int[] random_array =  new int[length];
		Random rand = new Random();

		for (int i = 0; i<length; i++) {
			int n= rand.nextInt(upper_limit);
			random_array[i]=n;
			}
        System.out.println(Arrays.toString(random_array));
        bubbleSort(random_array);
    }
    public static void bubbleSort(int[] random_array){
        int len = random_array.length;
        int num = 0;
        for(int i = 0; i < len; i++){
            for(int j=1; j < (len-i); j++){
                if(random_array[j-1] > random_array[j]){
                    num = random_array[j-1];
                    random_array[j-1] = random_array[j];
                    random_array[j] = num;
                }
            }
        }
        System.out.println(Arrays.toString(random_array));

    }

}
