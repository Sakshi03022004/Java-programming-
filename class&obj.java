import java.util.Scanner;
class demo
{
int a,b;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("Enter the two numbers");
a=sc.nextInt();
b=sc.nextInt();
}
void display()
{
System.out.println(a+b);
}
}
class classdemo
{
public static void main(String args[])
{
demo d1=new demo();
d1.read();
d1.display();
}
}