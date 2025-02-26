package hibernate.relationship.model;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	private String Fname;
	private String mname;
	private String lname;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "StudentName [Fname=" + Fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	
}
