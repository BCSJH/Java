package homework;
import java.util.Scanner;
abstract public class Hero {

	private String name;
	private String position;
	protected int shot_num;
	protected int gauge;
	private int  life;
	
	//히어로 정보 받기 위한 클래스의 기본 생성자
	public Hero(String name, int life, int shot_num, String position) {
		this.name=name;
		this.life=life;
		this.shot_num=shot_num;
		this.gauge= gauge=0;//처음 궁극기 게이지 0
		this.position=position;	
	}

	public int getShot_num() {
		return shot_num;
	}

	//궁극기 게이지 알아야되고 10씩 올라가야되므로
	public void setShot_num(int shot_num) {
		this.shot_num = shot_num;
	}

	public int getGauge() {
		return gauge;
	}

	//궁극기 게이지 알아야되고 10씩 올라가야되므로
	public void setGauge(int gauge) {
		this.gauge = gauge;
	}
	public void info(){	//영웅 정보 출력 함수
		System.out.println("영웅:"+name);
		System.out.println("포지션:"+position);
		System.out.println("총알수:"+shot_num);
		System.out.println("생명:"+life);
		System.out.println("궁극기 게이지:"+gauge);
	}
	
	abstract public void menu(Scanner kbd);
}
