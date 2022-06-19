/*WAp to sort an integer array.. bubble sort*/
package Array;
public class program19 
{
	public static void main(String[] args) 
	{
		int[] a1= {67,32,45,89,21};
		int temp = 0;
		for(int c=1;c<=a1.length-1;c++)
		{
			for(int i=0;i<=a1.length-2;i++)
			{
				if(a1[i] > a1[i+1])
				{
					temp=a1[i];
					a1[i]=a1[i+1];
					a1[i+1]=temp;
				}
			System.out.println(a1[i]);
			}
		}
	}
}
