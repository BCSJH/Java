package homework;
import java.util.Scanner;
public class Tracer extends Hero implements Attack{
	public Tracer() {
		super("Ʈ���̼�",150,40,"������");
	}
	public void menu(Scanner kbd) {
		int i;
		
		info();//������ ���� ���� ���
		
		do {
			System.out.println("���� �Ѿ� �� "+getShot_num()+"�Դϴ�.");
			System.out.println("1.���� ����  3.�ñر�  0.������");
			i=kbd.nextInt();
			if(i==1)
				LeftclickAttack();
			else if(i==3)
				Ultimate();
			else if(i==0)
			{
				System.out.println("����");
				System.out.println("���� �������� ���ư��ϴ�.");
			}
			else
				System.out.println("�߸� ����");
			kbd.nextLine();//���۰�����
		}while(i!=0);
	}
	public void LeftclickAttack() {
		shot_num-=4;
		gauge+=10;
		if(gauge>=100)//�ñر� �������� 100�̻��� ��
			gauge=100;
		if(shot_num<=0) {//�Ѿ��� ���� �� �ڵ� ����
			System.out.println("�Ѿ��� �����ϴ�. �����մϴ�.");
			shot_num=40;
		}
	}
	public void Ultimate() {//�ñر� ���
		if(gauge==100) {
			System.out.println("��ź �޾�~");
			gauge=0;
		}
		else if(gauge<100)//�ñر� �������� �غ���� �ʾ��� ��
			System.out.println("�ñر��� �������� ���� "+getGauge()+"�Դϴ�.");
		
	}


}