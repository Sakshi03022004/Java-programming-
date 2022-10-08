//Assignment no 9 write a java programe to demonstrate interface
import java.util.Scanner;

interface method
{
	void read();
	void calculation();
}
class Num implements method
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	public void read()
	{
		System.out.println("Enter the 1st number:->");
		a=sc.nextInt();

		System.out.println("Enter the 2nd number:->");

	b=sc.nextInt();
}
public void calculation()
{
	c=a+b;
	System.out.println("\nAddition is:->"+c+"\n");
}
}

public class interface1
{
	public static void main(String args[])
	{
		Num n=new Num();
		n.read();
		n.calculation();
	}
}
