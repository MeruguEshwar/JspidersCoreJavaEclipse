//WAP to convert priroty queue to an array and then sort the array
package Interview;

import java.util.PriorityQueue;

public class Demo14 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p1= new PriorityQueue<Integer>();
		
		p1.add(10);
		p1.add(20);
		p1.add(30);
		p1.add(60);
		p1.add(50);
		System.out.println(p1);
	}
}
