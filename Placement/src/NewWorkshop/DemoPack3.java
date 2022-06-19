//WAP to revrsse the string
package NewWorkshop;
public class DemoPack3 
{
	public static void main(String[] args) 
	{
		String s1="Nani";
		String s2=" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Original String is"+s1);
		System.out.println("New String is"+s2);
	}
}
