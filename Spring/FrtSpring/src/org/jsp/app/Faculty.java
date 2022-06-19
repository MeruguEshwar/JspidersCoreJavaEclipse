package org.jsp.app;

public class Faculty 
{
	String fName;
	String fId;
	@Override
	public String toString() {
		return "Faculty [fName=" + fName + ", fId=" + fId + "]";
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setfId(String fId) {
		this.fId = fId;
	}
	
	
}
