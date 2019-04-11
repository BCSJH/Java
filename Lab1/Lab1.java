package test;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
		System.out.println("================");
		System.out.println("201704007 김정현");
		System.out.println("================");
	    System.out.print("이름을 입력해주세요: ");//안내문
	    Scanner user = new Scanner(System.in);
	    //수고를 덜기 위해 미리 user에 입력하는 것이라고 정해주었다.
	    //키보드 입력을 위한 scanner
	    String name = user.nextLine();//문자열을 입력받는다.
	    
	    System.out.print(name+"님 학과를 입력해주세요: ");//안내문
	    String mager = user.nextLine();//문자열을 입력받는다.
	    
	    System.out.println("------점수를 입력해주세요----------");//칸을 불리
	    
	    System.out.print("국어: ");//안내문
	    int K = user.nextInt();//국어의 값을 입력받는다
	    
	    System.out.print("영어: ");//안내문
	    int E = user.nextInt();//영어의 값을 입력받는다
	    
	    System.out.print("수학: ");//안내문
	    int M = user.nextInt();//수학의 값을 입력받는다
	    
	    System.out.println("--------------결과-----------");
	    System.out.println("이름: "+name+", 학과: "+mager);
	    System.out.println("총점: "+(K+E+M));//결과출력
	    System.out.print("평균: ");
	    System.out.printf("%.2f" ,(K+E+M)/3F);//결과출력, F을 추가 안하면 오류가 뜬다.
	}
	
}
