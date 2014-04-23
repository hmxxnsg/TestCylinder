
class Circle {
	private double radius;
	Circle(){		
	}
	Circle(double r){
		radius = r;
	}
	double getArea(){
		return Math.PI*radius*radius;
	}
	double getPerimeter(){
		return 2*Math.PI*radius;
	}
	void disp(){
		System.out.println("Radius is: "+radius);
		System.out.println("Perimeter is: "+getPerimeter());
		System.out.println("Area is: "+ getArea());
	}	
}

class Cylinder extends Circle{
	private double height;
	Cylinder(double r, double h){
		super(r);
		height = h;
	}
	public double getVolume(){
		return getArea()*height;
	}
	public void dispVol(){
		System.out.println("Volume = "+ getVolume());
	}
}
public class TestCylinder {
	public static void main(String[] args){
		Circle c1 = new Circle(10.0);
		c1.disp();
		Cylinder cy1 = new Cylinder(5.0,10.0);
		cy1.disp(); //father's method
		cy1.dispVol(); 
	}
}
