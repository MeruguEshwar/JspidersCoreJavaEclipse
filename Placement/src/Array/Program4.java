/*Diff ways to create an array*/
package Array;

public class Program4 
{
	public static void main(String[] args) 
	{
			int a[]=new int[5];/*Type-1*/
			
			int[] b=new int[3];/* Type-2 */
			
			int c[]=new int[] {10,20,30,40,50};/*Type-3*/
			
			int d[]={10,20,30,40,50};/*Type-4*/
			
			int e[]=new int[2];
			e[0]=10;
			e[1]=20;
			e[2]=30;
	}
}
