import java.util.Scanner;
public class timeconvert
{
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.print("time in hrs: ");
    int hours = input.nextInt();
    System.out.print("time in minutes: ");
    int minutes = input.nextInt();
    System.out.print("hours before alarm goes off: ");
    int hourAlarm = input.nextInt();
    System.out.print("minutes before alarm goes off: ");
    int minAlarm = input.nextInt();
    input.close();
    int ansHour= (hours + hourAlarm) % 24;
	  int ansMin= minutes + minAlarm;
	  if (ansMin>=60){
		ansHour = ansHour + (ansMin/60);
		ansMin=ansMin%60;
	  }	
	
	  String ansTime="";
	  String StrHour = Integer.toString(ansHour);
	  String StrMin = Integer.toString(ansMin);
	  ansTime=StrHour+":"+StrMin;
	  System.out.print("The alarm will go off at: "+ansTime);
  }
}
