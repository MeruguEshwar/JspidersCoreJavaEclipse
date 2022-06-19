//WAP to reverse the string using array
package NewWorkshop;
public class DemoPack4 
{
	public static void main(String[] args) 
	{
		String s1="Nani";
		String s2=" ";
		char cArr[] = s1.toCharArray();
		for(int i=cArr.length-1;i>=0;i--)
		{
			s2=s2+cArr[i];
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
