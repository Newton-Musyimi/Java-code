import java.util.Scanner;
import java.util.Random;
public class uniq2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of numbers you want: ");
        int num = in.nextInt();
        in.close();
        cardShuffle(num);
    }
public static int[] cardShuffle(int number){
    int[] num = new int[number];
    int count = 0;
    int uniq=0;
    int work = number-1;
    System.out.println(num.length);
    while(uniq!=work){
        Random rand = new Random();
        int index = rand.nextInt(number);
        //System.out.print(index+" ");
        count++;
        boolean check;
        check = checkIndex(num, index);
        if(check==true){
                            
        }else{
            //System.out.print(index+" ");
            num[uniq]=index;
            //System.out.print(num[uniq]+" ");
            uniq++;
        }
        
    }
    System.out.printf("\nThe length of the random numbers is %d and the first number in the array is %d and the last is %d",num.length,num[0],num[work]);
    System.out.printf("\nThe number of iterations it took is %d\n",count);

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
}