import java.util.Scanner;
class  UserInput
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your age");
		int age=s.next();
		System.out.println("Your name is "+name+"Your age is "+age);
	}
}
