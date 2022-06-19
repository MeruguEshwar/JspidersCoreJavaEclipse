//WAP to create an double array and print even index element

package NewWorkshop;
public class DemoPack12 
{
	public static void main(String[] args) 
	{
		double drr[]=new double[]{1,2,3,4,5,6,7,8,9,11,12};
		for(int i=0;i<=drr.length-1;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(drr[i]);
			}
		}
	}
}
