// WAp to find longest substring in the given string
package NewWorkshop;
public class DemoPack6 
{
	public static void main(String[] args) 
	{
		String s1="I love my mother";
		String sArr[]=s1.split(" ");
		
		String LongestSubString=sArr[0];
		int LongestSubStringLength=sArr[0].length();
		
		for(int i=1;i<=sArr.length-1;i++)
		{
			int temp = sArr[i].length();
			if(temp > LongestSubStringLength)
			{
				LongestSubStringLength=temp;
				LongestSubString=sArr[i];
			}
		}
		System.out.println("Longest substring is:"+LongestSubString);
	}
}
