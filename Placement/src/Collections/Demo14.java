//WAP to retrive and remove the frt element of the priority queue of doubles
package Collections;

import java.util.PriorityQueue;

public class Demo14 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		p1.add(32);
		p1.add(11);
		p1.add(21);
		p1.add(41);
		p1.add(51);
		System.out.println(p1.size());
		System.out.println(p1.peek());//To retive the values
		System.out.println(p1.poll());//To retrive and rmove
		//System.out.println(p1.size());
	}
}
