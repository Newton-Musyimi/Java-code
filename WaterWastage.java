import java.util.Scanner;

public class WaterWastage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How often do you see/hear your tap dripping (in seconds): ")  ;
        double drip = input.nextDouble();
        input.close();
        System.out.printf("This wastes %.2f litres of water every hour %n",hour(drip));
        System.out.printf("This wastes %.2f litres of water every day %n",day(drip));
        System.out.printf("This wastes %.2f litres of water every week",week(drip));
    }
    public static double hour(double x){
        return 3600/x*0.00025;
    }
    public static double day(double y){
        return 86400/y*0.00025;
    }
    public static double week(double z){
        return 604800/z*0.00025;
    }
}
