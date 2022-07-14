package assignment11;

public class Student {
	 String sname;
	 int rollno;
	 String dob;
	 int classname;
	 int section;
	
	 Result objresult;  //inject here result	

	public Student(String sname, int rollno, String dob, int classname, int section, Result objresult) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.dob = dob;
		this.classname = classname;
		this.section = section;
		this.objresult = objresult;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + ", dob=" + dob + ", classname=" + classname
				+ ", section=" + section + ", objresult=" + objresult + "]";
	}


	

}
