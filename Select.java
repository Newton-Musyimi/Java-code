import java.util.Random;
import java.util.Arrays;

public class Select{

	public static void main(String[] args) {
		int length=Integer.parseInt(args[0]);
		int upper_limit=Integer.parseInt(args[1]);
		int[] random_array =  new int[length];
		Random rand = new Random();

		for (int i=0; i<length; i++) {
			int n= rand.nextInt(upper_limit);
			random_array[i]=n;
			}
		System.out.println(Arrays.toString(random_array));
		selectionSort(random_array, length);		
	}
	public static void selectionSort(int[] random_array,int length){
		for (int i = 0; i < length-1; i++) {
            int num = i;
            for (int j = i+1; j < length; j++) {
                if (random_array[j] < random_array[num]) {
                    num = j;
				}
			}
            int num2 = random_array[num];
            random_array[num] = random_array[i];
            random_array[i] = num2;
		}
		System.out.println(Arrays.toString(random_array));

	}

}