import java.util.Random;
public class UniqueNums{
public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        cardShuffle(num);
    }
public static int[] cardShuffle(int number){
    int[] num = new int[number];
    int count = 0;
    int uniq=0;
    int work = number-1;
    while(uniq!=work){
        Random rand = new Random();
        int index = rand.nextInt(number);
        count++;
        boolean check;
        check = checkIndex(num, index);
        if(check==true){
                            
        }else{
            num[uniq]=index;
            uniq++;
        }
        
    }
    System.out.print("Your numbers are: ");
    printArray(num);
    System.out.printf("The number of iterations it took is %d\n",count);
    return num;
}
public static boolean checkIndex(int[] num, int index){
    boolean check = false;
    for(int i : num){
        if(i==index){
            check = true;
            break;
        }
    }
    return check;
}
public static void printArray(int[] nums){
    int i = 0;
    for(int s:nums){
        System.out.print(nums[i]+" ");
        i++;
    }
    System.out.println("");
}
}