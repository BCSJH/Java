package Lab3;

import java.util.Scanner;

public class Lab333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է� �ް� ���� ������ �Է��ϰ� �װ��� �迭�� �Է� �� �����Ͽ�
		//�ڿ��� ���� ū ���� ���� �� ã�� 
		System.out.println("===============");
		System.out.println("201704007 ������");
		System.out.println("===============");

		Scanner in = new Scanner(System.in);//�Է¹ޱ� ���� �ʿ���
		int Number;//�Է¹ް���� ���� �Է��ϱ� ���� ����
		int max=0, min=0;//���� ū���� ���� ���� �����ϱ� ����
		
		System.out.println("�Է¹ް���� ������ �Է� :");//�ȳ���
			Number=in.nextInt();//����ڷκ��� �Է¹ޱ�
			while(Number<=0)//0������ ���� �Է����� ���
			{
				in.nextLine();//���۰� ����
				System.out.println("�߸��� ���Դϴ�. �ٽ� �Է����ּ���.");
				System.out.println("�Է��� �л��� ���� �Է����ּ���");
				Number=in.nextInt();
			}
			int Number_user[]=new int[Number];
			//�Է¹��� ����ŭ �Է��� ���� ������ �迭ũ�� �����

			System.out.println(Number+"���� ������ �Է��� �ּ���.");
			for(int i=0;i<Number;i++) {
				//�Է� �ް� ���� ����ŭ ���� �Է��ϰ� �迭�� ����
				System.out.print((i+1)+" : ");
				//�迭�� 0���� ���������� �Է��ϴ� ���� 1���� ��µǾ� �ϹǷ� +1����
				Number_user[i]=in.nextInt();//�Է¹ޱ�
			}
				//���� ���ϱ� ���� ���� ����
				min=Number_user[0];
				max=Number_user[0];
				
			for(int i=0;i<Number;i++)
			{
				//����
				if(Number_user[i]>max) {
					max=Number_user[i];
				}
				else if(Number_user[i]<min) {
					min=Number_user[i];
				}
				else//����
					System.out.print("");
			}
			//���
			System.out.println("���� ���� �� : " + min);
			System.out.println("���� ū �� : " + max);
		}
}
