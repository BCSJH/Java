package test;

class Circle {
	
	 final double PI=3.14159;//����
	 private double radius;
	 /*
	 public Circle(double radius) {
		 this.radius=radius;
		 //�� Ŭ������ radius�� 2�� �����Ƿ�
		 //public void Circle(double radius),�̰Ͱ�  static double radius; �̰�,
		 //���⼭ radius��  public void Circle(double radius) �̰��� �ǹ�
	 }
	 */
	 public double Area() {//�̰� �и� getarea�ε� ��Ÿ���ŰŰ���...
		 return PI*radius*radius;
	 }	
	 
	 public double getRadius() {//	 private double radius;�� return���ִ� ���ϻ�
		 return radius;
	 }
	 
	 public void setRadius(double radius) {
		 this.radius=radius;
		 //�� Ŭ������ radius�� 2�� �����Ƿ�
		 //public void setRadius(double radius),�̰Ͱ�  static double radius; �̰�,
		 //���⼭ radius��  public void setRadius(double radius) �̰��� �ǹ�
	 }
	 public void showCircle() {//�̹� Area�� return�� �ؼ� ���� ���ʿ�� ������ ����� �ϼż�...
		 System.out.println("���: "+Area());
	 }
}
