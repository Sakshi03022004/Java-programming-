import java.util.Scanner;
class f1
{
	Scanner r=new Scanner(System.in);

int n,fact=1;
void read()
{
System.out.println("Enter the number:->");
n=r.nextInt();
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
}
void display()
{
	System.out.println("factorial:->"+fact);
}
}


class fact
{
	public static void main(String args[])
	{
		f1 f=new f1();
		f.read();
		f.display();
	}
}