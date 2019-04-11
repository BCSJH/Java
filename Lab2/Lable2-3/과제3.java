/**
 * 
 */
package 과제;

import java.util.Scanner;

/**
 * @author jeonghyun
 *
 */
public class 과제3 {
	public static void main(String[] args) {
		
// 1부터 9 사이의 값을 입력 받아 알파벳으로 삼각형 그리기 
		System.out.println("=============");
		System.out.println("201704007 김정현");
		System.out.println("=============");
		int a =0;//do while문 돌리기 위해 처음에 입력받아야하는 a값을 0으로 지정
		
		do {
			System.out.printf("1~9 숫자를 입력해주세요! (끝내려면 0)");//안내문
			Scanner scanner = new Scanner(System.in);
			a=scanner.nextInt();//알파벳입력 받기
			if(a>=0&&a<10)//1~9까지의 값
			{
			
			for (int i=0, count=1;i<a;++i,count+=2) {
				char ch='a';//피라미드 첫번째 시작은 A
				for(int j=0;j<a-i;j++) {//피라미드를 만들기 위해 스페이스의 갯수
					System.out.print(" ");
				}
				for(int j=0;j<count;j++) {//증가할때마다 알파벳 출력
					if(ch>'Z') {//Z보다 클 경우를 넣어줌
						ch='A';
					}
					System.out.print(ch++);//알파벳 순서대로 출력
				}
			
			System.out.println();//다음 줄로 넘어가기 위함
				}
			}
			else//잘못입력했을때
			{
			System.out.println("잘못입력했습니다.");
			scanner.nextLine();//버퍼값 제거
			}
		
		}while(a!=0);//0입력하면 종료
			System.out.println("종료");

}
}
