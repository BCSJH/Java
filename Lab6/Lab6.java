package homework;
import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("학번 : 201704007");
		System.out.println("이름 : 김정현");
		System.out.println("==============");
		Scanner kbd = new Scanner(System.in);
		int user;//영웅선택을 위한 변수
		
		AA://되돌아가기
		do {
		System.out.println("영웅을 선택해주세요");//영웅 선택
		System.out.println("1.솔져  2.트레이서  0.끝내기");
		user=kbd.nextInt();
		Soldier s = new Soldier();
		Tracer t = new Tracer();
		
		if(user==1)//솔져
			s.menu(kbd);
		else if(user==2)//트레이서
			t.menu(kbd);
		else if(user==0)//종료
			System.out.println("종료");
		else//예외
		{
			System.out.println("잘못 선택하셨습니다.");
			kbd.nextLine();//버퍼값 제거
			continue AA;//다시 입력받게 하기 위해
		}
		}while(user!=0);
	}

}
