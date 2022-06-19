// WAP to create an integer array and print all the element using for each loop
package NewWorkshop;
public class DemoPack9 
{
	public static void main(String[] args) 
	{
		int nani[] = new int[]{1,2,3,4,5};
		
		for(int i=0;i<=nani.length-1;i++)
		{
			System.out.println(nani[i]);
		}
		System.out.println("------ForEachLoop------");
		for(int k:nani)//Using for each loop
		{
			System.out.println(k);
		}
	}
}
