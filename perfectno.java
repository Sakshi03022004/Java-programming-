// Assignment no 16 write java programe to check wether the given number is perfect number or not
import java.util.Scanner;
class per
{
	int n,b,sum=0;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter the number");
		n=sc.nextInt();
		b=1;
	}
	void display()
	{
		while(b<n)
		{
			if(n%b==0)
			{
				sum=sum+b;
		}
		b=b+1;
	}
	if(n==sum)
	{
		System.out.println("perfect number");
	}
	else
	{
		System.out.println("not perfect number");
	}
}
}

class perfectno
{
	public static void main(String args[])
	{
		per d1=new per();
		d1.read();
		d1.display();
	}
}