package homework;
import java.util.Scanner;
abstract public class Hero {

	private String name;
	private String position;
	protected int shot_num;
	protected int gauge;
	private int  life;
	
	//����� ���� �ޱ� ���� Ŭ������ �⺻ ������
	public Hero(String name, int life, int shot_num, String position) {
		this.name=name;
		this.life=life;
		this.shot_num=shot_num;
		this.gauge= gauge=0;//ó�� �ñر� ������ 0
		this.position=position;	
	}

	public int getShot_num() {
		return shot_num;
	}

	//�ñر� ������ �˾ƾߵǰ� 10�� �ö󰡾ߵǹǷ�
	public void setShot_num(int shot_num) {
		this.shot_num = shot_num;
	}

	public int getGauge() {
		return gauge;
	}

	//�ñر� ������ �˾ƾߵǰ� 10�� �ö󰡾ߵǹǷ�
	public void setGauge(int gauge) {
		this.gauge = gauge;
	}
	public void info(){	//���� ���� ��� �Լ�
		System.out.println("����:"+name);
		System.out.println("������:"+position);
		System.out.println("�Ѿ˼�:"+shot_num);
		System.out.println("����:"+life);
		System.out.println("�ñر� ������:"+gauge);
	}
	
	abstract public void menu(Scanner kbd);
}
