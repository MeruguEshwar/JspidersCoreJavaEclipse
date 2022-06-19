/*WAP to revrse a string using array....*/
package Array;
public class program17 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2=" ";
		char[] cArr = s1.toCharArray();
		
		for(int i=cArr.length-1;i>=0;i--)
		{
			s2+=cArr[i];
		}
		System.out.println(s1);
		
		System.out.println(s2);
	}
}
