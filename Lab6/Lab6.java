package homework;
import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============");
		System.out.println("�й� : 201704007");
		System.out.println("�̸� : ������");
		System.out.println("==============");
		Scanner kbd = new Scanner(System.in);
		int user;//���������� ���� ����
		
		AA://�ǵ��ư���
		do {
		System.out.println("������ �������ּ���");//���� ����
		System.out.println("1.����  2.Ʈ���̼�  0.������");
		user=kbd.nextInt();
		Soldier s = new Soldier();
		Tracer t = new Tracer();
		
		if(user==1)//����
			s.menu(kbd);
		else if(user==2)//Ʈ���̼�
			t.menu(kbd);
		else if(user==0)//����
			System.out.println("����");
		else//����
		{
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			kbd.nextLine();//���۰� ����
			continue AA;//�ٽ� �Է¹ް� �ϱ� ����
		}
		}while(user!=0);
	}

}
