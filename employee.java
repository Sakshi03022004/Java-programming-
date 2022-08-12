//Program to create class with members and methods
import java.util.Scanner;
class Employee
{
int eid;
String ename;
void insert()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the eid:");
eid=s.nextInt();
System.out.println("Enter the ename:");
ename=s.next();
}
void display()
{
System.out.println("Employee id is:"+eid);
System.out.println("Employee name is:"+ename);
}
public static void main(String[] args)
{
Employee p=new Employee();
p.insert();
p.display();
}
}