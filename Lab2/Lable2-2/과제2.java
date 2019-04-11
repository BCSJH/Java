/**
 * 
 */
package 과제;

import java.util.Scanner;

/**
 * @author jeonghyun
 *
 */
public class 과제2 {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
			//생년 월일 입력받아 태어난 계절 찾기
		System.out.println("=============");
		System.out.println("201704007 김정현");
		System.out.println("=============");
		System.out.println("생년월일을 입력해주세요(ex:970101)");
		Scanner scanner = new Scanner(System.in);
		String str=scanner.nextLine();//입력받음
		

		int length =str.length();//입력받은 생년월일의 길이를 확인하기 위해
		
		if(length==6)//입력한 생년월일의 길이가 6일때 실행
		{
			str =str.substring(2,4);//태어난 월을 통해 계절을 알아내기 위함
			int month = Integer.parseInt(str);

		switch(month) {
		case 12: case 1: case 2://겨움
			System.out.println("겨울에 태어나셨군요");
			break;
		
		case 3: case 4: case 5://봄
			System.out.println("봄에 태어나셨군요");
			break;
			
		case 6: case 7: case 8://여름
			System.out.println("여름에 태어나셨군요");
			break;
		case 9: case 10: case 11://가을
			System.out.println("가을에 태어나셨군요");
			break;
			}		
		}
		else//잘못입력했을 때
			System.out.println("월 형식이 잘못 되었습니다.");	
			
	}
	
}
