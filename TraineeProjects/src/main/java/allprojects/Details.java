package allprojects;

public class Details {
	private String studentname;
    private String gradelevel;
    private double gpa;
    Details(String sn,String gl,double g){
        this.studentname = sn;
        this.gradelevel = gl;
        this.gpa = g;
    }
    void update(double g){
        this.gpa = g;
    }
    String print(){
        return studentname+" has a GPA as "+gpa;
    }

}
