//write a java programe to checkgiven number is palindrome or not
import java.util.Scanner;
class demo
{
	int no,d,s,temp;
	Scanner sc=new Scanner(System.in);

	void read()
	{
		System.out.println("enter the num");
		no=sc.nextInt();
		temp=no;
	}
	void show()
	{
		s=0;
		while(no>0)
		{
			d=no%10;
			s=s*10+d;
			no=no/10;
		}
		if(temp==s)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}

class palindrom
{
	public static void main(String args[])
	{
		demo d1=new demo();
		d1.read();
		d1.show();
	}
}