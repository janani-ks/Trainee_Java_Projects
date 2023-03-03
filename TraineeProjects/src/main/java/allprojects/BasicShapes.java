package allprojects;

public class BasicShapes extends Shape{
	double side;
    double base;
    double height;
    double length;
    double width;
    double radius;
    double per;
    double rad;
    BasicShapes(double s,double b,double h){
        this.side=s;
        this.base=b;
        this.height=h;
    } 
    BasicShapes(double l,double w){
        this.length=l;
        this.width=w;
    }
    BasicShapes(double r){
        this.radius=r;
    }
    @Override
	double perimeter(int choice) {
    	switch(choice) {
    	case 1:
          per = side+base+height;
          break;
    	case 2:
    	  per = 2*(length+width);
    	  break;
    	case 3:
    	  per = 2*3.14*radius;
    	  break;
    	default:
    	  per = 0;
    	  break;		
    }
    	return per;
    }
    @Override
	double area(int choice) {
    	switch(choice) {
    	case 1:
    	  rad = 0.5*base*height;
          break;
    	case 2:
    	  rad = length*width;
    	  break;
    	case 3:
    	  rad = 3.14*radius*radius;
    	  break;
    	default:
    	  rad = 0;
    	  break;		
    }
    	return rad;
    }
	
}
