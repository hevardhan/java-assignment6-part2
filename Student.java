package assignment6_part2;

public class Student {

	private String name;
	private int rollNumber;
	private double mark1, mark2, mark3, mark4, mark5;
	
	
	public Student(String name, int rollNumber, double mark1, double mark2, double mark3, double mark4, double mark5) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
		this.mark5 = mark5;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public double getMark1() {
		return mark1;
	}
	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}
	public double getMark2() {
		return mark2;
	}
	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	public double getMark3() {
		return mark3;
	}
	public void setMark3(double mark3) {
		this.mark3 = mark3;
	}
	public double getMark4() {
		return mark4;
	}
	public void setMark4(double mark4) {
		this.mark4 = mark4;
	}
	public double getMark5() {
		return mark5;
	}
	public void setMark5(double mark5) {
		this.mark5 = mark5;
	}

	

}