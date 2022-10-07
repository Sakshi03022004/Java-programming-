//Assiment no 5 write java programe demonstrate use of method overloading
class demo
{
int a,b,c;
void read(int x,int y)
{
	a=x;
	b=y;
}
void read(int z)
{
	c=z;
}
void display()
{
	System.out.println(a+b+c);
}
}
class methodover
{
	public static void main(String args[])
	{
		demo d=new demo();
		d.read(5);
		d.read(10,6);
		d.display();
	}
}