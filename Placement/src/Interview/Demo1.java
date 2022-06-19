//WAP to create a new array list and some colours print it and remove 3rd and color print it 
package Interview;

import java.util.ArrayList;

public class Demo1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("white");
		a1.add("blue");
		a1.add("black");
		a1.add("green");
		a1.add("red");
		
		for(int i=0;i<a1.size()-1;i++)
		{
				System.out.println(a1.get(i));
		}
		a1.remove(2);
		System.out.println(a1);
	}
}
