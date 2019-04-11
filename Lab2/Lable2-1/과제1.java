package 과제;
import java.util.Scanner;
public class 과제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//영문자 하나만 입력을 받아 문자인지 확인하는 프로그램
		System.out.println("=============");
		System.out.println("201704007 김정현");
		System.out.println("=============");
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("영어문자를 하나만 입력해주세요.");//안내문
		String str=scanner.nextLine();//입력
		char ch=str.charAt(0);//첫번째 부분만 인식
		
		if(str.length()!=1)//한글자가 아닐 경우
		{
			System.out.println(str+"중 가장 앞에있는 1문자만 인식됩니다.");
		}
		else
		{}
		
		if(ch>='A'&&ch<='Z')//알파벳 대문자를 입력했을경우
			System.out.println(ch+"은 대문자입니다.");
		else if(ch>='a'&&ch<='z')//알파벳 소문자를 입력했을 경우 
		System.out.println(ch+"은 소문자입니다.");
		
		else//알파벳을 입력한게 아닐경우
			System.out.println(ch+"는 "+"알파벳이 아닙니다.");
			
	}

}
