package ����;
import java.util.Scanner;
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �ϳ��� �Է��� �޾� �������� Ȯ���ϴ� ���α׷�
		System.out.println("=============");
		System.out.println("201704007 ������");
		System.out.println("=============");
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("����ڸ� �ϳ��� �Է����ּ���.");//�ȳ���
		String str=scanner.nextLine();//�Է�
		char ch=str.charAt(0);//ù��° �κи� �ν�
		
		if(str.length()!=1)//�ѱ��ڰ� �ƴ� ���
		{
			System.out.println(str+"�� ���� �տ��ִ� 1���ڸ� �νĵ˴ϴ�.");
		}
		else
		{}
		
		if(ch>='A'&&ch<='Z')//���ĺ� �빮�ڸ� �Է��������
			System.out.println(ch+"�� �빮���Դϴ�.");
		else if(ch>='a'&&ch<='z')//���ĺ� �ҹ��ڸ� �Է����� ��� 
		System.out.println(ch+"�� �ҹ����Դϴ�.");
		
		else//���ĺ��� �Է��Ѱ� �ƴҰ��
			System.out.println(ch+"�� "+"���ĺ��� �ƴմϴ�.");
			
	}

}
