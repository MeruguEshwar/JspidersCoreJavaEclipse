package org.jsp.app;

public class University 
{
	String uName;
	String uAddress;
	College college;

	@Override
	public String toString() {
		return "University [uName=" + uName + ", uAddress=" + uAddress + ", college=" + college + "]";
	}

	public void setuName(String uName) 
	{
		this.uName = uName;
	}

	public void setuAddress(String uAddress) 
	{
		this.uAddress = uAddress;
	}

	public void setCollege(College college) 
	{
		this.college = college;
	}
	
}
