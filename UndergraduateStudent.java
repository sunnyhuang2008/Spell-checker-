
public class UndergraduateStudent extends Student{

	String Major;
	public UndergraduateStudent(String n, int id, String major){
		this.Name =n;
		this.ID =id;
		this.Major = major;
	}
	public String getMajor(){
		return Major;
	}
	public void setMajor(String major){
		this.Major =major;
	}
	public String toString(){
		String a;
		a="Undergraduate Student "+this.Name+"\n"+"Student ID: "+this.ID+"\n"+"Major: "+Major+"\n"+this.printGrade(this.count)+"\n"+PrintError();;
		return a;
	}
}

