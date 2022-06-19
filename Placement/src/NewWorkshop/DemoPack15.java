//WAP to find average of integer array elements using forloop
package NewWorkshop;
public class DemoPack15 
{
	public static void main(String[] args) 
	{
		int a1[]= {2,3,4,5,6,7,8};
		int sum=0;
		double avg=0;
		for(int i=0;i<=a1.length-1;i++)
		{
			sum=sum+a1[i];
			avg=sum/a1.length;
		}
		System.out.println(sum);
		System.out.println(avg);
	}
}
