import java.util.Random;
public class mycards{
    public static void main(String[] args){
        String[] cards = new String[52];
        cards = makeDeck(cards);
        printCards(cards);
        int[] shuffled_sequence = cardShuffle();
        shuffledCards(shuffled_sequence,cards);
    }
    public static String[] makeDeck(String[] cards){
        String[] suits = {"S","H","D","C"};
        String[] values = {" A"," 2"," 3"," 4"," 5"," 6"," 7"," 8"," 9","10"," J"," Q"," K"};
        int i = 0;
        for(String s:suits){
            for(String v:values){
                cards[i] = v+s;
                i++;
            }
        }
        return cards;
    }
    public static void printCards(String[] cards){
        int i = 0;
        for(String s:cards){
            System.out.print(cards[i]+" ");
            i++;
        }
        System.out.println("");
    }
    public static int[] cardShuffle(){
        int[] num = new int[52];
        int count = 0;
        int uniq=0;
        System.out.println(num.length);
        while(uniq!=51){
            Random rand = new Random();
            int index = rand.nextInt(52);
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
        System.out.printf("\nThe length of the random numbers is %d and the first number in the array is %d and the last is %d",num.length,num[0],num[51]);
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
    public static void shuffledCards(int[] seq,String[] cards){
        String[] new_cards = new String[52];
        for(int i: seq){
            new_cards[i] = cards[seq[i]];
        }
        printCards(new_cards);
    }
}