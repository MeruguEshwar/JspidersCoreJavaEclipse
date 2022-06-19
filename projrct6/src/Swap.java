import java.util.Scanner;
public class Swap 
{
	public static void main(String argv[])
	{
		int c=0;
		System.out.println("Enter two numbers");
		Scanner scan=new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		a=b;
		b=c;
		c=a;
		System.out.println(a);
		System.out.println(b);
		
	}
}
