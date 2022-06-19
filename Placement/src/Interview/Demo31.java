//WAP to create ArrayList and in the ArrayList store the user defined objects or reference variable
package Interview;

import java.util.ArrayList;
import java.util.List;

public class Demo31 
{
	int rollno;
	String student;
	public Demo31(int rollno,String student)
	{
		this.rollno=rollno;
		this.student=student;
	}
	
	@Override
	public String toString() {
		return "Demo31 [rollno=" + rollno + ", student=" + student + "]";
	}
	
	public static void main(String[] args) 
	{
		Demo31 demo=new Demo31(1,"NANi");
		Demo31 demo1=new Demo31(2,"Chintu");
		Demo31 demo2=new Demo31(3,"Rakes");
		Demo31 demo3=new Demo31(4,"Sai");
		
		ArrayList<Demo31> a1 = new ArrayList<Demo31>();
		a1.add(demo);
		a1.add(demo1);
		a1.add(demo2);
		a1.add(demo3);
		
		System.out.println(a1);
		
		System.out.println("After extracting the portion");
		List<Demo31> sublist = a1.subList(1,3);
		
		for(Demo31 Demo : sublist)
		{
			System.out.println(Demo);
		}
		
	}
}
