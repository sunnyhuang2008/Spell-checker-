
public class GraduateStudent extends Student {

	String Major;
	String Advisor;
	public GraduateStudent(String n, int id, String major, String advisor){
		this.Name = n;
		this.ID = id;
		this.Major =major;
		this.Advisor = advisor;
	}
	public String getMajor(){
		return this.Major;
	}
	public void setMajor(String major){
		this.Major= major;
	}
	public String getAdvisor(){
		return this.Advisor;
	}
	public void setAdvisor(String advisor){
		this.Advisor = advisor;
	}
	public String toString(){
		String a;
		a="Graduate Student "+this.Name+"\n"+"Student ID: "+this.ID+"\n"+"Major: "+Major+"\n"+"Advisor: "+Advisor+"\n"+this.printGrade(this.count)+"\n"+PrintError();;
		return a;
	}
}
