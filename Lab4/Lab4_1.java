package test;
import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================");
		System.out.println("201704007 ������");
		System.out.println("================");
		
	    Scanner user = new Scanner(System.in);//�Է��� ����
	    Circle circle = new Circle();//�޼��� �ҷ�����
	   
		System.out.println("�������� �Է��ϼ��� : ");
		circle.setRadius(user.nextDouble());//�Է�	�ޱ�
		
		System.out.println("������: "+circle.getRadius());//������...
		circle.showCircle();
	}

}
