/*Wap to array occurancy
 * int[] a1 = {45,23,78,45,12,23,45,99};
 * 23=2 times
 * 45=3 times
 * 78=1 time
 * 12=1 time
 * 99=1 time
 * */
package Array;
public class Program13 
{
	public static void main(String[] args) 
	{
		int[] a1= {45,33,23,13,45,67,45,23,13,54,13,66};
		int count=0;
		for(int i=0;i<=a1.length-1;i++)
		{
			int status=1;
			for(int j=i-1;j>0;j--)
			{
				if(a1[i]==a1[j])
				{
					status++;
				}
			}
			if(status==1)
			{
				count++;
			}
		}
		System.out.println("Total count of each element only one time is:"+count);
		
		int[] a2=new int[count];
		int index=0;
		for(int i=0;i<=a2.length-1;i++)
		{
			boolean flag=false;
			for(int j=0;j<a2.length-1;j++)
			{
				if(a1[i]==a2[j])
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				a2[index]=a1[i];
				index++;
				}
			}
		for(int i=0;i<=a2.length-1;i++)
		{
			int countofEachElement=0;
			for(int j=0;j<=a1.length-1;j++)
			{
				if(a2[i]==a1[j])
				{
					countofEachElement++;
				}
			}
			System.out.println(a2[i]+"-------->"+countofEachElement+" times");
		}
				
	}
}