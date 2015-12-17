
public class HighSchoolStudent extends Student{

	String school;
	
	public HighSchoolStudent(String n, int id, String schoolName){
		this.Name = n;
		this.ID = id;
		this.school = schoolName;
	}
	public String getNameofSchool(){
		return school;
	}
	public void setNameofSchool(String schoolName){
		this.school = schoolName;
	}
	public String toString(){
		String a;
		a= "High School Student "+this.Name+"\n"+"Student ID: "+this.ID+"\n"+"Name of School: "+school+"\n"+this.printGrade(this.count)+"\n"+PrintError();
		return a;
	}
}
