//assiment no 3 write a java programe to demonstrate string functions
import java.util.Scanner;
public class StringLowerUpper
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:=>");
	String str=sc.nextLine();

	String lowerStr=str.toLowerCase();
	String upper_str=str.toUpperCase();
	int len=str.length();

	System.out.println("original string:->"+str);
	System.out.println("string in lowercase:->"+lowerStr);
	System.out.println("Sring in uppercase:->"+upper_str);
	System.out.println("The Srtring length of:-> "+str+"is;->"+len);

	Scanner scan1=new Scanner(System.in);
	System.out.print("Enter the First string:->");
	String str1=scan1.nextLine();

	Scanner scan2=new Scanner (System.in);
	System.out.print("Enter the second sring->");
	String str2=scan2.nextLine();

	String str3=str1.concat(str2);
	System.out.println("The concatenated string:->" +str3);

	String newstr=str3.substring(5,12);
	System.out.println("Old string=>"+str3);
	System.out.println("New sring=>"+newstr);
}
}
