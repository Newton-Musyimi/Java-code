import java.util.Scanner;
public class tempconvert
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Temperature? ");
		double Temp = input.nextDouble();
		System.out.print("is the unit f or c? ");
		String units = input.next().toLowerCase();
		input.close();
		if(units.equals("c"))
		{
			System.out.printf("%.1f F",Faren(Temp));
		}
		else(units.equals("f"))
		{
			System.out.printf("%.1f C",Celsius(Temp));
		}


	}
	
	public static double Celsius(double Temp)
	{
		double ans = (Temp-32.0)*5.0/9.0;
		return ans;
	}
	
	
	public static double Faren(double Temp)
	{
		double ans = (Temp*9.0/5.0)+32;
		return ans;
	}
	
	
	
	
}

