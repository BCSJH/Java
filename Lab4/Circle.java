package test;

class Circle {
	
	 final double PI=3.14159;//파이
	 private double radius;
	 /*
	 public Circle(double radius) {
		 this.radius=radius;
		 //이 클래스에 radius가 2개 있으므로
		 //public void Circle(double radius),이것과  static double radius; 이것,
		 //여기서 radius는  public void Circle(double radius) 이것을 의미
	 }
	 */
	 public double Area() {//이건 분명 getarea인데 오타나신거겠지...
		 return PI*radius*radius;
	 }	
	 
	 public double getRadius() {//	 private double radius;을 return해주는 것일뿐
		 return radius;
	 }
	 
	 public void setRadius(double radius) {
		 this.radius=radius;
		 //이 클래스에 radius가 2개 있으므로
		 //public void setRadius(double radius),이것과  static double radius; 이것,
		 //여기서 radius는  public void setRadius(double radius) 이것을 의미
	 }
	 public void showCircle() {//이미 Area에 return을 해서 굳이 쓸필요는 없지만 쓰라고 하셔서...
		 System.out.println("결과: "+Area());
	 }
}
