package org.jsp.app;

public class Department 
{
	String dName;
	String dHname;
	
	Faculty faculty;

	@Override
	public String toString() 
	{
		return "Department [dName=" + dName + ", dHname=" + dHname + ", faculty=" + faculty + "]";
	}

	public void setdName(String dName) 
	{
		this.dName = dName;
	}

	public void setdHname(String dHname) 
	{
		this.dHname = dHname;
	}

	public void setFaculty(Faculty faculty) 
	{
		this.faculty = faculty;
	}
	
	
}
