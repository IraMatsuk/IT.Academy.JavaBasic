package student;

import java.io.Serializable;

public class Student implements Serializable{
	
	/*Student(String name, double mark){
		this.name = name;
		this.mark = mark;
	}*/
	
	private String name;
	private double mark;
		
	public void setName(String name) {
		this.name = name;	
	}
	
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public double getMark() {
		return this.mark;
	}
}
