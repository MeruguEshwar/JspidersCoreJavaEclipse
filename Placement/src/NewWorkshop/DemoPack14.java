//WAP to find sum of all the integer array elements using for each loop
package NewWorkshop;
public class DemoPack14 
{
	public static void main(String[] args) 
	{
		int [] a1= {2,3,4,5,6};
		int sum=0;
		for(int k:a1)
		{
			sum=sum+k;
		}
		System.out.println(sum);
	}
}
