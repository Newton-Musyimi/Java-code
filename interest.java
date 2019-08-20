import java.util.Scanner;
public class interest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Time: ");
		int Time=input.nextInt();
		input.close();
		double ans = 1;
		int val = 12*Time;
		double A= (1.0+(0.08/12.0));
		A=Math.round(A *1000000.0)/1000000.0;
		for(int i = 1;i<=val;i++)
		{
			ans = ans * A;
		}
		System.out.printf("%.2f",ans);
	}
}