package test;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
		System.out.println("================");
		System.out.println("201704007 김정현");
		System.out.println("================");
	      System.out.println("돈을 입력해주세요: ");//안내문
	      Scanner user = new Scanner(System.in);
	      //수고를 덜기 위해 미리 user에 입력하는 것이라고 정해두었다.
	      //키보드 입력을 위한 scanner
	      int money = user.nextInt();//돈의 값인 문자열을 입력받는다
	      
	      System.out.println("============결과============");//칸을 분리
	      
	      //각각의 값을 구하는 식
	      int M50000 = (money/50000);//5만원
	      int M10000 = ((money%50000)/10000);//1만원
	      int M5000 = ((money%50000%10000)/5000);//5천원
	      int M1000 = ((money%50000%10000%5000)/1000);//1천원
	      int M500 = ((money%50000%10000%5000%1000)/500);//500원
	      int M100 = ((money%50000%10000%5000%1000%500)/100);//100원
	      int M=(money%100);//나머지 값이기 때문에 %로 넣어주었다
	      
	      //결과값 출력
	      System.out.println("50000원: "+M50000+"장");
	      System.out.println("10000원: "+M10000+"장");
	      System.out.println("5000원: "+M5000+"장");
	      System.out.println("1000원: "+M1000+"장");
	      System.out.println("500원: "+M500+"개");
	      System.out.println("100원: "+M100+"개");
	      System.out.println("기타: "+M+"원");
	}
}
