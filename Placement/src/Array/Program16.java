/*WAP to count the number of words prescent in the string*/
package Array;
public class Program16 
{
	public static void main(String[] args) 
	{
		String s1 = "let this diwali bring in your life by getting job";
		String[] s = s1.split(" ");
		System.out.println("Number of words present in the string is:"+s.length);
	}
}
