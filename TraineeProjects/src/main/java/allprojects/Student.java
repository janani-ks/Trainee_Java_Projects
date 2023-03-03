package allprojects;

class Student{
	private String name;
	private int age;
	private double gpa;
	Student(String n,int a,double g){
		this.name = n;
		this.age = a;
		this.gpa = g;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	double getGpa() {
		return gpa;
	}
}