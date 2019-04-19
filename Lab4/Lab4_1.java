package test;
import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================");
		System.out.println("201704007 김정현");
		System.out.println("================");
		
	    Scanner user = new Scanner(System.in);//입력을 위함
	    Circle circle = new Circle();//메서드 불러오기
	   
		System.out.println("반지름을 입력하세요 : ");
		circle.setRadius(user.nextDouble());//입력	받기
		
		System.out.println("반지름: "+circle.getRadius());//반지름...
		circle.showCircle();
	}

}
