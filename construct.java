//Assignment no 4 write a java programe to demonstarte use of constructor and finalize method
import java.util.Scanner;
class demo
{
int a,b;
demo(int x,int y)
{
a=x;
b=y;
}
void show()
{
System.out.println(a+b);
}
}
class construct
{
public static void main(String args [])
{
demo d1=new demo(10,10);
d1.show();
}
}