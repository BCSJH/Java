package homework;
import java.util.Scanner;
public class Tracer extends Hero implements Attack{
	public Tracer() {
		super("트레이서",150,40,"공격형");
	}
	public void menu(Scanner kbd) {
		int i;
		
		info();//영웅에 대한 정보 출력
		
		do {
			System.out.println("남은 총알 수 "+getShot_num()+"입니다.");
			System.out.println("1.왼쪽 공격  3.궁극기  0.끝내기");
			i=kbd.nextInt();
			if(i==1)
				LeftclickAttack();
			else if(i==3)
				Ultimate();
			else if(i==0)
			{
				System.out.println("종료");
				System.out.println("영웅 선택으로 돌아갑니다.");
			}
			else
				System.out.println("잘못 선택");
			kbd.nextLine();//버퍼값제거
		}while(i!=0);
	}
	public void LeftclickAttack() {
		shot_num-=4;
		gauge+=10;
		if(gauge>=100)//궁극기 게이지가 100이상일 때
			gauge=100;
		if(shot_num<=0) {//총알이 없을 때 자동 장전
			System.out.println("총알이 없습니다. 장전합니다.");
			shot_num=40;
		}
	}
	public void Ultimate() {//궁극기 사용
		if(gauge==100) {
			System.out.println("폭탄 받아~");
			gauge=0;
		}
		else if(gauge<100)//궁극기 게이지가 준비되지 않았을 때
			System.out.println("궁극기의 게이지가 아직 "+getGauge()+"입니다.");
		
	}


}