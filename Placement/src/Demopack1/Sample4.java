package Demopack1;
/* Compare string methods */
public class Sample4 
{
	public static void main(String[] args) 
	{
		String s1 = "monday";
		String s2 = "Monday";
		
		System.out.println(s1==s2);/* object address is compared */
		
		/* 2nd way */
		String s3 = "monday";
		String s4 = "Monday";
		System.out.println(s3.equals(s4));/* Object date is compared , but case is Considered */
		
		/* 3rd way */
		String s5 = "monday";
		String s6 = "Monday";
		System.out.println(s5.equalsIgnoreCase(s6));/* Object data is compared but case is not considered */
		
		/* 4th way */
		String s7 = "monday";
		String s8 = "Monday";
		System.out.println(s7.compareTo(s8));
		
		/*5th way */
		String s9 = "monday";
		String s10 = "Monday";
		System.out.println(s9.compareToIgnoreCase(s10));
	}
}
