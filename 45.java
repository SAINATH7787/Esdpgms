/*java program to find the area of a) Circle b) Rectangle c) Square d) trapezoid e)rhombus f) triangle*/

class Area{
	double circle(double radius){
		return radius*radius*Math.PI;
	}
	double triangle(double height, double base){
		return 0.5*height*base;
	}
	double square(double side){
		return side*side;
	}
	double rectangle(double length, double breadth){
		return length*breadth;
	}
	double rhombus(double base, double height){
		return base * height;
	}
	double trapezoid(double base1, double base2, double height){
		return ((base1 + base2)/2)*height;
	}
	
	
	public static void main(String args[]){
		Area obj = new Area();
		System.out.println("Area of Circle: "+obj.circle(10));
		System.out.println("Area of triangle: "+obj.triangle(10,10));
		System.out.println("Area of square: "+obj.square(10));
		System.out.println("Area of rectangle: "+obj.rectangle(10, 3));
		System.out.println("Area of rhombus: "+obj.rhombus(6, 8));
		System.out.println("Area of trapezoid: "+obj.trapezoid(2,3,4));
	}
}