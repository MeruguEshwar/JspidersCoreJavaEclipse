//WAP to create an integer array and with 5 elements, print 5 elements using for each loop,insert new element @ end of the array
package NewWorkshop;
public class DemoPAck16 
{
	public static void main(String[] args) 
	{	
		int a[]= {1,2,3,4,5};
		printarr(a);
		int b[]=new int[a.length+1];
		copyarr(a,b);
		b[b.length-1]=99;
		printarr(b);
	}
	public static void printarr(int[] arr)
	{
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
	public static void copyarr(int[] oldArr,int[] newArr)
	{
		for(int i=0;i<=oldArr.length-1;i++)
		{
			newArr[i]=oldArr[i];
		}
	}
}
