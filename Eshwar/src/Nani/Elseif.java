import java.util.Scanner;

package Nani;

public class Elseif 
{
	public static void main(String argv[])
		{
			Scanner scan = new Scanner(System.in);
			char grade=scan.next().charAt(0);
			{
				if(grade=='a')
				{
					System.out.println("You will got a frt rank.....");
				}
				else if(grade == 'b')
				{
					System.out.println("You will got a 2nd rank.....");
				}
				else if(grade == 'c')
				{
					System.out.println("You will got a 3rd rank.....");
				}
				else 
				{
					System.out.println("Fail");
				}
			}
		}
}
