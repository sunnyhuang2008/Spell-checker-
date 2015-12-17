//import java.lang.StringBuilder;
public class Student {

	String Name;
	Integer ID; 
	int grade;
	int count;
	String [] error = new String [10000];
	
	public Student(String n, int id){
		this.Name = n;
		this.ID = id;
	}
	public Student(){
	  
	}
		
	public String getName(){
		return Name;
	}
	public void setName(String n){
		this.Name = n;
	}
	public String getIDNumber(){
	    String a =ID.toString();
	    return a;
	}
	public void setIDNumber(int id){
		this.ID = id;
	}
	public String printInfo(){
		String a ="Name: "+this.Name+"\n"+"ID: "+this.ID;
		return a;
	}
	public void setGrade (int a){
		this.grade=a;
	}
	public void setCount (int a){
		this.count = a;
	}
	public void setError(String []a){
		error = a;
	}
	public String PrintError(){
		String c="";
		for(int j =0;j<=this.count-1; j++){
		c+= "("+(j+1)+")"+" "+error[j]+"\n";
		}
		return c;
		
	}	
	public String printGrade(int count){
		String a="Received a score of "+this.grade+" with "+count+" misspelled words: ";
		return a;
	}
	public String toString(){
		String a= this.printInfo()+"\n"+this.printGrade(this.count)+"\n"+PrintError();
		return a;
	}
}
