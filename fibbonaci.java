//Assignment No: -13 Write a Java Program to Print Fibonacci Series. 


import java.util.Scanner;
class Fibbo
{
		int n1=0,n2=1,n3,i,count;
		Scanner s=new Scanner(System.in);
		void read( )
		{
		System.out.println( "Enter value of count");
		count=s.nextInt( );
		System.out.println("Fibbonasi Series");
		System.out.println(n1+" "+n2);
		}
		void show( )
		{
		for( i=2;i<count; i++)
		   {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}

class fibbonaci
{
	public static void main(String args[])
	{
		Fibbo f1=new Fibbo( );
		f1.read( );
		f1.show( );
	}
}