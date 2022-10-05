package p2;

import p1.City;

public class Student extends City
{
	protected int sid;
	protected String sname;
	protected City c;
	
	protected int getSid() {
		return sid;
	}
	protected void setSid(int sid) {
		this.sid = sid;
	}
	protected String getSname() {
		return sname;
	}
	protected void setSname(String sname) {
		this.sname = sname;
	}
	protected City getC() {
		return c;
	}
	protected void setC(City c) {
		this.c = c;
	}
	

}
