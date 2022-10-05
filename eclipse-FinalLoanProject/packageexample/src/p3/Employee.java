package p3;

import p1.City;
import p2.Student;

public class Employee extends City
{
	protected int eid;
	protected String ename;
	protected City ci;
	protected int getEid() {
		return eid;
	}
	protected void setEid(int eid) {
		this.eid = eid;
	}
	protected String getEname() {
		return ename;
	}
	protected void setEname(String ename) {
		this.ename = ename;
	}
	protected City getCi() {
		return ci;
	}
	protected void setCi(City ci) {
		this.ci = ci;
	}
	

}
