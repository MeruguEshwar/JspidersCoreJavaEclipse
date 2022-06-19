/*WAP to print the statement in words
 * ex:I am born in india
 * i
 * am    split(" ")is a method
 * born
 * in
 * india*/
package Array;
public class Program14 
{
	public static void main(String[] args) 
	{
		String s1 = "iam born in india";
		String[] sary = s1.split(" ");
		for(String s:sary)
		{
			System.out.println(s);
		}
	}
}
