//WAP to create an integer array and print only even elements
package NewWorkshop;
public class DemoPack11 
{
	public static void main(String[] args) 
	{	
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("******************");
		for(int k:arr)
		{
			if(k%2==0)
			{
				System.out.println(k);
			}
		}
	}
}
