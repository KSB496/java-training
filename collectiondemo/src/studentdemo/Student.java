package studentdemo;

public class Student {
	
	private int rollNo;
	private String stuName;
	private String StuSubject;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSubject() {
		return StuSubject;
	}
	public void setStuSubject(String stuSubject) {
		StuSubject = stuSubject;
	}
	public Student(int rollNo, String stuName, String stuSubject) {
		super();
		this.rollNo = rollNo;
		this.stuName = stuName;
		StuSubject = stuSubject;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName + ", StuSubject=" + StuSubject + "]";
	}
	
}
