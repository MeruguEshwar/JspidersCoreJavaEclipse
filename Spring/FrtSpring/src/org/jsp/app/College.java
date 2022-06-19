package org.jsp.app;

public class College 
{
	String cname;
	String cid;
	
	Department department;

	@Override
	public String toString() {
		return "College [cname=" + cname + ", cid=" + cid + ", department=" + department + "]";
	}

	public void setCname(String cname) 
	{
		this.cname = cname;
	}

	public void setCid(String cid) 
	{
		this.cid = cid;
	}

	public void setDepartment(Department department) 
	{
		this.department = department;
	}
	
	
}
