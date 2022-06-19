//WAP to create a vector and inseert some elements,print all the elements using toString
//ask the user to insert new element at the begining of vector or at the end of the vector
package Collections;

import java.util.Scanner;
import java.util.Vector;

public class Demo19 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		System.out.println("Press 1 : to insert element @ the begining");
		System.out.println("Press 2 : to insert element @ the End");
		int choice=scanner.nextInt();
		System.out.println("Enter new element");
		int ele=scanner.nextInt();
		if(choice==1)
		{
			v1.add(0,ele);
		}
		else
		{
			v1.add(ele);
		}
		System.out.println(v1);
	}
}
