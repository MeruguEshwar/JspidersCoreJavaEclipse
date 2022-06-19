//WAP to create an double array and print in reverse order
package NewWorkshop;
public class DempPack10 
{
	public static void main(String[] args) 
	{
		double a1[] = new double[] {1.1,2.2,3.3,4.4,5.5};
		for(double m:a1)
		{
			System.out.println(m);
		}
		System.out.println("-----reverse order-----");
		for(int i=a1.length-1;i>=0;i--)
		{
			System.out.println(a1[i]);
		}
	}
}
