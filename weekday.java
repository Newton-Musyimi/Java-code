import java.util.Scanner;
import java.util.ArrayList;
public class weekday{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("On which day will you be leaving? ");
        String day_leaving = input.next();
        System.out.print("How many days will you be away? ");
        int days_away = input.nextInt();
        input.close();
        String day_back = vacation(day_leaving.toLowerCase(),days_away);
        System.out.print("You will be returning on a "+day_back);

    }
    public static String vacation(String x, int y){
        ArrayList<String> days = new ArrayList();
        days.add("sunday");
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("saturday");
        int first_day = days.indexOf(x);
        int final_day = first_day + y;
        if(final_day >6){
            final_day = final_day%6;
            return days.get(final_day);
        }else{
            return days.get(final_day);
        }
    }
}